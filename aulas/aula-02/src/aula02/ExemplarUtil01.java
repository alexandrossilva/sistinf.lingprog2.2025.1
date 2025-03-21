package aula02;

import java.util.Scanner;

public class ExemplarUtil01 {

	static final int MAX = 6;						// quantidade de exemplares
	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);	// fluxo para operações de entrada
		Exemplar[] acervo = new Exemplar[MAX];		// array de exemplares baseada em quantidade definida anteriormente
		
		// entrada de dados de exemplares
		for (int i = 0; i < MAX; i++) {
			// entrada de número de tombo de enésimo exemplar
			System.out.printf("Tombo do Exemplar %d: ", i + 1);
			int tombo = scanner.nextInt();
			scanner.nextLine();						// descarte de caracteres não processados em última operação de entrada

			// entrada de título de enésimo exemplar
			System.out.printf("Título do Exemplar %d: ", i + 1);
			String titulo = scanner.nextLine();

			// entrada de nomes de autores de enésimo exemplar
			System.out.printf("Autoria do Exemplar %d: ", i + 1);
			String autoria = scanner.nextLine();

			// entrada de indicativo de enésimo exemplar estar apto (S) ou não (N) a ser emprestado
			System.out.printf("Exemplar %d apto a ser emprestado (S/N)? ", i + 1);
			boolean aptoEmprestimo = scanner.nextLine().equalsIgnoreCase("s");

			// instanciação de enésimo objeto da classe Exemplar e armazenamento de referência em enésimo índice do array
			acervo[i] = new Exemplar(tombo, titulo, autoria, aptoEmprestimo);			
		}

		// fechamento de fluxo de operações de entrada
		scanner.close();
	}

}