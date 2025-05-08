package aula09;

import java.util.ArrayList;

public class ListaUtil {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>(3);
		nomes.add(0, "Maria");		// inserção de primeira string
		nomes.add(0, "Alex");			// inserção de segunda string
		nomes.add(1, "João");			// inserção de terceira string
		nomes.add(2, "Sofia");		// inserção de quarta string (exceção será lançada)
		
		System.out.println(nomes);
		System.out.println(nomes.contains("Maria"));
		System.out.println(nomes.contains("maria"));
		System.out.println(nomes.contains(1));
	}

}
