package aula04;

import java.util.Scanner;

// Demonstração de uso da classe Exemplar incluindo-se tratamento de eventuais exceções
public class ExemplarUtil3 {

	static final int MAX = 2;								// quantidade de exemplares
	private static Scanner scanner;							// fluxo para operações de entrada
	private static Exemplar[] acervo = new Exemplar[MAX];	// array de exemplares baseada em quantidade definida anteriormente
	
	public static void main(String[] args) {		
		scanner = new Scanner(System.in);					// inicialização de fluxo para operações de entrada
		int op;
		
		entradaExemplares();								// entrada de dados de exemplares
		
		// bloco de repetição de execução de operações
		do {
			listagemOperacoes();							// listagem de operações possíveis

			// entrada de operação a executar
			System.out.printf("\nOperação [1-6]: ");
			op = scanner.nextInt();
			scanner.nextLine();								// descarte de caracteres não processados em última operação de entrada
			
			switch(op) {
				case 1: habilitarEmprestimo(); break;				// habilitação de empréstimo
				case 2: desabilitarEmprestimo(); break;				// desabilitação de empréstimo	
				case 3: registrarEmprestimo(); break;				// registro de empréstimo
				case 4: listarTotalEmprestimos(); break;			// listagem de total, até então, de empréstimos
				case 5: listarExemplaresMaisEmprestados(); break;	// listagem de exemplares com mais empréstimos
			}
		} while (op != 6);
		
		// fechamento de fluxo de operações de entrada
		scanner.close();
	}
	
	// entrada de dados de exemplares considerando-se quantitativo definido anteriormente
	public static void entradaExemplares() {
		// entrada de dados de exemplares
		for (int i = 0; i < MAX; i++) {
			int tombo;										// número de tombo de enésimo exemplar
			boolean isTomboExistente;						// flag indicativo de existência de algum exemplar com tombo idêntico àquele quer será informado
			
			// repetição de entrada de número de tombo até que último número informado não seja idêntico a nenhum tombo de algum dos exemplares anteriores
			do {				
				// entrada de número de tombo de enésimo exemplar
				System.out.printf("Tombo do Exemplar %d: ", i + 1);
				tombo = scanner.nextInt();
				scanner.nextLine();							// descarte de caracteres não processados em última operação de entrada

				// admissão inicial de que, entre os tombos dos exemplares anteriores, nenhum deles é idêntico ao tombo informado
				isTomboExistente = false;
				
				// localização, entre os exemplares anteriores, algum deles com número idêntico ao tombo informado
				for (int j = 0; j < i; j++) {
					if (acervo[j].getTombo() == tombo) {	// se tombo de enésimo exemplar anterior idêntico ao tombo informado...
						isTomboExistente = true;			// indicativo que que tombo informado já é usado por algum dos exemplares anteriores
						System.out.println("Tombo informado já informado anteriormente. Informe outro número de tombo!");
						break;								// encerramento de localização de tombos
					}
				}
			} while (isTomboExistente);

			// entrada de título de enésimo exemplar
			System.out.printf("Título do Exemplar %d: ", i + 1);
			String titulo = scanner.nextLine();

			// entrada de nomes de autores de enésimo exemplar
			System.out.printf("Autoria do Exemplar %d: ", i + 1);
			String autoria = scanner.nextLine();

			// entrada de indicativo de enésimo exemplar estar apto (S) ou não (N) a ser emprestado
			System.out.printf("Exemplar %d apto a ser emprestado (S/N)? ", i + 1);
			boolean aptoEmprestimo = scanner.nextLine().equalsIgnoreCase("s");

			// bloco passível de lançamento de exceção, quando executado
			try {
				// instanciação de enésimo objeto da classe Exemplar e armazenamento de referência em enésimo índice do array
				acervo[i] = new Exemplar(tombo, titulo, autoria, aptoEmprestimo);				
			}
			// captura de exceção por tentativa de atualização de empréstimos de exemplar não habilitado
			catch(IllegalArgumentException e) {
				// listagem de mensagens de detalhamento de erro
				System.out.printf("%s\n", e.getMessage());				
				System.out.printf("Será exigida entrada, novamente, de todos os dados do Exemplar %d\n", i + 1);				
				
				i--; 	// decremento de contador de bloco de repetição para fins de nova entrada de dados de enésimo exemplar
			}
			
			System.out.println();
		}		
	}
	
	// listagem de operações
	public static void listagemOperacoes() {
		System.out.println();
		System.out.println("***************** OPERAÇÕES ****************");
		System.out.println("* 1 - Habilitar Empréstimo                 *");
		System.out.println("* 2 - Desabilitar Empréstimo               *");
		System.out.println("* 3 - Registrar Empréstimo                 *");
		System.out.println("* 4 - Listar Total de Empréstimos          *");
		System.out.println("* 5 - Listar Exemplar com Mais Empréstimos *");
		System.out.println("* 6 - Encerrar                             *");
		System.out.println("********************************************");
	}

