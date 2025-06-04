package lista03.questao06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoUtil {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<Aluno>();
		String op;
		
		// entrada de dados de novo aluno e inserção em lista
		alunos.add(lerNovoAluno());
		System.out.println("Aluno inserido em lista!\n");
		
		// repetição de operações enquanto última operação não for de encerramento do programa 
		do {
			// entrada de operação
			System.out.print("Encerrar [E] ou inserir novo aluno [I]? ");
			op = scanner.nextLine();
			
			switch(op.toLowerCase()) {
				case "i":							// em se tratando de operação de inserção de novo aluno...
					alunos.add(lerNovoAluno());		// entrada de dados de novo aluno e inserção em lista
					System.out.println("Aluno inserido em lista!\n");
					break;
				default : 							// caso contrário...
					if (!op.equals("e"))			// em não se tratando de operação de encerramento...
						System.out.println("ENTRADA INCORRETA! FORNEÇA-A NOVAMENTE!");
			}
		} while (!op.equals("e"));
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

}
