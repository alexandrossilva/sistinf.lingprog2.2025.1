package aula05.v3;

// Demonstração de instanciação de apenas 1 (um) objeto da classe Exemplar com inclusão de mecanismo de tratamento de exceção
public class ExemplarUtil2 {

	public static void main(String[] args) {
		// bloco passível de lançamento de exceção, quando executado
		try {
			// instanciação de objeto da classe Exemplar
			Exemplar ex1 = new Exemplar(-1, "Java", "Deitel", false);			
		}
		// captura de exceção em decorrência de instanciação de objeto da classe Exemplar com parâmetros inválidos
		catch(ExemplarException e) {
			System.out.println(e.getMessage());
		}
	}

}