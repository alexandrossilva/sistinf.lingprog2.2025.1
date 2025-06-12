package aula12;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Leitura e escrita, em arquivo de texto, de dados de funcionários de lista
public class RegistroFuncionarios2 {

	private static Scanner scanner;
	private static List<Funcionario> lista = new ArrayList<Funcionario>();
	
	// caminho de arquivo no qual serão realizadas operações de leitura e escrita
	private static String caminhoArquivo = "src/aula12/arquivos/funcionario.txt";

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		recuperarFuncionarios();	// leitura de dados de funcionários a partir de arquivo de texto
				
		lerFuncionarios();			// entrada, pelo usuário, de dados de funcionários
		
		gravarFuncionarios();		// escrita, em arquivo de texto, de dados de funcionários
						
		scanner.close();
	}

	// entrada, pelo usuário, de dados de funcionários
	private static void lerFuncionarios() {
		// contador de funcionários inicializado considerando-se 
		// quantidade de funcionários já inseridos em lista
		int nrFuncionario = lista.size() + 1;
		String resp;
		
		// operações de entrada até que indicação, pelo usuário, em sentido contrário
		do {
			// entrada de nome e salário de funcionário
			System.out.printf("Dados de Funcionário %d\n", nrFuncionario++);
			System.out.print("Nome...: ");
			String nome = scanner.nextLine();
			System.out.print("Salário: ");
			double salario = scanner.nextDouble();			
			scanner.nextLine();
			
			// instanciação de objeto da classe Funcionario com os dados fornecidos pelo usuário
			Funcionario func = new Funcionario(nome, salario);
			
			// inserção de objeto em lista
			lista.add(func);
			
			// entrada, pelo usuário, de próxima operação válida
			do {				
				System.out.print("Novo Funcionário (N) ou Encerrar (E)? ");
				resp = scanner.nextLine().toLowerCase();			
			} while (!resp.equals("n") && !resp.equals("e"));
		} while (!resp.equals("e"));		
	}
	
	// escrita, em arquivo, de dados de funcionários inseridos em lista
	private static void gravarFuncionarios() {
		try {
			// abertura de fluxo de saída
			PrintWriter fluxo = new PrintWriter("src/aula12/funcionario.txt");
			
			// iteração entre elementos da lista
			for (Funcionario func: lista) {
				// escrita de dados fornecidos de enésimo funcionário em arquivo
				fluxo.print(func.getNome());
				fluxo.print("|");
				fluxo.println(func.getSalario());				
			}
			
			fluxo.close();			// fechamento de fluxo
			
			System.out.println("Gravação de dados em arquivo concluída!");
		}
		// captura de exceção
		catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	// leitura de dados de funcionários a partir de arquivo de texto e inserção em lista
	private static void recuperarFuncionarios() {
		try {
			// fluxo de leitura inicial de arquivo de texto
			FileReader fluxo = new FileReader(caminhoArquivo);
			
			// scanner baseado em fluxo de leitura inicial
			Scanner scannerFluxo = new Scanner(fluxo);
			
			// enquanto houverem caracteres a serem lidos...
			while (scannerFluxo.hasNext()) {
				// leitura de enésima linha de texto
				String linha = scannerFluxo.nextLine();
				
				// obtenção de partes da linha (separados pelo caractere '|')
				String[] campos = linha.split("[|]");
				
				// obtenção de nome e salário do enésimo funcionário a partir das partes da linha
				String nome = campos[0];
				double salario = Double.parseDouble(campos[1]);
				
				// instanciação de objeto da classe Funcionario com os dados fornecidos pelo usuário
				Funcionario func = new Funcionario(nome, salario);
				
				// inserção de objeto em lista
				lista.add(func);
			}
			
			System.out.println("Funcionários já inseridos!");
			
			int qdtFuncionarios = 0;		// contador de funcionários inseridos
			
			// iteração entre elementos da lista
			for (Funcionario func: lista) {
				qdtFuncionarios++;			// atualização de contador
				System.out.printf("Funcionário %d: %s com salário %.2f\n", 
						  		  qdtFuncionarios, func.getNome(), func.getSalario());								
			}
			
			scannerFluxo.close();			// encerramento de scanner
			fluxo.close();					// encerramento de fluxo de leitura
		}
		// captura de exceção
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}