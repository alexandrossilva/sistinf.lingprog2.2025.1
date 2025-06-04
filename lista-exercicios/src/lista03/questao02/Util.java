package lista03.questao02;

public class Util {

	// retorno de número reverso daquele indicado como parâmetro
	public static int getNumeroReverso(int n) {
		int ultimoDigito;
		int nReverso = 0;								// número reverso a ser retornado
		
		// repetição enquanto número passado como parâmetro permanecer diferente de 0 (zero)
		while (n != 0) {
			ultimoDigito = n % 10;						// obtenção de último dígito do número
	    	nReverso = nReverso * 10 + ultimoDigito;	// obtenção de novo número reverso
		    n = n / 10; 								// atualização do número dividindo-o por 10 (dez)
		}
		
		return nReverso;								// retorno de número reverso
	}

}