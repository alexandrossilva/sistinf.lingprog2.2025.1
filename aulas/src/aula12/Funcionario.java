package aula12;

// Encapsulamento de dados típicos de funcionáros
public class Funcionario {

	private String nome;		// nome
	private double salario;		// salário atual
	
	// método construtor
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	// retorno de nome do funcionário
	public String getNome() {
		return nome;
	}

	// atualização de nome do funçionário
	public void setNome(String nome) {
		this.nome = nome;
	}

	// retorno de salário atual do funcionário
	public double getSalario() {
		return salario;
	}

	// atualização de salário atual do funçionário
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
