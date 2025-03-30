package lista01.questao14;

// Implementação de métodos de cálculo de área e perímetro de interface de 
// forma geométrica considerando particularidades de círculos
public class Circulo implements FormaGeometrica {

	// comprimento de raio
	private double raio;
	
	// construtor para inicialização de comprimento de raio
	public Circulo(double raio) {
		this.raio = raio;
	}

	// obtenção e retorno de perímetro com base em comprimento de raio
	public double getPerimento() {
		return 2 * Math.PI * raio;
	}

	// obtenção e retorno de perímetro com base em comprimento de área
	public double getArea() {
		return Math.PI * raio * raio;
	}
	
}