package lista03.questao11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lista03.questao09.InstituicaoEnsino;

public class InstituicaoEnsinoUtil {

	private static Scanner scanner;
	private static List<InstituicaoEnsino> instituicoes;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		instituicoes = new ArrayList<InstituicaoEnsino>();		// inicialização de lista
		String op;
		
		// repetição de operações enquanto última operação não for de encerramento do programa 
		do {
			listarOperacoes();					// listagem de operações disponíveis
			
			// entrada de operação
			System.out.print("\nOperação: ");
			op = scanner.nextLine();
			
			System.out.println();
			
			// identificação e execução de operação selecionada
			switch(op.toLowerCase()) {
				case "i":					// em se tratando de inserção de novo aluno...
					instituicoes.add(lerNovaInstituicao());
					System.out.println("\nAluno inserido em lista!\n");
					break;
				case "ipu":					// em se tratando de listagem de instituições públicas...
					listarInstituicoesPublicas();
					break;
				case "ipr":					// em se tratando de listagem de instituições privadas...
					listarInstituicoesPrivadas();
					break;
				case "ie":					// em se tratando de listagem de instituições por estado...
					listarInstituicoesEstado();
					break;
				case "iq":					// em se tratando de listagem de quantidade de instituições...
					listarQuantidadeInstituicoes();
					break;
				case "ir":					// em se tratando de listagem de instituições por região...
					listarInstituicoesRegiao();
					break;
				case "e":					// em se tratando de encerramento do programa...
					break;
				default : 					// caso contrário...
					System.out.println("ENTRADA INCORRETA! FORNEÇA-A NOVAMENTE!\n");
			}
		} while (!op.equals("e"));
	}
	
	public static void listarOperacoes() {
		System.out.println("********************** OPERAÇÕES ***********************");
		System.out.println("* I   -> Inserir Nova Instituição                      *");
		System.out.println("* IPU -> Listar Instituições Públicas                  *");
		System.out.println("* IPR -> Listar Instituições Privadas                  *");
		System.out.println("* IE  -> Listar Quantidade de Instituições de Estado   *");
		System.out.println("* IQ  -> Listar Quantidade Total de Instituições       *");
		System.out.println("* IR  -> Listar Percentuais de Instituições por Região *");
		System.out.println("* E   -> Encerrar                                      *");
		System.out.println("********************************************************");
	}

	// entrada de dados de nova instituição e retorno de respectivo objeto da classe InstituicaoEnsino
	public static InstituicaoEnsino lerNovaInstituicao() {
		String nome;				// nome da instituição
		String sigla = null;		// sigla da instituição
		String siglaEstado = null;	// sigla do estado no qual a instituição está sediada
		boolean publica = false;	// indicativo de instituição ser pública (true) ou não (false)
		int quantidadeCursos;		// quantidade de cursos da instituição
		String resp;				// entrada de resposta sobre se instituição é pública (s, de sim) ou não (n)

		System.out.println("INFORME DADOS DE NOVA INSTITUIÇÃO DE ENSINO");

		// entrada de nome
		System.out.print("Nome................: ");
		nome = scanner.nextLine();
		
		// entrada de sigla
		System.out.print("Sigla...............: ");
		sigla = scanner.nextLine();
		
		// entrada de sigla de estado enquanto última entrada não válida
		do {
			System.out.print("Estado..............: ");
			siglaEstado = scanner.nextLine().toUpperCase();
			
			// se sigla não estiver presente em lista de siglas válidas de estados...
			if (!getEstados().contains(siglaEstado))
				System.out.println("ENTRADA INVÁLIDA! INFORME-A NOVAMENTE!");
			
		} while (!getEstados().contains(siglaEstado));
		
		// entrada de tipo de instituição enquanto última entrada não válida
		do {
			System.out.print("Pública [S|N].......? ");
			resp = scanner.nextLine().toLowerCase();
			
			if (!resp.equals("s") && !resp.equals("n"))	// se entrada não for válida...
				System.out.println("ENTRADA INVÁLIDA! INFORME-A NOVAMENTE!");
			else											// caso contrário...
				publica = resp.equals("s");					// atualização de flag de tipo de instituição
		} while (!resp.equals("s") && !resp.equals("n"));
		
		// entrada de quantidade de cursos
		System.out.print("Quantidade de Cursos: ");
		quantidadeCursos = scanner.nextInt();
		scanner.nextLine();		// descarte de caracteres não processados em operação de entrada anterior
		
		// instanciação de novo objeto com os dados fornecidos pelo usuário e, após isso, retorno
		return new InstituicaoEnsino(nome, sigla, siglaEstado, publica, quantidadeCursos);
	}
	
	// retorno de lista com siglas válidas de estados
	public static List<String> getEstados() {
		List<String> estados = new ArrayList<String>();		// instanciação de lista de estados
		
		// inserção de siglas de estados em lista
		estados.add("AC");
		estados.add("AL");
		estados.add("AP");
		estados.add("AM");
		estados.add("BA");
		estados.add("CE");
		estados.add("DF");
		estados.add("ES");
		estados.add("GO");
		estados.add("MA");
		estados.add("MT");
		estados.add("MS");
		estados.add("MG");
		estados.add("PA");
		estados.add("PB");
		estados.add("PR");
		estados.add("PE");
		estados.add("PI");
		estados.add("RJ");
		estados.add("RN");
		estados.add("RS");
		estados.add("RO");
		estados.add("RR");
		estados.add("SC");
		estados.add("SP");
		estados.add("SE");
		estados.add("TO");		
		
		return estados;										// retorno de lista de estados
	}

	// listagem de instituições de ensino públicas até então inseridas
	public static void listarInstituicoesPublicas() {
		int qtd = 0;			// quantidade de instituições encontradas
		
		// iteração entre instituições inseridas na lista...
		for (InstituicaoEnsino instituicao: instituicoes) {
			// se enésima instituição for pública...
			if (instituicao.isPublica()) {
				qtd++;			// atualização de quantidade de instituições
				
				// listagem de dados de enésima instituição
				System.out.printf("\nINSTITUIÇÃO %d\n", qtd);				
				System.out.printf("Nome.: %s\n", instituicao.getNome());				
				System.out.printf("Sigla: %s\n", instituicao.getSigla());				
			}
		}		
		
		// listagem de total de instituições públicas
		System.out.printf("\nQuantidade de instituições públicas: %d\n\n", qtd);
	}

	// listagem de instituições de ensino privadas até então inseridas
	public static void listarInstituicoesPrivadas() {
		int qtd = 0;			// quantidade de instituições encontradas
		
		// iteração entre instituições inseridas na lista...
		for (InstituicaoEnsino instituicao: instituicoes) {
			// se enésima instituição não for pública (ou seja, se for privada)...
			if (instituicao.isPublica()) {
				qtd++;			// atualização de quantidade de instituições
				
				// listagem de dados de enésima instituição
				System.out.printf("\nINSTITUIÇÃO %d\n", qtd);				
				System.out.printf("Nome.: %s\n", instituicao.getNome());				
				System.out.printf("Sigla: %s\n", instituicao.getSigla());				
			}
		}		
		
		// listagem de total de instituições públicas
		System.out.printf("\nQuantidade de instituições privadas: %d\n\n", qtd);
	}
	
	// listagem de instituições, até então inseridas, de determinado estado indicado por usuário
	public static void listarInstituicoesEstado() {
		// entrada de sigla de estado
		System.out.print("Informe sigla de estado: ");
		String sigla = scanner.nextLine();
		
		int qtd = 0;			// quantidade de instituições encontradas
		
		// iteração entre instituições inseridas na lista...
		for (InstituicaoEnsino instituicao: instituicoes) {
			// se sigla de estado de enésima instituição corresponder à sigla informada pelo usuário...
			if (instituicao.getSiglaEstado().equalsIgnoreCase(sigla))
				qtd++;			// atualização de quantidade de instituições
		}		
		
		// listagem de total de instituições
		System.out.printf("\nQuantidade de instituições do estado %s: %d\n\n",
						  sigla.toUpperCase(), qtd);
	}

	// listagem de quantidade de instituições até então inseridas
	public static void listarQuantidadeInstituicoes() {
		// listagem de total de instituições
		System.out.printf("Quantidade de instituições inseridas: %d\n\n", instituicoes.size());
	}

	// listagem de instituições, até então inseridas, por região
	public static void listarInstituicoesRegiao() {
		int qtdNorte = 0;			// quantidade de instituições da região Norte
		int qtdNordeste = 0;		// quantidade de instituições da região Nordeste
		int qtdCentroOeste = 0;		// quantidade de instituições da região Centro-Oeste
		int qtdSul = 0;				// quantidade de instituições da região Sul
		int qtdSudeste = 0;			// quantidade de instituições da região Sudeste
		
		// iteração entre instituições inseridas na lista...
		for (InstituicaoEnsino instituicao: instituicoes) {
			// obtenção de sigla do estado da institução
			String sigla = instituicao.getSiglaEstado();
			
			// se sigla for de algum estado da região Norte...
			if (sigla.equals("AC") || sigla.equals("AP") || sigla.equals("AM") || sigla.equals("PA") ||
				sigla.equals("RO") || sigla.equals("RR") || sigla.equals("TO"))
				qtdNorte++;			// atualização da quantidade de instituições da região Norte
			// caso contrário, se sigla for de algum estado da região Nordeste...
			else if (sigla.equals("AL") || sigla.equals("BA") || sigla.equals("CE") || sigla.equals("MA") || 
					 sigla.equals("PB") || sigla.equals("PE") || sigla.equals("PI") || sigla.equals("RN") ||
					 sigla.equals("SE"))
				qtdNorte++;			// atualização da quantidade de instituições da região Nordeste
			// caso contrário, se sigla for de algum estado da região Centro-Oeste...
			else if (sigla.equals("DF") || sigla.equals("GO") || sigla.equals("MT") || sigla.equals("MS"))
				qtdCentroOeste++;	// atualização da quantidade de instituições da região Centro-Oeste
			// caso contrário, se sigla for de algum estado da região Sudeste...
			else if (sigla.equals("ES") || sigla.equals("MG") || sigla.equals("SP") || sigla.equals("RJ"))
				qtdCentroOeste++;	// atualização da quantidade de instituições da região Sudeste
			// caso contrário, se sigla for de algum estado da região Sudeste...
			else
				qtdSul++;			// atualização da quantidade de instituições da região Sul
		}		
		
		// listagem de total de instituições por região
		System.out.printf("\nInstituições da região %s: %.2f%%",
						  "Norte", qtdNorte * 100.0 / instituicoes.size());
		System.out.printf("\nInstituições da região %s: %.2f%%",
						  "Nordeste", qtdNordeste * 100.0 / instituicoes.size());
		System.out.printf("\nInstituições da região %s: %.2f%%",
						  "Centro-Oeste", qtdCentroOeste * 100.0 / instituicoes.size());
		System.out.printf("\nInstituições da região %s: %.2f%%",
						  "Sudeste", qtdSudeste * 100.0 / instituicoes.size());
		System.out.printf("\nInstituições da região %s: %.2f%%\n\n",
						  "Sul", qtdSul * 100.0 / instituicoes.size());
	}

}