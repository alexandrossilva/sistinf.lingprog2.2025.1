package lista03.questao09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstituicaoEnsinoUtil {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		List<InstituicaoEnsino> instituicoes = new ArrayList<InstituicaoEnsino>();
		String op;
		
		// repetição de operações enquanto última operação não for de encerramento do programa 
		do {
			// entrada de operação
			System.out.print("Encerrar [E] ou inserir nova instituição [I]? ");
			op = scanner.nextLine();
			
			// identificação e execução de operação a partir de entrada
			switch(op.toLowerCase()) {
				case "i":										// em se tratando de operação de inserção de nova instituição...
					System.out.println();
					// entrada de dados de nova instituição e inserção em lista
					instituicoes.add(lerNovaInstituicao());
					System.out.println("Instituição inserida em lista!\n");
					break;
				default : 							// caso contrário...
					if (!op.equals("e"))			// em não se tratando de operação de encerramento...
						System.out.println("ENTRADA INCORRETA! FORNEÇA-A NOVAMENTE!");
			}
		} while (!op.equals("e"));
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
			sigla = scanner.nextLine().toUpperCase();
			
			// se sigla não estiver presente em lista de siglas válidas de estados...
			if (!getEstados().contains(sigla))
				System.out.println("ENTRADA INVÁLIDA! INFORME-A NOVAMENTE!");
			
		} while (!getEstados().contains(sigla));
		
		// entrada de tipo de instituição enquanto última entrada não válida
		do {
			System.out.print("Pública [S|N].......? ");
			resp = scanner.nextLine().toLowerCase();
			
			if (!resp.equals("s") && !sigla.equals("n"))	// se entrada não for válida...
				System.out.println("ENTRADA INVÁLIDA! INFORME-A NOVAMENTE!");
			else											// caso contrário...
				publica = resp.equals("s");					// atualização de flag de tipo de instituição
		} while (!resp.equals("s") && !sigla.equals("n"));
		
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

}
