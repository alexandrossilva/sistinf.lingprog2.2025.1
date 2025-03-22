package notasaula02;

import java.util.Scanner;

public class RaizQuadradaUtil3 {

	public static double raizQuadrada(int n) throws Exception {
		if (n < 0)
			throw new Exception(n + " é um número negativo!");
		else
			return Math.sqrt(n);
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = scanner.nextInt();			 // entrada de número
		
		System.out.printf("Raiz Quadrada de %d: %f\n", n, raizQuadrada(n));			

		scanner.close();			
	}

}
