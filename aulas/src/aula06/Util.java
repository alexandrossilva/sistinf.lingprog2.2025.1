package aula06;

// Demonstração das capacidades das classes Mamifero e Primata
public class Util {

	public static void main(String[] args) {
		Mamifero m = new Primata();		// atribuição de objeto à variável do tipo da classe herdada
		m.andar();						// invocação de método sobrescrito definido na classe herdada
		((Primata)m).andar(20);			// invocação de primeira versão do método sobrecarregado (necessidade de cast)
		((Primata)m).andar(20.5);		// invocação de segundo versão do método sobrecarregado (necessidade de cast)
	}

}