package aula06;

// Instanciação e manipulação de lista de inteiros
public class ListaNumerosUtil {

	public static void main(String[] args) {
		// instanciação de lista de inteiros com capacidade máxima de 3 (três) elementos
		ListaNumeros lista = new ListaNumeros(3);
		
		try {
			lista.adicionar(7);		// inserção de primeiro inteiro
			lista.adicionar(12);	// inserção de segundo inteiro
			lista.adicionar(1);		// inserção de terceiro inteiro
			lista.adicionar(3);		// tentativa de inserção de quarto inteiro (exceção será lançada)
		}
		catch(Exception e) {		// captura de exceção
			// listagem de mensage de exceção
			System.out.println(e.getMessage());
			
			// listagem de inteiros até então inseridos
			System.out.println("Lista: " + lista);
		}
	}

}
