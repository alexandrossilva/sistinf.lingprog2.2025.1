package notasaula05.mapas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Funcionario {

	private String cpf;
	private String nome;
	private double salario;
	private Date dataAdmissao;

	public Funcionario() {
		this("", "", 0d, new GregorianCalendar().get(Calendar.YEAR), 1, 1);
	}

	public Funcionario(String c, String n, double s, int anoAdmissao, int mesAdmissao, int diaAdmissao) {
		cpf = c;
		nome = n;
		salario = s;
		GregorianCalendar dataAdmissaoTemp = new GregorianCalendar(anoAdmissao, mesAdmissao - 1, diaAdmissao);
		dataAdmissao = dataAdmissaoTemp.getTime();
	}
	
	public String getCpf() {
		return cpf;
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
		if (salario > 0)								// verificação de novo salário (se positivo)
			this.salario = salario;						// atualização de salário
	}
	
	public void reajustarSalario(double percentual) {	// reajuste de salário com base em percentual
		double reajuste = salario * percentual / 100;	// cálculo de reajuste
		salario += reajuste;							// incorporação de reajuste ao salário (atualização)
	}
	
	public String toString() {
		return "CPF: " + cpf + ", Nome: " + nome + ", Salário: " + salario + ", Admissão: " + dataAdmissao;
	}
	
	// obtenção de código hash com base nos códigos hash de cpf, nome, salário e data de admissão
	public int hashCode() {
		return cpf.hashCode() + 7 * nome.hashCode() + 11 * Double.hashCode(salario) + 13 * dataAdmissao.hashCode();
	}
	
	// método de igualdade compatível com método de obtenção de código hash
	public boolean equals(Object outroObjeto) {
		// teste de nulidade do objeto passado como parâmetro
		if (outroObjeto == null)
			return false;
		// teste sobre se este objeto é idêntico ao objeto passado como parâmetro
		else if (this == outroObjeto)
			return true;
		// teste de objeto passado como parâmetro não ser da classe Funcionario
		else if (!(outroObjeto instanceof Funcionario))
			return false;
		else {
			Funcionario outroFunc = (Funcionario)outroObjeto;
			return cpf.equals(outroFunc.getCpf())
				&& nome.equals(outroFunc.getNome())
				&& salario == outroFunc.getSalario()
				&& dataAdmissao.equals(outroFunc.getDataAdmissao());               
		}	   
	}
	
}
