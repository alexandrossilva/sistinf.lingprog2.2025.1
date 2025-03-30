package lista01.questao14;

public abstract class Quadrilatero implements FormaGeometrica {

	// comprimentos dos lados
	double lado1;
	double lado2;
	double lado3;
	double lado4;
	
	// construtor para inicialização de comprimentos de lados do quadrilátero
	public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	// obtenção de perímetro a partir de soma dos comprimentos dos lados
	public double getPerimento() {
		return lado1 + lado2 + lado3 + lado3;
	}
	
}