	// seleção de exemplar e, após isso, habilitação do mesmo para realização de novos empréstimos
	public static void habilitarEmprestimo() {
		// entrada de número de exemplar a ser selecionado (um inteiro entre 1 e quantidade de exemplares cadastrados)
		System.out.printf("Exemplar a ser habilitado para empréstimo [1-%d]: ", MAX);
		int indice = scanner.nextInt() - 1;
		scanner.nextLine();						// descarte de caracteres não processados em última operação de entrada

		acervo[indice].habilitarEmprestimo();
	}
	
	// seleção de exemplar e, após isso, desabilitação do mesmo para realização de novos empréstimos
	public static void desabilitarEmprestimo() {
		// entrada de número de exemplar a ser selecionado (um inteiro entre 1 e quantidade de exemplares cadastrados)
		System.out.printf("Exemplar a ser desabilitado para empréstimo [1-%d]: ", MAX);
		int indice = scanner.nextInt() - 1;
		scanner.nextLine();						// descarte de caracteres não processados em última operação de entrada

		acervo[indice].desabilitarEmprestimo();
	}

	// seleção de exemplar e, após isso, atualização de respectiva quantidade de empréstimos
	public static void registrarEmprestimo() {
		// entrada de número de exemplar a ser selecionado (um inteiro entre 1 e quantidade de exemplares cadastrados)
		System.out.printf("Exemplar para o qual será registrado novo empréstimo [1-%d]: ", MAX);
		int indice = scanner.nextInt() - 1;
		scanner.nextLine();									// descarte de caracteres não processados em última operação de entrada

		// bloco passível de lançamento de exceção, quando executado
		try {
			acervo[indice].adicionarEmprestimo();			// atualização de quantidade de empréstimos do exemplar selecionado
			System.out.printf("Exemplar selecionado passa a totalizar %d empréstimos!\n", acervo[indice].getEmprestimos());				
		}
		// captura de exceção por tentativa de atualização de empréstimos de exemplar não habilitado
		catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());				
		}
	}

	// listagem de total de empréstimos considerando todos os exemplares
	public static void listarTotalEmprestimos() {
		int qtdTotalEmprestimos = 0;						// totalizador de quantidade de empréstimos
		
		// atualização de totalizador incorporando-se ao mesmo quantidade de empréstimos de cada exemplar
		for (int i = 0; i < MAX; i++)
			qtdTotalEmprestimos += acervo[i].getEmprestimos();
		
		// listagem de totalizador com a quantidade total de empréstimos
		System.out.printf("Quantidade total de empréstimos: %d\n", qtdTotalEmprestimos);
	}

	// listagem de exemplares com mais empréstimos
	public static void listarExemplaresMaisEmprestados() {
		// maior quantidade, até então conhecida, de empréstimos por exemplar (inicialmente considera-se seja do primeiro exemplar)
		int qtdMaiorEmprestimos = acervo[0].getEmprestimos();
		
		// atualização de maior quantidade de empréstimos (a partir de exame de segundo exemplar em diante)
		for (int i = 1; i < MAX; i++) {
			// se quantidade de empréstimos de enésimo exemplar for superior à maior quantidade, até então conhecida, de empréstimos...
			if (acervo[i].getEmprestimos() > qtdMaiorEmprestimos) {
				// atualização de maior quantidade de empréstimos
				qtdMaiorEmprestimos = acervo[i].getEmprestimos();				
			}
		}
		
		if (qtdMaiorEmprestimos == 0)														// se maior quantidade de empréstimos for 0 (zero)...
			System.out.printf("Inexistência de exemplares com registro empréstimos!\n");	// listagem de mensagem a respeito
		else {																				// caso contrário...
			System.out.printf("Exemplares com mais empréstimos:\n");
			
			// localização e listagem de exemplares com maior quantidade identificada de empréstimos
			for (int i = 0; i < MAX; i++) {
				// se quantidade de empréstimos de enésimo exemplar for equivalente à maior quantidade identificada de empréstimos por exemplar...
				if (acervo[i].getEmprestimos() == qtdMaiorEmprestimos) {
					// listagem de título e autoria de enésimo exemplar
					System.out.printf("Exemplar Nº %d, cujo título é %s e com autoria de %s\n", i + 1, 
							acervo[i].getTitulo().toUpperCase(), acervo[i].getAutores().toUpperCase());					
				}
			}
			
			System.out.println();
		}		
	}

}