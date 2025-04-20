package aula06.metodosgenericos;

import aula06.Mamifero;

public class Primata extends Mamifero {

	// sobrescrita de método herdado da classe Mamifero
	@Override
	protected void andar() {
		System.out.println("Primata andando...");
	}

	// método genérico sobrecarregado do método andar (parâmetro genérico para distância)
	protected <T> void andar(T metros) {
		System.out.printf("Mamífero andando %d metro(s)...", metros);
	}

}