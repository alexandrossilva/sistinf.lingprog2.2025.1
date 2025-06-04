package notasaula05;

import java.util.ArrayList;
import java.util.Collection;

public class QuadroGenericoFuncionarios {

	public static void main(String[] args) {
		Collection<Funcionario> quadro = new ArrayList<Funcionario>();	// instanciação de coleção concreta
		
		// inclusão de funcionários na coleção
		quadro.add(new Funcionario("José Silva", 7500, 1987, 12, 15));
		quadro.add(new Funcionario("Henrique Santos", 5000, 1989, 10, 1));
		quadro.add(new Funcionario("Maria Guimarães", 7500, 1990, 3, 15));
		
		for (Funcionario func: quadro) {						// navegação entre funcionários
			func.reajustarSalario(5);							// reajuste de salário de próximo funcionário
			System.out.println("Funcionário [" + func + "]");	// exibição de dados de próximo funcionário
		}
	}

}
