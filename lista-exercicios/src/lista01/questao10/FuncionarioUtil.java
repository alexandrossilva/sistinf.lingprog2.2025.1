package lista01.questao10;

import java.util.Scanner;
import lista01.questao09.Funcionario;

public class FuncionarioUtil {

	public static void main(String[] args) {
		Scanner scanner 	= new Scanner(System.in);		
		final int QTD 		= 5;					// quantidade de funcionários
		Funcionario[] func 	= new Funcionario[QTD]; // array de funcionários
		
		// entrada de dados de funcionários
		for (int i = 0; i < QTD; i++) {
			String nome, sobrenome;	// nome e sobrenome de cada funcionário
			double valorHora;		// valor por hora trabalhada de cada funcionário
			
			// entrada de dados de enésimo funcionário
			System.out.println("\nFuncionário " + (i + 1));
			System.out.print("Nome.....................: ");
			nome = scanner.nextLine();
			System.out.print("Sobrenome................: ");
			sobrenome = scanner.nextLine();
			System.out.print("Valor por Hora Trabalhada: ");
			valorHora = scanner.nextDouble();
			
			scanner.nextLine();	// descarte de leitura remanescente de caracteres
			
			// instanciação de objeto Funcionario e inclusão em array
			func[i] = new Funcionario(nome, sobrenome, valorHora);
		}
		
		int op;	// seleção de operação a fazer após entrada de dados de funcionários
		
		do {
			System.out.println();
			System.out.println("************ OPERACÕES ************");
			System.out.println("* 1 - Adicionar Horas Trabalhadas *");
			System.out.println("* 2 - Listas Salários Líquidos    *");
			System.out.println("* 3 - Encerrar                    *");
			System.out.println("***********************************");
			
			System.out.print("Informe Operação (1/2/3): ");
			op = scanner.nextInt();		// entrada de operação desejada
			
			switch(op) {
				case 1:
					System.out.print("\nInforme Nº de Funcionário (1-" + QTD + "): ");
					int nrFunc = scanner.nextInt();			// entrada de nº de funcionário
					System.out.print("Horas Trabalhadas a Adicionar..: ");
					int horas = scanner.nextInt();			// entrada de horas trabalhadas

					// atualização de horas trabalhadas de funcionário selecionado
					func[nrFunc - 1].adicionarCargaHoraria(horas);
					
					break;
				case 2:
					System.out.println();
					for (int i = 0; i < func.length; i++)	// listagem de salários líquidos
						System.out.println("Funcionário " + (i + 1) + ": " + func[i].getSalarioLiquido());
			}
		} while (op != 3);
		
		scanner.close();
	}

}