package aula09;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Operações de manipulação de lista ligada de nomes (strings)
public class ListaUtil4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> listaNomes = new LinkedList<String>(); 	// instanciação de lista ligada de nomes
		String op;
		
		// bloco de repetição
		do {
			// entrada de operação a ser executada
			System.out.print("Inserir nome ou encerrar [I/E]? ");
			op = scanner.nextLine();
			
			// se operação corresponder ao encerramento do programa...
			if (op.equalsIgnoreCase("e"))
				break;						// encerramento de execução de bloco de repetição
			
			// se operação corresponder à inserção de novo nome na lista...
			if (op.equalsIgnoreCase("i")) {
				// entrada de nome
				System.out.print("Nome a inserir: ");

				String nome = scanner.nextLine();
				listaNomes.add(nome);		// inserção de nome na lsita
			}
		} while (true);
		
		
		String temp = "Alexandro";			// inicialização de string literal
		
		// indicação de término (true) ou não (false) de string literal com caractere literal (o)
		System.out.println(temp.endsWith("o"));
		
		System.out.println("\nLista de Nomes:");
		
		// listagem de nomes
		for (String nome: listaNomes) {
			System.out.println(nome);			
		}
		
		scanner.close();					// encerramento de fluxo de entrada
	}

}