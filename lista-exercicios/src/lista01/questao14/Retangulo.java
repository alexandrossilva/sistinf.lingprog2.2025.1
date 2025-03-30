package lista01.questao14;

// Especialização de classe abstrata de quadriláteros considerando
// particularidade de retângulos (lados com comprimentos idênticos dois a dois)
public class Retangulo extends Quadrilatero {

	// construtor para inicialização de comprimentos dos lados (iguais dois a dois)
	public Retangulo(double base, double altura) {
		// invocação de construtor de superclasse de modo que 1º e 3º lados tenham 
		// mesmo comprimento (base) e 2º e 4º lados tenham igualmente mesmo comprimento (altura)
		super(base, altura, base, altura);
	}

	// obtenção e retorno de área com base em comprimentos de lados não paralelos
	public double getArea() {
		return lado1 * lado3;
	}
	
}