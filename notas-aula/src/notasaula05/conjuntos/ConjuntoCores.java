package notasaula05.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoCores {

	public static void main(String[] args) {
		String[] cores 				= new String[] {"Azul", "Branco", "Bronze", "Cinza", "Laranja", "Vermelho"};		
		Set<String> conjuntoCores 	= new HashSet<String>();

		for (int i = 0; i < cores.length; i++)
    		conjuntoCores.add(cores[i]);
		
		System.out.println("CONJUNTO DE CORES");
		for (String cor : conjuntoCores) {
			System.out.println(cor);
		}
	}

}
