package aula12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Gravação de nome e salário de funcionário em arquivo de texto
public class RegistroFuncionario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// entrada de nome e salário de funcionário
		System.out.println("Dados de Funcionário");
		System.out.print("Nome...: ");
		String nome = scanner.nextLine();
		System.out.print("Salário: ");
		double salario = scanner.nextDouble();
		
		try {
			// abertura de fluxo de saída de arquivo indicado acréscimo de dados a serem escritos
			FileWriter fluxoArquivo = new FileWriter("src/aula12/arquivos/funcionario.txt", true);
			
			// escrita de dados fornecidos de funcionário em arquivo
			fluxoArquivo.write(nome + ' ' + salario + System.lineSeparator());
			
			fluxoArquivo.close();			// fechamento de fluxo
			
			System.out.println("Gravação de dados em arquivo concluída!");
		}
		// captura de exceção
		catch (IOException e) {
			e.printStackTrace();
		}
		
		scanner.close();
	}

}