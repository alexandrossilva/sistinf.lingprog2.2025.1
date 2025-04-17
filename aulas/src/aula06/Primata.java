package aula06;

public class Primata extends Mamifero {
	
	protected void andar() {
		System.out.println("Primata andando...");
	}

	protected void andar(int metros) {
		System.out.printf("Mamífero andando %d metro(s)...", metros);
	}

	protected void andar(double metros) {
		System.out.printf("Mamífero andando %d metro(s)...", metros);
	}	

}
