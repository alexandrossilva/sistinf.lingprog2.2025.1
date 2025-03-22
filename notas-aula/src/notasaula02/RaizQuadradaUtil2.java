package notasaula02;

import java.util.Scanner;

public class RaizQuadradaUtil2 {

	public static double raizQuadrada(int n) throws Exception {
		if (n < 0)
			throw new Exception(n + " é um número negativo!");
		else
			return Math.sqrt(n);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean controle = true;
		
		do {
			try {
				System.out.print("Digite um número inteiro: ");
				int n = scanner.nextInt();			 // entrada de número
				
				System.out.printf("Raiz Quadrada de %d: %f\n", n, raizQuadrada(n));			
				controle = false;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}			
		} while (controle);
		
	}

}
