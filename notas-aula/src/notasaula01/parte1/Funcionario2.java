package notasaula01.parte1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Funcionario2 {

	private static int proximoId = 1;
	
	private int id;
	private String nome;
	private double salario;
	private Date dataAdmissao;

	public Funcionario2(String n, double s, int anoAdmissao, int mesAdmissao, int diaAdmissao) {
		setId();
		nome = n;
		salario = s;
		GregorianCalendar dataAdmissaoTemp = new GregorianCalendar(anoAdmissao, mesAdmissao - 1, diaAdmissao);
		dataAdmissao = dataAdmissaoTemp.getTime();		
	}
	
	public int getId() {
		return id;
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
	
	public static int getProximoId() {
		return proximoId;
	}
	
	public void setSalario(double salario) {
		if (salario > 0)
			this.salario = salario;
	}
	
	private void setId() {
		this.id = proximoId;
		proximoId++;
	}
	
	public void reajustarSalario(double percentual) {
		double reajuste = salario * percentual / 100;
		salario += reajuste;
	}
	
}