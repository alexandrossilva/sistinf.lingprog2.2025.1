package notasaula05;

import java.util.ArrayList;
import java.util.Collection;

public class FuncionarioUtil {

	public static void main(String[] args) {
		Collection quadro = new ArrayList();	// instanciação de coleção concreta
		
		// inclusão de funcionários na coleção
		quadro.add(new Funcionario("José Silva", 7500, 1987, 12, 15));
		quadro.add(new Funcionario("Henrique Santos", 5000, 1989, 10, 1));
		quadro.add(new Funcionario("Maria Guimarães", 7500, 1990, 3, 15));
		
		for (Object elemento: quadro) {							// navegação entre funcionários
			Funcionario func = (Funcionario)quadro;				// obtenção de próximo funcionário
			func.reajustarSalario(5);							// reajuste de salário
			System.out.println("Funcionário [" + func + "]");	// exibição de dados
		}
	}

}
