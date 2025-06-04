package lista03.questao08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lista03.questao06.Aluno;

public class AlunoUtil {

	private static Scanner scanner;
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String op;
		
		// entrada de dados de novo aluno e inserção em lista
		alunos.add(lerNovoAluno());
		System.out.println("\nAluno inserido em lista!\n");
		
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
					alunos.add(lerNovoAluno());
					System.out.println("\nAluno inserido em lista!\n");
					break;
				case "lc":					// em se tratando de listagem de alunos por curso...
					listarAlunosCurso();
					break;
				case "las":					// em se tratando de listagem de alunos por ano e semestre...
					listarAlunosAnoSemestre();
					break;
				case "lq":					// em se tratando de listagem de quantidade de alunos...
					listarQuantidadeAlunos();
					break;
				case "ls":					// em se tratando de listagem de percentuais de alunos por sexo...
					listarPercentuaisSexo();
					break;
				case "e":					// em se tratando de encerramento do programa...
					break;
				default : 					// caso contrário...
					System.out.println("ENTRADA INCORRETA! FORNEÇA-A NOVAMENTE!\n");
			}
		} while (!op.equals("e"));
	}

	public static void listarOperacoes() {
		System.out.println("****************** OPERAÇÕES *******************");
		System.out.println("* I   -> Inserir Novo Aluno                    *");
		System.out.println("* LC  -> Listar Alunos por Curso               *");
		System.out.println("* LAS -> Listar Alunos por Ano e Semestre      *");
		System.out.println("* LQ  -> Listar Quantidade de Alunos           *");
		System.out.println("* LS  -> Listar Percentuais de Alunos por Sexo *");
		System.out.println("* E   -> Encerrar                              *");
		System.out.println("************************************************");
	}
	
	// entrada de dados de novo aluno e retorno de respectivo objeto da classe Aluno
	public static Aluno lerNovoAluno() {
		int matricula, anoIngresso, semestreIngresso;
		String nome, sexo, curso;

		System.out.println("INFORME DADOS DE NOVO ALUNO");

		// entrada de número de matrícula
		System.out.print("Matrícula.................: ");
		matricula = scanner.nextInt();
		scanner.nextLine();		// descarte de caracteres não processados em operação de entrada anterior

		// entrada de nome
		System.out.print("Nome......................: ");
		nome = scanner.nextLine();
		
		// entrada de sexo enquanto última entrada não válida
		do {
			System.out.print("Sexo [F|M]................: ");
			sexo = scanner.nextLine().toUpperCase();
			
			// se entrada for inválida...
			if (!sexo.equals("F") && !sexo.equals("M"))
				System.out.println("ENTRADA DE SEXO INVÁLIDA! INFORME-O NOVAMENTE!");
			
		} while (!sexo.equals("F") && !sexo.equals("M"));
		
		// entrada de nome do curso
		System.out.print("Curso.....................: ");
		curso = scanner.nextLine();
		
		// entrada de ano de ingresso
		System.out.print("Ano de Ingresso...........: ");
		anoIngresso = scanner.nextInt();
		
		// entrada de semestre de ingresso enquanto última entrada não válida
		do {
			System.out.print("Semestre de Ingresso [1|2]: ");
			semestreIngresso = scanner.nextInt();
			
			// se entrada for inválida...
			if (semestreIngresso < 1 || semestreIngresso > 2)
				System.out.println("ENTRADA DE SEMESTRE DE INGRESSO INVÁLIDA! INFORME-O NOVAMENTE!");
		} while (semestreIngresso < 1 || semestreIngresso > 2);
		
		scanner.nextLine();		// descarte de caracteres não processados em operação de entrada anterior
		
		// instanciação de novo objeto com os dados fornecidos pelo usuário e, após isso, retorno
		return new Aluno(matricula, nome, sexo, curso, anoIngresso, semestreIngresso);
	}
	
	// listagem de alunos, até então inseridos, de determinado curso indicado por usuário
	public static void listarAlunosCurso() {
		// entrada de nome do curso
		System.out.print("Informe nome do curso: ");
		String curso = scanner.nextLine();
		
		int qtd = 0;			// quantidade de alunos encontrados
		
		// iteração entre alunos inseridos na lista...
		for (Aluno aluno: alunos) {
			// se curso de enésimo aluno corresponder ao curso informado pelo usuário...
			if (aluno.getCurso().equalsIgnoreCase(curso)) {
				qtd++;			// atualização de quantidade de alunos
				
				// listagem de dados de enésimo aluno
				System.out.printf("\nALUNO %d\n", qtd);				
				System.out.printf("Matrícula: %d\n", aluno.getMatricula());				
				System.out.printf("Nome.....: %s\n", aluno.getNome());				
				System.out.printf("Ingresso.: %d.%d\n", aluno.getAnoIngresso(), 
								  aluno.getSemestreIngresso());				
			}
		}		
		
		// listagem de total de alunos
		System.out.printf("\nQuantidade de alunos do curso %s: %d\n\n", curso.toUpperCase(), qtd);
	}

	// listagem de alunos, até então inseridos, de determinado ano e semestre indicado por usuário
	public static void listarAlunosAnoSemestre() {
		// entrada de ano e semestre de ingresso
		System.out.print("Informe ano de ingresso: ");
		int ano = scanner.nextInt();
		System.out.print("Informe semestre de ingresso [1|2]: ");
		int semestre = scanner.nextInt();
		
		int qtd = 0;			// quantidade de alunos encontrados
		
		// iteração entre alunos inseridos na lista...
		for (Aluno aluno: alunos) {
			// se ano/semestre de ingresso de enésimo aluno corresponder ao ano/semestre indicado...
			if (aluno.getAnoIngresso() == ano && aluno.getSemestreIngresso() == semestre) {
				qtd++;			// atualização de quantidade de alunos
				
				// listagem de dados de enésimo aluno
				System.out.printf("\nALUNO %d\n", qtd);				
				System.out.printf("Matrícula: %d\n", aluno.getMatricula());				
				System.out.printf("Nome.....: %s\n", aluno.getNome());				
				System.out.printf("Curso....: %s\n", aluno.getCurso());				
			}
		}		
		
		// listagem de total de alunos
		System.out.printf("\nQuantidade de alunos ingressantes no ano %d e semestre %d: %d\n\n",
						  ano, semestre, qtd);
	}

	// listagem de quantidade de alunos até então inseridos
	public static void listarQuantidadeAlunos() {
		// listagem de total de alunos
		System.out.printf("Quantidade de alunos inseridos: %d\n\n", alunos.size());
	}

	// listagem de percentuais de alunos, até então inseridos, por sexo
	public static void listarPercentuaisSexo() {
		int qtdMasculino = 0;			// quantidade de alunos do sexo masculino encontrados
		int qtdFeminino = 0;			// quantidade de alunos do sexo feminino encontrados
		
		// iteração entre alunos inseridos na lista...
		for (Aluno aluno: alunos) {
			if (aluno.getSexo().equalsIgnoreCase("f"))			// se enésimo aluno for do sexo feminino...
				qtdFeminino++;									// atualização de quantidade de alunos do sexo feminino
			else												// caso contrário...
				qtdMasculino++;									// atualização de quantidade de alunos do sexo masculino
		}		
		
		// listagem de percentuais de alunos por sexo considerando quantidades
		System.out.printf("Alunos do sexo feminino.: %.2f%%\n", 
						  qtdFeminino * 100.0 / alunos.size());
		System.out.printf("Alunos do sexo masculino: %.2f%%\n\n",
						  qtdMasculino * 100.0 / alunos.size());
	}

}