package aula06;

// Demonstração das capacidades da classe Primata
public class Util2 {

	public static void main(String[] args) {
		Primata p = new Primata();		// instanciação de objeto
		p.andar(20);					// invocação de primeira versão do método sobrecarregado
		p.andar(20.5);					// invocação de segunda versão do método sobrecarregado
	}

}