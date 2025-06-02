package aula10;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Operações de manipulação de lista ligada de nomes (strings)
public class ListaUtil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> listaNomes = new LinkedList<>(); 	// instanciação de lista ligada de nomes
		String op;
		char[] vogais = {'A', 'E', 'I', 'O', 'U'};		// vogais de nosso alfabeto
		int[] quantidadeVogais = new int[5];			// quantidade de nomes que terminam com cada um das vogais
		
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

		// iteração entre nomes da lista
		for (String nome: listaNomes) {
			// obtenção de último caractere de enésimo nome
			char ultimoCaractere = nome.toLowerCase().charAt(nome.length() - 1);

			// atualização de quantidade de nomes que terminam com cada uma das vogais
			switch(ultimoCaractere) {
				case 'a': quantidadeVogais[0]++; break;
				case 'e': quantidadeVogais[1]++; break;
				case 'i': quantidadeVogais[2]++; break;
				case 'o': quantidadeVogais[3]++; break;
				case 'u': quantidadeVogais[4]++; break;
			}
		}
		
		// listagem de quantidade de nomes que terminam com cada uma das vogais
		for (int i = 0; i < vogais.length; i++) {
			System.out.println("Nomes que terminam com " +
				vogais[i] + ": " + quantidadeVogais[i]);
			
		}
		
		scanner.close();					// encerramento de fluxo de entrada
	}

}