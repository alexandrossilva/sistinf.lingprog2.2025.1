package aula12;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Escrita, em arquivo de texto, de dados de funcionários de lista
public class RegistroFuncionarios {

	private static Scanner scanner;
	private static List<Funcionario> lista = new ArrayList<Funcionario>();

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
				
		lerFuncionarios();			// entrada, pelo usuário, de dados de funcionários
		
		gravarFuncionarios();		// escrita, em arquivo de texto, de dados de funcionários
						
		scanner.close();
	}

	// entrada, pelo usuário, de dados de funcionários
	private static void lerFuncionarios() {
		int nrFuncionario = 1;		// contador de funcionários
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
			PrintWriter fluxo = new PrintWriter("src/aula12/arquivos/funcionario.txt");
			
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
	
}