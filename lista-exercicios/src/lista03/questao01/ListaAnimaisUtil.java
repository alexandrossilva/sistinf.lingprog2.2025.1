package lista03.questao01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaAnimaisUtil {

	public static void main(String[] args) {
		final int QTD			 = 10;	// quantidade de nomes de animais a serem lidos
		Scanner scanner	 		 = new Scanner(System.in);
		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		
		// entrada de nomes de animais e inserção na lista 1
		for (int i = 0; i < QTD; i++) {
			System.out.printf("Nome de Animal %2d: ", i + 1);
			String nomeAnimal = scanner.next();
			lista1.add(nomeAnimal);
		}

		Iterator<String> iterador = lista1.iterator();  // obtenção de iterador da lista 1

		// iteração entre os nomes de animais armazenados na lista 1
		while (iterador.hasNext()) {
			String nomeAnimal = iterador.next();		// obtenção do próximo nome
			if (nomeAnimal.length() >= 5) {				// se nome com 5 ou mais caracteres...
				iterador.remove();						// remoção da lista 1
				lista2.add(nomeAnimal);					// inserção na lista 2
			}
		}
		
		// listagem de nomes de animais remanescentes nas duas listas
		System.out.println("\nLista de Animais 1: " + lista1);
		System.out.println("Lista de Animais 2: " + lista2);
		
		scanner.close();
	}

}