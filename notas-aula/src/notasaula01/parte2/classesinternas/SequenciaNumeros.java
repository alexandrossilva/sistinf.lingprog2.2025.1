package notasaula01.parte2.classesinternas;

public class SequenciaNumeros {
	
	private int[] numeros;  // array de números
	
	public SequenciaNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	
	public void analise() {
		AnalisadorEstatistico analisador = new AnalisadorEstatistico();
		
		System.out.println("Mínimo: " + analisador.maximo());
		System.out.println("Máximo: " + analisador.minimo());
		System.out.println("Média.: " + analisador.media());
	}
	
	class AnalisadorEstatistico {

		int minimo() {
			int min = numeros[0];
			for (int i = 1; i < numeros.length; i++)
				min = numeros[i] < min ? numeros[i] : min;
			return min;
		}
		
		int maximo() {
			int max = numeros[0];
			for (int i = 1; i < numeros.length; i++)
				max = numeros[i] > max ? numeros[i] : max;
			return max;
		}
		
		double media() {
			double soma = 0;
			for (int i = 0; i < numeros.length; i++)
				soma += numeros[i];
			return soma / numeros.length;
		}
		
	}

}