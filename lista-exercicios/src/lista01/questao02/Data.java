package lista01.questao02;

// Classe de encapulamento de datas indicadas por dia do mês, mês e ano 
public class Data {

	private int dia;	// dia (um inteiro entre 1 e, a depender do mês e ano, 28, 29, 30 ou 31)
	private int mes;	// mês (um inteiro entre 1 e 12)
	private int ano;	// ano (um inteiro de 4 dígitos)
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	// retorno de string representativa da data encapsulada no formado DD/MM/AAAA
	public String mostrarData() {
		return (dia < 10 ? "0" : "") + dia + "/" + (mes < 10 ? "0" : "") + mes + "/" + ano;
	}
	
	// retorno de quantidade de dias restantes para o término do ano em que se situa a data encapsulada
	public int getDiasTerminoAno() {
		// quantidade total de dias de cada mês do ano
		int[] qtdDias = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// alteração de quantidade total de dias do mês de fevereiro se data for de ano bissexto
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
			qtdDias[1]++;				

		if (mes == 12) {						// se mês da data for dezembro...
			// dias restantes equivalente à diferença entre 31 e dia da data acrescida de 1 (um)
			return 31 - dia + 1;
		}
		else {									// caso contrário (mês anterior a dezembro)...
			// diferença entre total de dias do mês e dia da data acrescida de 1 (um)
			int diasRestantes = qtdDias[mes-1] - dia + 1;

			// contibilização de total de dias dos meses subsequentes (até alcançar o mês de dezembro)
			for (int i = mes + 1; i <= 12; i++)
				diasRestantes += qtdDias[i-1];	// acréscimo de total de dias do enésimo mês
				
			return diasRestantes;				// retorno de total de dias restantes
		}
	}

}