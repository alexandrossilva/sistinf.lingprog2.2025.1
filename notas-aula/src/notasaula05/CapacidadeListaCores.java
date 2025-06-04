package notasaula05;

import java.util.ArrayList;
import java.util.List;

public class CapacidadeListaCores {

	public static void main(String[] args) {
		// lista com capacidade inicial de 3 (três) elementos
		List<String> cores = new ArrayList<String>(3);
		
		cores.add("Vermelho");	// inclusão de 1º elemento
		cores.add("Azul");    	// inclusão de 2º elemento
		cores.add("Verde");   	// inclusão de 3º elemento
		cores.add("Preto");   	// inclusão de 4º elemento
		
		// listagem de elementos
		for (int i = 0; i < cores.size(); i++)
			System.out.printf("Cor (Posição %d): %s\n", i, cores.get(i));
	}
	
}
