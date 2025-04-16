package aula05.v3;

// Demonstração de instanciação de apenas 1 (um) objeto da classe Exemplar sem inclusão de mecanismo de tratamento de exceção
public class ExemplarUtil3 {

	public static void main(String[] args) throws ExemplarException {
		// indicação de transferência de tratamento de exceção verificada da classe Exception para o método que invocar o método main
		Exemplar ex1 = new Exemplar(-1, "Java", "Deitel", false);			
	}

}