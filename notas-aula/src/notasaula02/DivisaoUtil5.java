package notasaula02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoUtil5 {

	public static int divisao(int dividendo, int divisor) { // método de divisão entre dois números
		return dividendo / divisor;
	}
	
	public static void main(String[] args) {
		Scanner scanner	= new Scanner(System.in);
		int dividendo 	= 0;
		int divisor 	= 0;
		boolean entradaValida;
		
		// entrada de dividendo
		entradaValida = false;
		do {
			try {
				System.out.print("Digite dividendo...: ");
				dividendo = scanner.nextInt();			 	// operação de entrada
				entradaValida = true;					 	// entrada bem sucedida
			}
			catch(InputMismatchException e) {
				System.out.println("Dividendo não informado corretamente! Tente novamente!\n");
				scanner.nextLine();							// descarte de entrada remanescente
			}
		} while (!entradaValida);

		// entrada de divisor
		entradaValida = false;
		do {
			try {
				System.out.print("Digite divisor.....: ");
				divisor = scanner.nextInt();			 	// operação de entrada
				entradaValida = true;					 	// entrada bem sucedida
			}
			catch(InputMismatchException e) {
				System.out.println("Divisor não informado corretamente! Tente novamente!\n");
				scanner.nextLine();							// descarte de entrada remanescente
			}
		} while (!entradaValida);
		
		// realização da operação de divisão
		try {
			int quociente = divisao(dividendo, divisor); 	// chamada de método para divisão
			entradaValida = true;					 	 	// entrada bem sucedida	
			System.out.printf("Quociente (Divisão): %d\n", quociente);			
		}
		catch(ArithmeticException e) {
			System.out.println("Divisão por 0 (zero) é inválida!\n");
			scanner.nextLine();							 	// descarte de entrada remanescente
		}
		finally {
			scanner.close();							 	// fechamento de fluxo de entrada
		}
	}

}
