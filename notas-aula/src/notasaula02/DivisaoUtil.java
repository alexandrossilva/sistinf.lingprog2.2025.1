package notasaula02;

import java.util.Scanner;

public class DivisaoUtil {

	public static int divisao(int dividendo, int divisor) {  // método de divisão entre dois números
		return dividendo / divisor;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite dividendo...: ");
		int dividendo = scanner.nextInt();			 // entrada de dividendo
		System.out.print("Digite divisor.....: ");
		int divisor = scanner.nextInt();			 // entrada de divisor
		
		int quociente = divisao(dividendo, divisor); // chamada de método para divisão
		System.out.printf("Quociente (Divisão): %d\n", quociente);
	}

}
