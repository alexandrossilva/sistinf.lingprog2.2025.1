package notasaula01.parte1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Funcionario {

	private String nome;
	private double salario;
	private Date dataAdmissao;

	public Funcionario() {
		this("", 0d, new GregorianCalendar().get(Calendar.YEAR), 1, 1);
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
	
}