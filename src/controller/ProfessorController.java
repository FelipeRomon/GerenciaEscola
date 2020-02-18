package controller;
/**
 * @author fcorrea
 * @sice 17/02/2020
 * @version 0.1
 */
import model.Professor;

public class ProfessorController {
	
	
	public void testaProfessor() {
		
		Professor p1 = new Professor();
		
		p1.setNome("Felipe");
		p1.setCpf("53622772");
		p1.setMateria("Java");
		p1.setSalario(10000.0);
		
		p1.exibi();
		
	}

}
