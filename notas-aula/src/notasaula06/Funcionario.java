package notasaula06;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Funcionario implements Serializable {
	
	public static final int TAMANHO_NOME = 40;
	public static final int BYTES_POR_REGISTRO = 100;

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
	
	public String getNomeTamFixo() {
		String nomeTemp = nome;
		
		// se nome conter mais que quantidade máxima de caracteres admitida...
		if (nomeTemp.length() > TAMANHO_NOME)
			nomeTemp = nomeTemp.substring(0, TAMANHO_NOME);	// extração de caracteres limitada à quantidade máxima admitida
		// caso contrário (nome com quantidade igual ou inferior à quantidade máxima admitida)
		else
			for (int i = nomeTemp.length(); i < TAMANHO_NOME; i++)
				nomeTemp += " ";							// inclusão de caracteres de espaço em branco (se necessário)
		
		return nomeTemp;
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
