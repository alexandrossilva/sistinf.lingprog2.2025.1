package notasaula01.parte2.classesinternas;

import java.util.Scanner;

public class ConversorUtil {

	public static void main(String[] args) {
		
		// conversor de números decimais para números binários
		class ConversorDecBin {
			
			// número mínimo de bits após conversão (acréscimo de zeros à esquerda, se necessário)
			int numeroMinimoBits; 
			
			public ConversorDecBin(int numeroMinimoBits) {
				this.numeroMinimoBits = numeroMinimoBits;
			}
			
			public String getConversao(int num) {
				String numBinario = "";
				
				while (num > 0) {  	 // enquanto número for positivo
					// inclusão de resto da divisão do número por 2 na conversão
					numBinario = num % 2 + numBinario;
					num = num / 2;   // obtenção de novo número dividindo número atual por 2
				}
				
				// acréscimo de zeros à esquerda se conversão resultar em quantidade menor de bits
				while (numBinario.length() < numeroMinimoBits)
					numBinario = "0" + numBinario;
				
				return numBinario;
			}
			
		}
		
		Scanner scanner 		  = new Scanner(System.in);
		ConversorDecBin conversor = new ConversorDecBin(8);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scanner.nextInt();
		System.out.print("Número binário correspondente: " + conversor.getConversao(numero));

		scanner.close();
	}

}