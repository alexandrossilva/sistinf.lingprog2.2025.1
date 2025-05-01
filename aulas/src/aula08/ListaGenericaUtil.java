package aula08;

// Instanciação e manipulação de listas de vários tipos
public class ListaGenericaUtil {

	public static void main(String[] args) {
		ListaGenerica<String> lista 	= new ListaGenerica<String>(10);		// lista de strings
		
		try {
			lista.adicionar("Maria", 0);		// inserção de primeira string
			lista.adicionar("Alex", 0);			// inserção de segunda string
			lista.adicionar("João", 1);			// inserção de terceira string
			lista.adicionar("Sofia", 2);		// inserção de quarta string (exceção será lançada)
		}
		catch(Exception e) {					// captura de exceção
			// listagem de mensage de exceção
			System.out.println(e.getMessage());
		}
		finally {
			// listagem de inteiros até então inseridos
			System.out.println("Lista: " + lista);			
		}
	}

}