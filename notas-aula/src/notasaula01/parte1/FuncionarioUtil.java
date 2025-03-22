package notasaula01.parte1;

public class FuncionarioUtil {

	public static void main(String[] args) {
		Funcionario[] quadro = new Funcionario[3];
		
		// criação (instanciação) de objetos da classe Funcionario
		quadro[0] = new Funcionario("José Silva", 7500, 1987, 12, 15);
		quadro[1] = new Funcionario("Henrique Santos", 5000, 1989, 10, 1);
		quadro[2] = new Funcionario("Maria Guimarães", 7500, 1990, 3, 15);
		
		// aumento de salário de todos os funcionários em 5%
		for (Funcionario func: quadro) {
			func.reajustarSalario(5);
		}
		
		// impressão de informações sobre todos os objetos da classe Funcionario
		for (Funcionario func: quadro) {
			System.out.println("Nome = " + func.getNome() + ", Salário = " + func.getSalario() +
					", Data de Admissão: " + func.getDataAdmissao());
		}
	}

}
