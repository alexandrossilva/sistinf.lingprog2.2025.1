package aula06;

public class PrimataGenerico extends Mamifero {
	
	protected void andar() {
		System.out.println("Primata andando...");
	}

	protected <T> void andar(T metros) {
		System.out.printf("Mamífero andando %d metro(s)...", metros);
	}

}
