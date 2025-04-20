package aula06.metodosgenericos;

// Demonstração das capacidades da classe que contém método genérico
public class Util {

	public static void main(String[] args) {
		Primata p = new Primata();	// instanciação de objeto
		p.andar(20);				// invocação de método genérico passando-se parâmetro inteiro
		p.andar(20.5);				// invocação de método genérico passando-se parâmetro do tipo real
	}

}