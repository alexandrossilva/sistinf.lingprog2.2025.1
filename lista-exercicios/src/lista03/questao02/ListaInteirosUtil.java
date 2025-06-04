package lista03.questao02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaInteirosUtil {
	
	public static void main(String[] args) {
		final int QTD			  = 10;						// quantidade de números a serem lidos
		Scanner scanner	 		  = new Scanner(System.in);
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		// entrada de números e inserção na primeira lista
		for (int i = 0; i < QTD; i++) {
			System.out.printf("%2dº Número Inteiro: ", i + 1);
			int n = scanner.nextInt();
			lista1.add(n);
		}

		Iterator<Integer> iterador = lista1.iterator();  	// obtenção de iterador da lista 1
		
		// iteração entre os números armazenados na lista 1
		while (iterador.hasNext()) {
			int n = iterador.next();						// obtenção do próximo número
			// se número com 1º e último dígitos iguais...
			if (n % 10 == Util.getNumeroReverso(n) % 10) {
				iterador.remove();							// remoção da lista 1
				lista2.add(n);								// inserção na lista 2
			}
		}
		
		// listagem de nomes de números remanescentes nas duas listas
		System.out.println("\nLista 1: " + lista1);
		System.out.println("Lista 2: " + lista2);
		
		scanner.close();
	}

}
