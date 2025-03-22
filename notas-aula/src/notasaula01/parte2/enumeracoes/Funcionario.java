package notasaula01.parte2.enumeracoes;

import java.time.LocalDate;
import java.time.Period;

public class Funcionario {

	private String nome;
	private double salario;
	private LocalDate dataAdmissao;
	private LocalDate dataNascimento;

	public Funcionario() {
		nome = "";
		salario = 0;
		dataAdmissao = LocalDate.now();
	}

	public Funcionario(String n, double s, LocalDate admissao, LocalDate nascimento) {
		nome = n;
		salario = s;
		dataAdmissao = admissao;
		dataNascimento = nascimento;
	}
	
	public String getNome() {
		return nome;
	}
		
	public double getSalario() {
		return salario;
	}
	
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setSalario(double salario) {
		if (salario > 0)
			this.salario = salario;
	}
	
	public void reajustarSalario(double percentual) {
		double reajuste = salario * percentual / 100;
		salario += reajuste;
	}
	
	public boolean equals(Object outroObjeto) {
		// teste de nulidade do objeto passado como parâmetro
		if (outroObjeto == null)
			return false;
		// teste sobre se este objeto é idêntico ao objeto passado como parâmetro
		else if (this == outroObjeto)
			return true;
		// teste de objeto passado como parâmetro ser ou não ser da classe Funcionario
		else if (!(outroObjeto instanceof Funcionario))
			return false;
		else {
			Funcionario outroFunc = (Funcionario)outroObjeto;
			return nome.equals(outroFunc.getNome())
					&& salario == outroFunc.getSalario()
					&& dataAdmissao.equals(outroFunc.getDataAdmissao())
					&& dataNascimento.equals(outroFunc.getDataNascimento());					
		}
	}
	
	public String toString() {
		return "Funcionario[Nome = " + nome 
				+ ", Salário = " + salario 
				+ ", Data de Admissão = " + dataAdmissao
				+ ", Data de Nascimento = " + dataNascimento
				+ "]";
	}
	
	public FaixaEtaria getFaixaEtaria() {
		LocalDate dataAtual = LocalDate.now();	// data atual
		
		// período entre data de nascimento e data atual
		Period periodo = Period.between(dataNascimento, dataAtual);
		
		int anos = periodo.getYears();			// período em anos completos
		
		System.out.println(anos);
		
		if (anos < 12)		return FaixaEtaria.INFANTIL;
		else if (anos < 18)	return FaixaEtaria.ADOLESCENTE;
		else if (anos < 60)	return FaixaEtaria.ADULTA;
		else				return FaixaEtaria.IDOSA;
	}
	
}