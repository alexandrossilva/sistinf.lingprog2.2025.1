package notasaula01.parte2.classesinternas;

import java.util.Scanner;

public class SequenciaNumerosUtil {

	public static final int TAM = 5;
	
	public static void main(String[] args) {
		int[] numeros		 = new int[TAM];
		Scanner scanner 	 = new Scanner(System.in);
		SequenciaNumeros seq = new SequenciaNumeros(numeros);
		
		System.out.printf("Digite %d números separados por espaços: ", TAM);
		for (int i = 0; i < TAM; i++)
			numeros[i] = scanner.nextInt();
		
		seq.analise();
		
		scanner.close();
	}

}
