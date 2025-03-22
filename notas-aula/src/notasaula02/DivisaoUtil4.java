package notasaula02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoUtil4 {

	public static int divisao(int dividendo, int divisor) { // método de divisão entre dois números
		return dividendo / divisor;
	}
	
	public static void main(String[] args) {
		Scanner scanner		  = new Scanner(System.in);
		boolean entradaValida = false;
		
		do {
			try {
				System.out.print("Digite dividendo...: ");
				int dividendo = scanner.nextInt();			 // entrada de dividendo
				System.out.print("Digite divisor.....: ");
				int divisor = scanner.nextInt();			 // entrada de divisor
				
				int quociente = divisao(dividendo, divisor); // chamada de método para divisão
				entradaValida = true;					 	 // entrada bem sucedida	
				System.out.printf("Quociente (Divisão): %d\n", quociente);				
			}
			catch(InputMismatchException e) {
				System.out.println("Entrada não informada corretamente! Tente novamente!\n");
				scanner.nextLine();							 // descarte de entrada remanescente
			}
			catch(ArithmeticException e) {
				System.out.println("Divisão por 0 (zero) é inválida! Tente novamente!\n");
				scanner.nextLine();							 // descarte de entrada remanescente
			}
			finally {
				scanner.close();							 // fechamento de fluxo de entrada
			}
		} while (!entradaValida);
	}

}
