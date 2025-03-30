package lista01.questao01;

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

}