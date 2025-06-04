package notasaula05.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class DuplicidadeConjuntoFuncionarios2 {

	public static void main(String[] args) {
		Set<Funcionario> quadro = new HashSet<Funcionario>();	// instanciação de tabela de hash
		
		// inclusão de funcionários na tabela de hash
		quadro.add(new Funcionario("José Silva", 7500, 1987, 12, 15));
		quadro.add(new Funcionario("Henrique Santos", 5000, 1989, 10, 1));
		quadro.add(new Funcionario("Maria Guimarães", 7500, 1990, 3, 15));
		quadro.add(new Funcionario("José Silva", 7500, 1987, 12, 15));
		
		for (Funcionario func: quadro) {						// navegação entre funcionários
			func.reajustarSalario(5);							// reajuste de salário de próximo funcionário
			System.out.println("Funcionário [" + func + "]");	// exibição de dados de próximo funcionário
		}
	}

}
