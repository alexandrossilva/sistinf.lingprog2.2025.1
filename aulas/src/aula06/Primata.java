package aula06;

public class Primata extends Mamifero {

	// sobrescrita de método herdado da classe Mamifero
	@Override
	protected void andar() {
		System.out.println("Primata andando...");
	}

	// versão sobrecarregada do método andar (parâmetro inteiro)
	protected void andar(int metros) {
		System.out.printf("Mamífero andando %d metro(s)...", metros);
	}

	// segunda versão sobrecarregada do método andar (parâmetro númerico real)
	protected void andar(double metros) {
		System.out.printf("Mamífero andando %d metro(s)...", metros);
	}	

}