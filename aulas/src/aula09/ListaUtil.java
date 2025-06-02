package aula09;

import java.util.ArrayList;

// Operações de manipulação de lista de strings
public class ListaUtil {

	public static void main(String[] args) {
		// instanciação de lista
		ArrayList<String> nomes = new ArrayList<String>(3);
		
		nomes.add(0, "Maria");		// inserção de primeira string
		nomes.add(0, "Alex");		// inserção de segunda string
		nomes.add(1, "João");		// inserção de terceira string
		nomes.add(2, "Sofia");		// inserção de quarta string (exceção será lançada)
		
		// listagem de strings
		System.out.println(nomes);
		// verificação de existência, em lista de string literal "Maria"
		System.out.println(nomes.contains("Maria"));
		// verificação de existência, em lista de string literal "maria"
		System.out.println(nomes.contains("maria"));
		// verificação de existência, em lista de inteiro literal 1 (um)
		System.out.println(nomes.contains(1));
	}

}
