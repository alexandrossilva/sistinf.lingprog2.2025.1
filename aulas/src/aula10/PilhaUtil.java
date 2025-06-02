package aula10;

import java.util.ArrayDeque;
import java.util.Deque;

// Operações de manipulação de pilha de inteiros
public class PilhaUtil {

	public static void main(String[] args) {
		// instanciação de pilha de inteiros com capacidade inicial de 2 (dois) elementos
		Deque<Integer> pilha = new ArrayDeque<Integer>(2);

		// empilhamento de inteiro 5 (cinco) e após isso listagem de inteiros da pilha
		pilha.push(5);		
		System.out.println("Após inserir 5: " + pilha);

		// empilhamento de inteiro 7 (sete) e após isso listagem de inteiros da pilha
		pilha.push(7);		
		System.out.println("Após inserir 7: " + pilha);

		// empilhamento de inteiro 9 (nove) e após isso listagem de inteiros da pilha
		pilha.push(9);		
		System.out.println("Após inserir 9: " + pilha);

		// listagem de próximo inteiro a ser removido da pilha
		System.out.println("Próximo elemento a ser removido: " + pilha.peek());

		// desempilhamento de próximo inteiro e após isso listagem de inteiros restantes da pilha
		pilha.pop();		
		System.out.println("Após remover: " + pilha);
	}

}