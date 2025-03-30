package lista01.questao13;

import java.util.Date;
import java.util.Scanner;
import lista01.questao11.Exemplar;

public class ExemplarUtil {

	public static void main(String[] args) {
		Scanner scanner 	= new Scanner(System.in);		
		final int QTD 		= 6;									// quantidade de exemplares
		ExemplarDetalhado[] acervo 	= new ExemplarDetalhado[QTD]; 	// array de exemplares
		
		// entrada de dados de exemplares
		for (int i = 0; i < QTD; i++) {
			int tombo;					// número de tombo de enésimo exemplar
			String titulo, autoria;		// título e autoria de enésimo exemplar
			boolean aptoEmprestimos;	// habilitação para empréstimos de enésimo exemplar
			
			System.out.println("\nExemplar " + (i + 1));

			// entrada de tombo de enésimo exemplar
			System.out.print("Tombo............................: ");
			tombo = scanner.nextInt();

			// descarte de caracteres remanescentes em fluxo após leitura de tombo (inteiro)
			scanner.nextLine();
			
			// entrada de título de enésimo exemplar
			System.out.print("Título...........................: ");
			titulo = scanner.nextLine();
			
			// entrada de autoria de enésimo exemplar
			System.out.print("Autores..........................: ");
			autoria = scanner.nextLine();
			
			// entrada de autoria de enésimo exemplar
			System.out.print("Habilitado para Empréstimos (S/N)? ");
			aptoEmprestimos = scanner.nextLine().equalsIgnoreCase("s");
			
			// instanciação de objeto de ExemplarDetalhado e inclusão em array
			acervo[i] = new ExemplarDetalhado(tombo, titulo, autoria, aptoEmprestimos);
		}
		
		int op;	// seleção de operação a fazer após entrada de dados de exemplares
		
		do {
			System.out.println();
			System.out.println("*********** OPERACÕES COM EXEMPLARES ************");
			System.out.println("* 1 - Habilitar Empréstimos                     *");
			System.out.println("* 2 - Desabilitar Empréstimos                   *");
			System.out.println("* 3 - Registrar Novo Empréstimo                 *");
			System.out.println("* 4 - Listar Empréstimos                        *");
			System.out.println("* 5 - Identificar Exemplar com Mais Empréstimos *");
			System.out.println("* 6 - Encerrar                                  *");
			System.out.println("*************************************************");
			
			System.out.print("Informe Operação (1/2/3/4/5/6): ");
			op = scanner.nextInt();		// entrada de operação desejada
			
			switch(op) {
				// habilitação de empréstimos
				case 1:
					System.out.print("\nInforme Nº de Exemplar (1-" + QTD + "): ");
					int nrExemp = scanner.nextInt();		// entrada de número de exemplar

					// habilitação de empréstimos para exemplar indicado por número
					acervo[nrExemp - 1].habilitarEmprestimo();					
					
					break;
				// desabilitação de empréstimos
				case 2:
					System.out.print("\nInforme Nº de Exemplar (1-" + QTD + "): ");
					nrExemp = scanner.nextInt();			// entrada de número de exemplar

					// desabilitação de empréstimos para exemplar indicado por número
					acervo[nrExemp - 1].desabilitarEmprestimo();					
					
					break;					
				// desabilitação de empréstimos
				case 3:
					System.out.print("\nInforme Nº de Exemplar (1-" + QTD + "): ");
					nrExemp = scanner.nextInt();			// entrada de número de exemplar

					// obtenção de referência de exemplar indicado por número (índice de array)
					Exemplar exemplar = acervo[nrExemp - 1];
					
					if (exemplar.isAptoEmprestimos()) {		// se exemplar habilitado para empréstimos...
						System.out.print("Informe data e horário [formato DD/MM/AAAA HH:MM]: ");
						Date dataHora = LeituraDataHora.ler(scanner);
						
						// registro de novo empréstimos para exemplar
						acervo[nrExemp - 1].adicionarEmprestimo(dataHora);											
					}
					else {									// caso contrário...
						System.out.println("\nExemplar não habilitado para empréstimos!");
					}
					
					break;
				// listagem de total de empréstimos
				case 4:
					int totalEmprestimos = 0;				// totalizador de emprestimos
					
					// atualização de totalizador com quantidade de empréstimos de cada exemplar
					for (int i = 0; i < acervo.length; i++)
						totalEmprestimos += acervo[i].getEmprestimos();
						
					// listagem de total de empréstimos
					System.out.println();
					System.out.println("Total de Empréstimos: " + totalEmprestimos);
					
					break;
				// identificação de exemplar com mais empréstimos
				case 5:
					// indicação de quantidade de empréstimos de exemplar com mais empréstimos
					int qtdMaiorEmprest = 0;				// inicialização de quantidade com 0 (zero)

					// consulta, exemplar por exemplar, para atualização de quantidade (maior)
					for (int i = 0; i < acervo.length; i++)
						if (acervo[i].getEmprestimos() > qtdMaiorEmprest)
							qtdMaiorEmprest = acervo[i].getEmprestimos();
					
					if (qtdMaiorEmprest == 0)				// se maior quantidade igual a 0 (zero)...
						System.out.println("\nNão há registro de nenhumm empréstimo ainda!");
					else {									// caso contrário
						System.out.println("\nExemplares com maior quantidade de empréstimos (" + qtdMaiorEmprest + "):");
						
						// listagem de dados de exemplares com maior quantidade de empréstimos
						for (int i = 0; i < acervo.length; i++)
							if (acervo[i].getEmprestimos() == qtdMaiorEmprest)
								System.out.println(acervo[i].getTitulo() + " (" + acervo[i].getAutoria() + ")");
					}
					
					break;
			}
		} while (op != 6);
		
		scanner.close();
	}

}