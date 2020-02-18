package model;

/**
 * Crianção do Funcionário Professor
 * @author fcorrea
 * @since 17/02/2020
 * @version 0.1
 */

public class Professor extends Funcionario {

//	Construtor vazio
	public Professor() {
		System.out.println("Professor criado!");
	}

//	gets e sets
	public Professor(String materia) {
		this.materia = materia;
	}

	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

//	Metodo de exibição
	public void exibiMateria() {
		super.exibi();
		System.out.println("Matéria do professor: " + materia);

	}

}
