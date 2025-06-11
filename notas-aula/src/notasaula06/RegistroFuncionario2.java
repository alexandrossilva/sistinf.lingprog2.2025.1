package notasaula06;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Leitura de caracteres a partir de arquivo
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
			// abertura de fluxo de saída
			PrintWriter fluxo = new PrintWriter("funcionarios.txt");
			
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
