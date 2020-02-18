package controller;

/**
 * Classe encarregada de crias, guardar e mostrar os alunos 
 * @author fcorrea
 * since 18/02/2020
 * @version 0.1
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import model.Aluno;
import model.Data;
import model.Mensagem;

public class AlunoController {
	
	
	//Registro de todos os alunos
	public void inserirAluno(String matricula, String nome, Data data, char sexo) {
		
			
			//incerção dos alunos
			Aluno a1 = new Aluno();
			Data d1 = new Data();
			a1.setMatricula(matricula);
			a1.setNome(nome);
			a1.setDataDoNascimento(data);
			a1.setSexo(sexo);
			
			
			File arquivo = new File("alunos.txt");
			
			FileOutputStream arquivoOutput;
			try {
				
				arquivoOutput = new FileOutputStream(arquivo, true);
				PrintStream gravador = new PrintStream(arquivoOutput);
				
				
				gravador.print(a1.getMatricula());
				gravador.print(";");
				gravador.print(a1.getNome());
				gravador.print(";");
				gravador.print(a1.getDataDoNascimento());
				gravador.print(";");
				gravador.print(a1.getSexo());
				gravador.print("\n");
				
				
				gravador.close();
				arquivoOutput.close();
				
				System.out.println(Mensagem.gravacaoSucesso);
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
	}
	
	//listar todos os alunos registrados
	public void listarTodos() {
		
		InputStream is;
		try {
			
			is = new FileInputStream ("alunos.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			
			String texto = leitor.readLine();
			
			while (texto != null) {
				String al[] = texto.split(";");
				System.out.print("Matricula: " + al[0]);
				System.out.print(" ; Nome: " + al[1]);
				System.out.print(" ; Data de nascimento: " + al[2]);
				System.out.print(" ; Sexo: " + al[3] + "\n");
				
				texto = leitor.readLine();
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println(Mensagem.enceradoComSucesso);
			
		} catch (IOException e) {
		
			e.printStackTrace();
			
		}

		
	}
	
	
	//buscar apenas o mes de aniversário
	public void listaAniversario(int mes) {
		
		
			InputStream is;
			try {
				
				is = new FileInputStream ("alunos.txt");
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader leitor = new BufferedReader(isr);
				
				String texto = leitor.readLine();
				
				while (texto != null) {
					String al[] = texto.split(";");
					String data = al[2];
					String datas[] = data.split("/");
					String mesDado = datas[1];
					
					int dataAniversario = Integer.parseInt(mesDado);
					if(dataAniversario == mes) {
						System.out.print("Matricula: " + al[0]);
						System.out.print(" ; Nome: " + al[1]);
						System.out.print(" ; Data de nascimento: " + al[2]);
						System.out.print(" ; Sexo: " + al[3] + "\n");
					}
					texto = leitor.readLine();
				}
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
				System.out.println(Mensagem.enceradoComSucesso);
				
			} catch (IOException e) {
			
				e.printStackTrace();
				
			}

			
		}

}
