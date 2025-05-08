package aula09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListaUtil3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> listaNomes = new LinkedList<String>();
		String op;
		
		do {
			System.out.print("Inserir nome ou encerrar [I/E]? ");
			op = scanner.nextLine();
			
			if (op.equalsIgnoreCase("e"))
				break;
			
			if (op.equalsIgnoreCase("i")) {
				System.out.print("Nome a inserir: ");
				String nome = scanner.nextLine();
				listaNomes.add(nome);
			}
		} while (true);
		
		System.out.println("\nLista de Nomes:");
		
		for (int i = 0; i < listaNomes.size(); i++) {
			System.out.println(listaNomes.get(i));			
		}
	}

}
