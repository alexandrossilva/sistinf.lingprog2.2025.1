package notasaula05.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class DuplicidadeConjuntoCores {

	public static void main(String[] args) {
		String[] cores 				= new String[] {"Azul", "Branco", "Bronze", "Cinza", "Laranja", "Vermelho"};		
		Set<String> conjuntoCores 	= new HashSet<String>();

		for (int i = 0; i < cores.length; i++)
    		conjuntoCores.add(cores[i]);
		
		System.out.println("Inserção de [Ciano]: " + conjuntoCores.add("Ciano"));
		System.out.println("Inserção de [Verde]: " + conjuntoCores.add("Verde"));
		// tentativa de inserção de mesmo elemento uma segunda vez
		System.out.println("Inserção de [Branco]: " + conjuntoCores.add("Branco"));
		
		System.out.println("CONJUNTO DE CORES");
		for (String cor : conjuntoCores) {
			System.out.println(cor);
		}
	}

}
