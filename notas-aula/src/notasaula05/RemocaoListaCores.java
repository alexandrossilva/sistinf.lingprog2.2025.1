package notasaula05;

import java.util.ArrayList;
import java.util.List;

public class RemocaoListaCores {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<String>();
		
		cores.add("Vermelho");	// inclusão de 1º elemento
		cores.add("Azul");    	// inclusão de 2º elemento no final da lista
		cores.add("Verde");   	// inclusão de 3º elemento no final da lista
		cores.remove(0);		// remoção de 1º elemento (posição 0)
		
		for (int i = 0; i < cores.size(); i++)		// listagem de elementos
			System.out.printf("Cor (Posição %d): %s\n", i, cores.get(i));
	}
	
}
