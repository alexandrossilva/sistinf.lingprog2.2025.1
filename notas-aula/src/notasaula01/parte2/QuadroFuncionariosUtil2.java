package notasaula01.parte2;

public class QuadroFuncionariosUtil2 {

	public static void main(String[] args) {
		Gerente chefe;
		Funcionario[] quadro = new Funcionario[3];
		
		// criação (instanciação) de gerente e configuração de seu bônus
		chefe = new Gerente("José Silva", 7500, 1987, 12, 15);
		chefe.setBonus(5000);		
		
		// criação e/ou atribução, ao array, de combinação de gerentes e funcionários
		quadro[0] = chefe;
		quadro[1] = new Funcionario("Henrique Santos", 5000, 1989, 10, 1);
		quadro[2] = new Funcionario("Maria Guimarães", 7500, 1990, 3, 15);
		
		// atualização de bônus e impressão de salário de todos
		for (Funcionario func: quadro) {
			Gerente funcChefe = (Gerente)func;
			funcChefe.setBonus(6000);   		// atualização de bônus
			System.out.println("Nome = " + func.getNome() + ", Salário = " + func.getSalario());
		}
	}

}
