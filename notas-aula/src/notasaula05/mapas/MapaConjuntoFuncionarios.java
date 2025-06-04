package notasaula05.mapas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class MapaConjuntoFuncionarios {

	final static Scanner scanner = new Scanner(System.in);
	final static HashMap<Character, Set<Funcionario>> mapaFunc = new HashMap<Character, Set<Funcionario>>();
	
	public static void main(String[] args) {
		char operacao;
		
		// bloco de repetição para realização de operações de inserção e consulta em mapa
		do {
			System.out.print("\nInserir (I), Listar (L) ou Encerrar (E)? ");
			operacao = scanner.nextLine().toLowerCase().charAt(0);
			
			switch(operacao) {
				case 'i': inserirFuncionario(); break;
				case 'l': listarFuncionarios(); break;
			}
		} while (operacao != 'e');

		scanner.close();
	}
	
	// entrada de dados de novo funcionário e inserção em conjunto armazenado no mapa
	private static void inserirFuncionario() {
		// entrada de dadas de novo funcionário
		System.out.println("\nNOVO FUNCIONÁRIO");
		System.out.print("CPF: ");
		String cpf = scanner.nextLine();
		System.out.print("Nome: ");
		String nome = scanner.nextLine().toUpperCase();
		System.out.print("Salário: ");
		double salario = scanner.nextDouble();
		scanner.nextLine();		// esvaziamento de fluxo de entrada
		System.out.print("Data Admissão (DD/MM/AAAA): ");
		StringTokenizer tokensData = new StringTokenizer(scanner.nextLine(), "/");
		int dia = Integer.parseInt(tokensData.nextToken());
		int mes = Integer.parseInt(tokensData.nextToken());
		int ano = Integer.parseInt(tokensData.nextToken());
		
		// instanciação de novo objeto da classe Funcionario com os dados fornecidos
		Funcionario novoFunc = new Funcionario(cpf, nome, salario, dia, mes, ano);
		
		char letraInicial = nome.charAt(0);		// letra inicial do nome do novo funcionário
		
		// obtenção de conjunto de funcionários mapeado com a letra inicial
		Set<Funcionario> conjuntoFunc = mapaFunc.get(letraInicial);

		// criação de novo conjunto e inserção no mapa (caso ainda não existe nenhum conjunto)
		if (conjuntoFunc == null) {
			conjuntoFunc = new HashSet<Funcionario>();
			mapaFunc.put(letraInicial, conjuntoFunc);
		}
		
		// inserção de novo funcionário no conjunto mapeado
		conjuntoFunc.add(novoFunc);
	}

	// listagem de funcionários inseridos e com nome que se iniciam com determinada letra
	private static void listarFuncionarios() {
		System.out.println("\nLISTAGEM DE FUNCIONÁRIOS");		
		System.out.print("Funcionários com nomes com qual letra inicial? ");
		char letraInicial = scanner.nextLine().toUpperCase().charAt(0);
		
		// obtenção de conjunto de funcionários com nome iniciado com letra informada
		Set<Funcionario> conjuntoFunc = mapaFunc.get(letraInicial);
		
		if (conjuntoFunc == null)
			System.out.println("Nenhum funcionário com nome iniciado com a letra " + letraInicial + "!");
		else
			for (Funcionario func: conjuntoFunc)
				System.out.println(func);
	}

}
