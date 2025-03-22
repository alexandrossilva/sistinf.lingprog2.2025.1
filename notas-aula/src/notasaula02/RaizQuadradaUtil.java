package notasaula02;

import java.util.Scanner;

public class RaizQuadradaUtil {

	public static double raizQuadrada(int n) {
		if (n < 0)
			throw new IllegalArgumentException(n + " é um número negativo!");
		else
			return Math.sqrt(n);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = scanner.nextInt();			 // entrada de número
		
		System.out.printf("Raiz Quadrada de %d: %f\n", n, raizQuadrada(n));
		
		scanner.close();
	}

}
