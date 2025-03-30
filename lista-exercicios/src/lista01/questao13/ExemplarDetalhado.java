package lista01.questao13;

import java.util.Date;
import lista01.questao11.Exemplar;

// Encapsulamento de dados e operações típica de exemplares (adicionalmente, data e hora de 
// último empréstimo quando comparada com a superclasse Exemplar)
public class ExemplarDetalhado extends Exemplar {

	private Date dataHoraUltimpEmp;							// data e hora de último empréstimo
	
	public ExemplarDetalhado(int tombo, String titulo, String autores, boolean aptoEmprestimo) {		
		super(tombo, titulo, autores, aptoEmprestimo);		// invocação de construtor da superclasse
	}
	
	public Date getDataHoraUltimpEmp() {
		return dataHoraUltimpEmp;
	}
	
	// sobrescrita de operação de empréstimo herdado da superclasse
	public void adicionarEmprestimo() {
		super.adicionarEmprestimo();						// invocação de método da superclasse
		// atualização de data e hora de último empréstimo considerando data e hora corrente
		dataHoraUltimpEmp = new Date();		
	}
	
	// sobrecarga de operação de empréstimo
	public void adicionarEmprestimo(Date dataHora) {
		super.adicionarEmprestimo();						// invocação de método da superclasse
		// atualização de data e hora de último empréstimo considerando parâmetro de data e hora
		dataHoraUltimpEmp = dataHora;		
	}

}