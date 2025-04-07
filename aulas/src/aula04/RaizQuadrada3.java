package aula04;

import java.util.InputMismatchException;
import java.util.Scanner;

// Cálculo de raiz quadrada de inteiro incluindo-se transferênca de tratamento de exceção por entrada inválida para método estático
public class RaizQuadrada3 {

	// método estático de entrada de inteiro
	public static int lerInteiro(Scanner scanner, String mensagemInicial) {
		// bloco de repetição de entrada de inteiro
		do {
			// bloco de execução passível de lançamento de exceção
			try {
				System.out.print(mensagemInicial);	// listagem de mensagem inicial
				return scanner.nextInt();			// operação de entrada (possibilidade de lançamento de exceção)
			}
			// captura de exceção em caso de entrada inválida para um inteiro
			catch (InputMismatchException e) {
				// listagem de mensagem de erro
				System.out.println("Entrada inválida! Tente novamente!");
				scanner.nextLine();					// descarte de entrada remanescente
			}
		} while (true);								// repetição de bloco enquanto houver lançamento de exceção
	}
	
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);

		// entrada de inteiro a partir de método estático declarado anteriormente
		n = lerInteiro(scanner, "Digite um número inteiro positivo: ");
		
		if (n <= 0) {				// se inteiro for negativo...
			System.out.printf("Não é um número inteiro positivo!\n");			
		}
		else {						// caso contrário, cálculo de raiz quadrada de inteiro
			System.out.printf("Raiz Quadrada de %d: %f", n, Math.sqrt(n));						
		}
						
		scanner.close();
	}

}