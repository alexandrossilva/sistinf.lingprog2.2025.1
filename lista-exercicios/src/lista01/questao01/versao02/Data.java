package lista01.questao01.versao02;

// Classe de encapulamento de datas indicadas por dia do mês, mês e ano 
public class Data {

	private int dia;
	private int mes;
	private int ano;
	
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
		String s = "";							// string de retorno
		
		// concatenação de dígitos correspondentes ao dia (inclusive de dígito 0, se necessário)
		if (dia < 10) { s += "0" + dia; }
		else          { s += dia;       }
		
		// concatenação de caractere de barra para separação entre dia e mês
		s += "/";
		
		// concatenação de dígitos correspondentes ao mês (inclusive de dígito 0, se necessário)
		if (mes < 10) { s += "0" + mes; }
		else          { s += mes;       }
		
		// concatenação de caractere de barra para separação entre mês e ano
		s += "/";
		
		// concatenação de dígitos correspondentes ao ano supondo-se que ele tenha 4 dígitos	
		s += ano;
		
		return s;								// retorno de string
	}

}