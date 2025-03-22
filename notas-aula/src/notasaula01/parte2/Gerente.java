package notasaula01.parte2;

public class Gerente extends Funcionario {

	private double bonus;

	public Gerente(String n, double s, int anoAdmissao, int mesAdmissao, int diaAdmissao) {
		super(n, s, anoAdmissao, mesAdmissao, diaAdmissao);
		bonus = 0;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalario() {
		double salarioBase = super.getSalario();
		return salarioBase + bonus;
	}
	
	public boolean equals(Object outroObjeto) {
		// verificação deste e outro objeto pertencerem à mesma classe 
		// (além dos campos de instância da superclasse apresentarem mesmos valores)
		if (!super.equals(outroObjeto))
			return false;
		// Coerção da outro objeto para a classe Gerente
		Gerente outroGerente = (Gerente)outroObjeto;
		// 
		return bonus == outroGerente.bonus;
	}
	
}