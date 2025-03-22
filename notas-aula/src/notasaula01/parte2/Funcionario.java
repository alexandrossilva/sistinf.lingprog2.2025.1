package notasaula01.parte2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Funcionario {

	private String nome;
	private double salario;
	private Date dataAdmissao;

	public Funcionario() {
		nome = "";
		salario = 0;
		dataAdmissao = new Date();
	}

	public Funcionario(String n, double s, int anoAdmissao, int mesAdmissao, int diaAdmissao) {
		nome = n;
		salario = s;
		GregorianCalendar dataAdmissaoTemp = new GregorianCalendar(anoAdmissao, mesAdmissao - 1, diaAdmissao);
		dataAdmissao = dataAdmissaoTemp.getTime();		
	}
	
	public String getNome() {
		return nome;
	}
		
	public double getSalario() {
		return salario;
	}
	
	public Date getDataAdmissao() {
		return dataAdmissao;
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
					&& dataAdmissao.equals(outroFunc.getDataAdmissao());					
		}
	}
	
	public String toString() {
		return "Funcionario[Nome = " + nome 
				+ ", Salário = " + salario 
				+ ", Data de Admissão = " + dataAdmissao
				+ "]";
	}
	
}