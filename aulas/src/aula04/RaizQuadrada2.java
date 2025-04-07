package aula04;

import java.util.InputMismatchException;
import java.util.Scanner;

// Cálculo de raiz quadrada de inteiro incluindo-se tratamento de exceção por entrada inválida
public class RaizQuadrada2 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);

		// bloco de execução de entrada de inteiro e cálculo de raiz quadrada (passível de lançamento de exceção)
		try {
			System.out.printf("Digite um número inteiro positivo: ");
			n = scanner.nextInt();		// entrada de inteiro
			
			if (n <= 0) {				// se inteiro for negativo...
				System.out.printf("Não é um número inteiro positivo!\n");			
			}
			else {						// caso contrário, cálculo de raiz quadrada de inteiro
				System.out.printf("Raiz Quadrada de %d: %f", n, Math.sqrt(n));						
			}
		}
		// bloco de captura de exceção em virtude de entrada inválida de inteiro
		catch(InputMismatchException e) {
			System.out.printf("Entrada inválida!\n");
		}
						
		scanner.close();
	}

}