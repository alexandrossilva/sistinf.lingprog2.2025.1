package lista03.questao03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaAnimaisUtil {

	public static void main(String[] args) {
		final int QTD			 = 10;		// quantidade de nomes de animais a serem lidos
		Scanner scanner	 		 = new Scanner(System.in);
		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		
		// entrada de nomes de animais e inserção na lista 1
		for (int i = 0; i < QTD; i++) {
			boolean existente = false;		// controle de existência de animal já na lista
	        do {            
	            System.out.printf("Animal %2d: ", i + 1);
	            String nomeAnimal = scanner.next().trim().toUpperCase();
	            
	            // localização de nome de animal já inserido com o mesmo nome agora informado
	            if (existente = lista1.indexOf(nomeAnimal) != -1)
	               System.out.println("Animal já inserido!");               
	            else
	               lista1.add(nomeAnimal);	// inserção na lista 1 (se não existente)        
	         } while (existente);
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
