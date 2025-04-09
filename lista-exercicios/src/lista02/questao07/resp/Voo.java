package lista02.questao07.resp;

import java.util.Date;

// Encapsulamento de dados de voos e respectivas operações
public class Voo {

	// array para indicação de situação de cada assento (livre, se false, ou ocupado, se true)
	protected boolean[] assentos;	 
	protected int numero;			// número de voo
	protected Date dataHorario;		// data e horário de voo
		
	public Voo(int numero, Date dataHorario, int qtdAssentos) {
		// inicialização de array com capacidade correspondente à quantidade de assentos
		this.assentos = new boolean[qtdAssentos];
		this.numero = numero;
		this.dataHorario = dataHorario;
	}
	
	public int getNumero() {
		return numero;
	}

	public Date getDataHorario() {
		return dataHorario;
	}

	// obtenção de número de próximo assento livre (entre 1 e a capacidade do voo)
	public int getProximoAssentoLivre() {
		// consulta de situação de assentos de acordo com valores booleanos de array
		for (int i = 0; i < assentos.length; i++) {
			if (!assentos[i])		// se enésimo valor for false (assento livre)...
				return i + 1;		// retorno de número de enésimo assento
		}
		
		return -1; 					// indicativo de ausência de assentos livres (se for o caso)
	}
	
	// obtenção de quantidade total de assentos livres
	public int getTotalAssentosLivres() {
		int qtd = 0;				// inicalização de totalizador
		
		// consulta de situação de assentos de acordo com valores booleanos de array
		for (int i = 0; i < assentos.length; i++) {
			if (!assentos[i])		// se enésimo valor for false (assento livre)...
				qtd++;				// incremento de totalizador em 1 (um) unidade
		}
		
		return qtd;					// retorno de total de assentos livres
	}
	
	// obtenção de taxa de ocupação de assentos
	public double getTaxaOcupacao() {
		// obtenção de quantidade de assentos ocupados com base em assentos livres
		int assentosOcupados = assentos.length - getTotalAssentosLivres();
		
		// cálculo e retorno de percentual de ocupação considerando capacidade de cada voo
		return assentosOcupados * 100.0 / assentos.length;
	}

	// retorno de true se assento de número indicado por parâmetro for livre (caso contrário, 
	// retorno de false) ou ainda lançamento de exceção se assento inválido
	public boolean isAssentoLivre(int n) throws Exception {
		if (n < 0 || n > assentos.length)
			 throw new Exception(n + " não é um número de assento válido!");
		else {
			// retorno de operação lógica de negação sobre enésimo valor booleano de array
			// se valor for false, assento livre (true), caso contrário, assento não livre (false)
			return !assentos[n - 1];			
		}
	}
	
	// reserva de assento com retorno de valor booleano de acordo com resultado da operação
	// ou ainda lançamento de exceção se assento inválido
	public boolean ocuparAssento(int n) throws Exception {
		if (!isAssentoLivre(n))		// se assento não estiver livre...
			return false;			// retorno de false (reserva de assento não efetivada)
		else {						// caso contrário...
			// atualização de valor boleano em índice de array correspondente ao número de assento
			assentos[n - 1] = true;
			return true;			// retorno de true (reserva de assento efetivada)
		}
	}
	
}