package aula10;

import java.util.Collection;
import java.util.HashSet;

// Operações de manipulação de conjuntos de inteiros
public class ConjuntoUtil {

	public static void main(String[] args) {
		// instanciação de conjunto de inteiros
		Collection<Integer> conjunto = new HashSet<Integer>();
		
		// inserção de inteiro 5 (cinco) e após isso listagem de inteiros do conjunto
		conjunto.add(5);		
		System.out.println("Após inserir 5: " + conjunto);
		
		// inserção de inteiro 7 (sete) e após isso listagem de inteiros do conjunto
		conjunto.add(7);		
		System.out.println("Após inserir 7: " + conjunto);

		// inserção de inteiro 9 (nove) e após isso listagem de inteiros do conjunto
		conjunto.add(9);		
		System.out.println("Após inserir 9: " + conjunto);

		
		// inserção, novamente, de inteiro 7 (sete)
		conjunto.add(7);		
		// listagem de inteiros do conjunto sem que segunda cópia de inteiro 7 (sete) esteja inserido
		System.out.println("Após inserir 7 novamente: " + conjunto);

		// remoção de inteiro 7 (sete) do conjunto e após isso listagem de inteiros restantes
		conjunto.remove(7);		
		System.out.println("Após remover: " + conjunto);
	}

}
