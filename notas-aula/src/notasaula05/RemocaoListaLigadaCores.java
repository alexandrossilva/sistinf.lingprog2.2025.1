package notasaula05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemocaoListaLigadaCores {

	public static void main(String[] args) {
		List<String> cores = new LinkedList<String>();
		
		cores.add("Vermelho");					// inclusão de 1º elemento
		cores.add("Azul");    					// inclusão de 2º elemento no final da lista
		cores.add("Verde");   					// inclusão de 3º elemento no final da lista
		
		Iterator<String> it = cores.iterator(); // obtenção de iterador
		it.next(); 								// visitação do 1º elemento
		it.remove();							// remoção do último elemento visitado (1º elemento)
		
		int i = 0;								// contador de elementos
		for (String cor: cores)					// listagem de elementos
			System.out.printf("Cor (Posição %d): %s\n", i++, cor);
	}
	
}
