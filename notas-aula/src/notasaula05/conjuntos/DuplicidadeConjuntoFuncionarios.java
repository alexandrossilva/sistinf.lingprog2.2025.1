package notasaula05.conjuntos;

import java.util.HashSet;
import java.util.Set;
import notasaula05.Funcionario;

public class DuplicidadeConjuntoFuncionarios {

	public static void main(String[] args) {
		Funcionario f1, f2, f3, f4;
		Set<Funcionario> quadro = new HashSet<Funcionario>();	// instanciação de tabela de hash

		f1 = new Funcionario("José Silva", 7500, 1987, 12, 15);
		f2 = new Funcionario("Henrique Santos", 5000, 1989, 10, 1);
		f3 = new Funcionario("Maria Guimarães", 7500, 1990, 3, 15);
		f4 = f1;							// referência ao mesmo funcionário representado por f1
		
		quadro.add(f1);						// inserção de 1º funcionário na tabela de hash
		quadro.add(f2);						// inserção de 2º funcionário na tabela de hash
		quadro.add(f3);						// inserção de 3º funcionário na tabela de hash
		quadro.add(f4);						// inserção não efetivada por duplicidade
		
		for (Funcionario func: quadro)
			System.out.println("Funcionário [" + func + "]");	// exibição de dados de próximo funcionário
	}

}
