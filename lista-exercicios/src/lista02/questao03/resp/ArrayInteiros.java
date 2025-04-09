package lista02.questao03.resp;

public class ArrayInteiros {

	public static void main(String[] args) {
		int[] array = new int[] {2, 4, 6, 8, 10, 12};

		try {    // bloco de tratamento de exceção
		    for (int i = 0; i <= 12; i++) {
		        System.out.println(array[i]);   // acesso ao enésimo elemento do array
		    }
		}        // bloco de captura de exceção
		catch(ArrayIndexOutOfBoundsException excecao) {
		    System.out.println("Tentativa de acesso à índice inválido");
		}
	}

}