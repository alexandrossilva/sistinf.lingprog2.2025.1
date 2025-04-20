package aula06;

// Instanciação e manipulação de listas de vários tipos
public class ListaGenericaUtil {

	public static void main(String[] args) {
		ListaGenerica<String> lista 	= new ListaGenerica<String>(3);		// lista de strings
		ListaGenerica<Integer> lista2 	= new ListaGenerica<Integer>(3);	// lista de inteiros
		ListaGenerica lista3 			= new ListaGenerica(3);				// lista de elementos do tipo Object
		
		try {
			lista.adicionar("Maria");		// inserção de primeira string
			lista.adicionar("Alex");		// inserção de segunda string
			lista.adicionar("João");		// inserção de terceira string
			lista.adicionar("Sofia");		// inserção de quarta string (exceção será lançada)
		}
		catch(Exception e) {				// captura de exceção
			// listagem de mensage de exceção
			System.out.println(e.getMessage());

			// listagem de inteiros até então inseridos
			System.out.println("Lista: " + lista);
		}
	}

}