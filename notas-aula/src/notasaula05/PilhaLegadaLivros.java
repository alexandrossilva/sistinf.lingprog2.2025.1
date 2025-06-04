package notasaula05;

import java.util.Stack;

public class PilhaLegadaLivros {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<String>();
		String ultimoLivro = null;						// último livro desempilhado
		
		pilhaLivros.push("Java: Como Programar");		// empilhamento de primeiro livro
		pilhaLivros.push("Core Java (Volume 1)");		// empilhamento de segundo livro
		
		System.out.println("Pilha após Empilhamento de Livros: " + pilhaLivros);

		pilhaLivros.push("Programação com Java");		// empilhamento de terceiro livro
		System.out.println("Pilha após Novo Empilhamento: " + pilhaLivros);

		ultimoLivro = pilhaLivros.pop();				// desempilhamento de terceiro livro
		System.out.println("Pilha após Desempilhamento do Livro " + ultimoLivro + ": " + pilhaLivros);
		
		pilhaLivros.push("Orientação a Objetos");		// empilhamento de quarto livro		
		System.out.println("Pilha após Novo Empilhamento: " + pilhaLivros);
		
		ultimoLivro = pilhaLivros.pop();				// desempilhamento de quarto livro
		System.out.println("Pilha após Desempilhamento do Livro " + ultimoLivro + ": " + pilhaLivros);
	}
	
}
