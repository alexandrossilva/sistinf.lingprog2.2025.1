package notasaula01.parte2.abstracao;

public class Funcionario extends Pessoa {

	private double salario;

	public Funcionario(String n, double s) {
		super(n);
		salario = s;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void reajustarSalario(double percentual) {
		double reajuste = salario * percentual / 100;
		salario += reajuste;
	}

	public String getDescricao() {
		return "Funcionário " + getNome() + ", com um salário de R$ " + salario;
	}
	
}