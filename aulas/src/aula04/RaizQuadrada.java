package aula04;

import java.util.Scanner;

// Cálculo de raiz quadrada de inteiro
public class RaizQuadrada {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite um número inteiro positivo: ");
		n = scanner.nextInt();		// entrada de inteiro
		
		if (n <= 0) {				// se inteiro for negativo...
			System.out.printf("Não é um número inteiro positivo!\n");			
		}
		else {						// caso contrário, cálculo de raiz quadrada de inteiro
			System.out.printf("Raiz Quadrada de %d: %f", n, Math.sqrt(n));						
		}
				
		scanner.close();
	}

}