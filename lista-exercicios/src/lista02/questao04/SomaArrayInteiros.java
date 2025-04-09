package lista02.questao04;

import java.util.Scanner;

public class SomaArrayInteiros {

	public static void main(String[] args) {
		double soma 	 = 0;
		double numeros[] = null;
		boolean entradaInvalida = true;
		Scanner scanner  = new Scanner(System.in);
		
		// repetição de entrada de tamanho de array enquanto ele for negativo
		do {
			System.out.print("Informe Tamanho de Array: ");
			int tamanho = scanner.nextInt();
			
			try {
				numeros = new double[tamanho];	// instanciação de array
				
				// atualização de variável de controle de bloco de repetição 
				// (em caso de êxito na instanciação do array)
				entradaInvalida = false;
			}
			// captura de exceção em caso de tentativa de instanção de array com tamanho negativo
			catch(NegativeArraySizeException e) {
				System.out.println("Tamanho de array inválido. Digite novamente!");
			}
		} while (entradaInvalida);

		// entrada de números em quantidade equivalente ao tamanho do array
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite %2dº número: ", i + 1);			
			numeros[i] = scanner.nextDouble();	// entrada de enésimo número
			soma += numeros[i];					// atualização de soma de números informados
		}
		
		System.out.println("Soma = " + soma);	// exibição de soma de números informados
		
		scanner.close();
	}

}