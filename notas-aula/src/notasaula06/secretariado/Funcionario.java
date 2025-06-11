package notasaula06.secretariado;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Funcionario implements Serializable {
	
	protected String nome;
	protected double salario;
	protected GregorianCalendar dataAdmissao;

	public Funcionario(String n, double s, int anoAdmissao, int mesAdmissao, int diaAdmissao) {
		nome = n;
		salario = s;
		dataAdmissao = new GregorianCalendar(anoAdmissao, mesAdmissao - 1, diaAdmissao);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public GregorianCalendar getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void reajustarSalario(double percentual) {		// reajuste de salário com base em percentual
		if (percentual > 0) {								// se percentual de reajuste válido...
			double reajuste = salario * percentual / 100;	// cálculo de reajuste
			salario += reajuste;							// incorporação de reajuste ao salário (atualização)
		}
	}
	
	public String toString() {
		return "[Nome: " + nome + ", " + 
			   "Salário: " + salario + ", " + 
			   "Admissão: " + new SimpleDateFormat("dd/MM/yyyy").format(dataAdmissao.getTime()) + "]";
	}
		
}
