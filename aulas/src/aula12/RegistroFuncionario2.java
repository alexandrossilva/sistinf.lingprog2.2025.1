package aula12;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Escrita de nome e salário de funcionário em arquivo de texto usando instância da classe PrintWriter
public class RegistroFuncionario2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// entrada de nome e salário de funcionário
		System.out.println("Dados de Funcionário");
		System.out.print("Nome...: ");
		String nome = scanner.nextLine();
		System.out.print("Salário: ");
		double salario = scanner.nextDouble();
		
		try {
			// abertura de fluxo de saída (conteúdo anterior do arquivo será sobreposto)
			PrintWriter fluxo = new PrintWriter("src/aula12/arquivos/funcionario.txt");
			
			// escrita de dados fornecidos de funcionário em arquivo
			fluxo.print(nome);
			fluxo.print(' ');
			fluxo.println(salario);
			
			fluxo.close();			// fechamento de fluxo
			
			System.out.println("Gravação de dados em arquivo concluída!");
		}
		// captura de exceção
		catch (IOException e) {
			e.printStackTrace();
		}
		
		scanner.close();
	}

}
