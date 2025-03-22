package notasaula02;

import java.util.Scanner;

public class RaizQuadradaUtil4 {

	public static double raizQuadrada(int n) throws RaizQuadradaNumeroNegativoException {
		if (n < 0)
			throw new RaizQuadradaNumeroNegativoException(n + " é um número negativo!");
		else
			return Math.sqrt(n);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = scanner.nextInt();			 // entrada de número
		
		try {
			System.out.printf("Raiz Quadrada de %d: %f\n", n, raizQuadrada(n));			
		}
		catch(RaizQuadradaNumeroNegativoException e) {
			System.out.println(e.getMessage());
		}
		finally {
			scanner.close();			
		}
	}

}
