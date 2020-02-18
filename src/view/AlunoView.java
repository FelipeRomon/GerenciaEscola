package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.AlunoController;
import model.Data;

public class AlunoView {
	
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;
	
	public AlunoView() {
		iniciaGui();
	}
	
	//Metodo responsavel por realizar as ações da janela
	public void iniciaGui() {
		
		//Criar a janela (instancia)
				janela = new JFrame();
				//Criar uma nova areia de texto
				area = new JTextArea();
		
		
	}
	
	//Classe responsavel por salvar as informações no espaço da tela
	public class SalvaListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			AlunoController al = new AlunoController();
			Data data = new Data();
		
		}
		
	}

}
