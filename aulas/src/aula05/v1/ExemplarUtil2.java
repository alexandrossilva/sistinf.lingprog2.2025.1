package aula05.v1;

// Demonstração de instanciação de apenas 1 (um) objeto da classe Exemplar sem inclusão de mecanismo de tratamento de exceção
public class ExemplarUtil2 {

	public static void main(String[] args) {
		// instanciação de objeto da classe Exemplar (possível lançamento de exceção não verificada da classe IllegalArgumentException)
		Exemplar ex1 = new Exemplar(-1, "Java", "Deitel", false);			
	}

}