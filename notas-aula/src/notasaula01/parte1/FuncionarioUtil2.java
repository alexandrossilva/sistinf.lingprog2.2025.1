package notasaula01.parte1;

public class FuncionarioUtil2 {

	public static void main(String[] args) {
		Funcionario2[] quadro = new Funcionario2[3];
		
		// criação (instanciação) de objetos da classe Funcionario
		quadro[0] = new Funcionario2("José Silva", 7500, 1987, 12, 15);
		quadro[1] = new Funcionario2("Henrique Santos", 5000, 1989, 10, 1);
		quadro[2] = new Funcionario2("Maria Guimarães", 7500, 1990, 3, 15);
		
		// aumento de salário de todos os funcionários em 5%
		for (Funcionario2 func: quadro) {
			func.reajustarSalario(5);
		}
		
		// impressão de informações sobre todos os objetos da classe Funcionario
		for (Funcionario2 func: quadro) {
			System.out.println("ID = " + func.getId() + ", Nome = " + func.getNome() + 
					", Salário = " + func.getSalario() + ", Data de Admissão: " + func.getDataAdmissao());
		}
	}

}
