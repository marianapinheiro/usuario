package teste2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Usuario implements Comparable<Usuario> //Classe Usuário estende da class Comparable
{private String nome;
private String cpf;
private String dataNascimento;
 
public Usuario(String nome, String cpf, String dataNascimento){ // criando o construtor
this.nome = nome;
this.cpf = cpf;
this.dataNascimento = dataNascimento; } // associando os dados pelo construtor
 
public String getNome() {     
return nome;}
                                                     // get toda vez que este método for verificar algum campo ou atributo
public String getCpf() {
return cpf;}
 
public String getDataNascimento() {
return dataNascimento; }
 
@Override // reemplementação do  método "compareTo"
public int compareTo(Usuario usuario) {
 
int result = this.nome.toLowerCase().compareTo(usuario.nome.toLowerCase());
//verifica se o nome esta com letra minúscula para não da erro na ordenação
return result; }
 
public static void main(String[] args) {
//Adicionar dados Default á Lista
ArrayList<Usuario> usuariosList = new ArrayList<>(); //criando a lista com dois usuários na memoria
Usuario dadosUsuario1 = new Usuario("Joao", "123.456.789-10", "11/10/1980");
usuariosList.add(dadosUsuario1);
 
Usuario dadosUsuario2 = new Usuario("Pedro", "123.478.342-12", "14/05/1998");
usuariosList.add(dadosUsuario2);
 
 
//Inicialização das variáveis locais
String nomeInput = null;
String CPFInput = null;
String dataNascimentoInput = null;
 
Scanner linha = new Scanner(System.in); // entrada de dados
System.out.println("BEM VINDO CADASTRO DE USUÁRIO");
System.out.println("Digite os dados: "+"\nNome ");
nomeInput = linha.nextLine();
System.out.println("CPF: ");
CPFInput = linha.nextLine();
System.out.println("Data Nascimento:");
dataNascimentoInput = linha.nextLine();
 
if(nomeInput == null || nomeInput.equals("")){
System.out.println("Nome vazia. É necessário informar um nome válido.");
System.out.println("Nome:");
nomeInput = linha.nextLine();
}
if(CPFInput == null || CPFInput.equals("")){
System.out.println("CPF vazia. É necessário informar um CPF válido.");
System.out.println("CPF:");
CPFInput = linha.nextLine();
}
if(dataNascimentoInput == null || dataNascimentoInput.equals("")){
System.out.println("Data vazia. É necessário informar uma data válida.");
System.out.println("Data Nascimento:");
dataNascimentoInput = linha.nextLine();
}
Usuario dadosUsuarioInput = new Usuario(nomeInput, CPFInput, dataNascimentoInput);
usuariosList.add(dadosUsuarioInput);
Collections.sort(usuariosList);
System.out.println("\nUsuarios Ordenados:");
for (Usuario u: usuariosList) {
System.out.println("Usuario: "+u.getNome()+", CPF: "+u.getCpf()+" ,Data de Nascimento: "+u.getDataNascimento());
}
} }