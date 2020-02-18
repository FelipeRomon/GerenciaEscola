/**
 * @author fcorrea
 * @since 17/02/2020
 * @version 0.1
 */
//import controller.AlunoController;
import controller.AlunoController;
import view.AlunoView;

// Classe responsavel por executar os programas
public class Main {

	public static void main(String[] args) {
		
		AlunoController al = new AlunoController();
		
//		al.inserirAluno();
//		al.listarTodos();
//		al.listaAniversario(11);
		
		new AlunoView();
		

	}

}
