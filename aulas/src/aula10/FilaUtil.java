package aula10;

import java.util.ArrayDeque;
import java.util.Queue;

// Operações de manipulação de fila de inteiros
public class FilaUtil {

	public static void main(String[] args) {
		// instanciação de fila de inteiros com capacidade inicial de 2 (dois) elementos
		Queue<Integer> fila = new ArrayDeque<Integer>(2);
		
		// enfileiramento de inteiro 5 (cinco) e após isso listagem de inteiros da fila
		fila.offer(5);		
		System.out.println("Após inserir 5: " + fila);

		// enfileiramento de inteiro 7 (sete) e após isso listagem de inteiros da fila
		fila.offer(7);		
		System.out.println("Após inserir 7: " + fila);
		
		// enfileiramento de inteiro 9 (nove) e após isso listagem de inteiros da fila
		fila.offer(9);		
		System.out.println("Após inserir 9: " + fila);
		
		// listagem de próximo inteiro a ser removido da fila
		System.out.println("Próximo elemento a ser removido: " + fila.peek());

		// desenfileiramento de próximo inteiro e após isso listagem de inteiros restantes da fila
		fila.poll();		
		System.out.println("Após remover: " + fila);
	}

}
