package lista01.questao14;

// Especialização de classe abstrata de quadriláteros considerando
// particularidade de quadrados (todos os lados com mesmo comprimento)
public class Quadrado extends Quadrilatero {

	// construtor para inicialização de comprimentos dos lados (todos iguais)
	public Quadrado(double lado) {
		// invocação de construtor de superclasse de modo que todos os lados tenham 
		// mesmo comprimento (indicação de mesmo parâmetro para os 4 lados)
		super(lado, lado, lado, lado);
	}

	// obtenção e retorno de área com base em comprimento de um dos lado
	public double getArea() {
		return lado1 * lado1;
	}
	
}