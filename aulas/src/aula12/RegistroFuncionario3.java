package aula12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Escrita de nome e salário de funcionário em arquivo de texto usando instância 
// da classe PrintWriter, de modo que dados a serem gravados sejam acrescidos 
// ao final do arquivo ao invés de sobreporem conteúdo anterior do arquivo
public class RegistroFuncionario3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// entrada de nome e salário de funcionário
		System.out.println("Dados de Funcionário");
		System.out.print("Nome...: ");
		String nome = scanner.nextLine();
		System.out.print("Salário: ");
		double salario = scanner.nextDouble();
		
		try {
			// abertura de fluxo de saída inicial indicando acréscimo de dados a serem escritos
			FileWriter fluxoInicial = new FileWriter("src/aula12/arquivos/funcionario.txt", true);
			
			// abertura de segundo fluxo de saída baseado em fluxo de saída anterior
			PrintWriter fluxo = new PrintWriter(fluxoInicial);
			
			// escrita de dados fornecidos de funcionário utilizando-se do segundo fluxo de saída
			fluxo.print(nome);
			fluxo.print(' ');
			fluxo.println(salario);
			
			fluxo.close();				// fechamento de segundo fluxo
			fluxoInicial.close();		// fechamento do fluxo inicial
			
			System.out.println("Gravação de dados em arquivo concluída!");
		}
		// captura de exceção
		catch (IOException e) {
			e.printStackTrace();
		}
		
		scanner.close();
	}

}