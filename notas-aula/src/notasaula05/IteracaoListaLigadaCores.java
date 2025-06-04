package notasaula05;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteracaoListaLigadaCores {

	public static void main(String[] args) {
		List<String> cores = new LinkedList<String>();
		
		cores.add("Vermelho");								// inclusão de 1º elemento
		cores.add("Azul");    								// inclusão de 2º elemento no final da lista
		cores.add("Verde");   								// inclusão de 3º elemento no final da lista
		
		ListIterator<String> it = cores.listIterator(); 	// obtenção de iterador
		it.next(); 											// navegação após o 1º elemento
		it.add("Preto");   									// inclusão após 1º elemento

		ListIterator<String> it2 = cores.listIterator(); 	// obtenção de segundo iterador
		while (it2.hasNext())								// listagem de elementos
			System.out.printf("Cor (Posição %d): %s\n", it2.nextIndex(), it2.next());
	}
	
}
