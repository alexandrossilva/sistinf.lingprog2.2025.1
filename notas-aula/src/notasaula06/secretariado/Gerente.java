package notasaula06.secretariado;

import java.text.SimpleDateFormat;

public class Gerente extends Funcionario {

	private double bonus;
	private Funcionario secretario;

	public Gerente(String n, double s, int anoAdmissao, int mesAdmissao, int diaAdmissao) {
		super(n, s, anoAdmissao, mesAdmissao, diaAdmissao);
		bonus = 0;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public Funcionario getSecretario() {
		return secretario;
	}

	public void setSecretario(Funcionario secretario) {
		this.secretario = secretario;
	}
		
	public double getSalario() {
		double salarioBase = super.getSalario();
		return salarioBase + bonus;
	}
	
	public String toString() {
		String nomeSecretario = secretario == null ? "nenhum" : secretario.getNome();
		
		return "[Nome: " + super.nome + ", " + 
			   "Salário: " + (super.salario + bonus) + ", " + 
			   "Admissão: " + new SimpleDateFormat("dd/MM/yyyy").format(dataAdmissao.getTime()) + ", " +
			   "Secretário: " + nomeSecretario + "]";
	}

}
