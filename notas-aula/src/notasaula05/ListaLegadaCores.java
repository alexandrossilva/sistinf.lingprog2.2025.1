package notasaula05;

import java.util.List;
import java.util.Vector;

public class ListaLegadaCores {

	public static void main(String[] args) {
		List<String> cores = new Vector<String>();
		
		cores.add("Vermelho");	// inclusão de 1º elemento
		cores.add("Azul");    	// inclusão de 2º elemento no final da lista (posição 1)
		cores.add("Verde");   	// inclusão de 3º elemento no final da lista (posição 2)
		
		for (int i = 0; i < cores.size(); i++)		// listagem de elementos
			System.out.printf("Cor (Posição %d): %s\n", i, cores.get(i));
	}
	
}
