package aula05.v3;

// Demonstração de instanciação de apenas 1 (um) objeto da classe Exemplar sem inclusão de mecanismo de tratamento de exceção
public class ExemplarUtil {

	public static void main(String[] args) {
		// instanciação de objeto da classe Exemplar (ERRO de compilação por ausência de mecanismo de tratamento de exceção verificada)
		Exemplar ex1 = new Exemplar(-1, "Java", "Deitel", false);			
	}

}