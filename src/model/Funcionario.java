package model;
/**Classe responsavel por criar o funcionário
 * @author fcorrea
 * @sice 17/02/2020
 * @version 0.1
 */
public class Funcionario {
	
//	Criação das variaveis
	
	private String nome;
	private String cpf;
	private double salario;
	
//	Construtor vazio
	public Funcionario() {
		System.out.println("Funcionário criado!");
	}
	
//	Construtor com parametro
	public Funcionario(String nome, String cpf, double salario) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
//	gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void exibi () {
		
		System.out.println("Nome do funcionário: " + nome);
		System.out.println("CPF do funcionário: " + cpf);
		System.out.println("Salario do funcioário: " + salario);
		
	}
	
	
}
