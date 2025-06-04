package lista03.questao05;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Contato {

	private String nome;
	private long telefone;
	private GregorianCalendar dataNascimento;
	
	public Contato(String nome, long telefone, GregorianCalendar dataNascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public GregorianCalendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataAniversario(GregorianCalendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String toString() {
		return "Contato [nome=" + nome + ", "
				+ "telefone=" + telefone + ", "
				+ "dataNascimento=" + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento.getTime()) + "]";
	}	
	
}
