package model;

public class Aluno {
	
	private String matricula;
	private String nome;
	private Data dataDoNascimento;
	private char sexo;

	public Aluno() {
		
	}
	
	public Aluno(String matricula, String nome, Data dataDoNascimento, char sexo) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.setDataDoNascimento(dataDoNascimento);
		this.sexo = sexo;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Data getDataDoNascimento() {
		return dataDoNascimento;
	}

	public void setDataDoNascimento(Data dataDoNascimento) {
		this.dataDoNascimento = dataDoNascimento;
	}

}
