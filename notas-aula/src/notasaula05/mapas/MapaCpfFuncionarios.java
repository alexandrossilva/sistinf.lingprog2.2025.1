package notasaula05.mapas;

import java.util.HashMap;
import java.util.Map;

public class MapaCpfFuncionarios {

	public static void main(String[] args) {
		Funcionario f1, f2, f3;
		Map<String, Funcionario> quadro = new HashMap<String, Funcionario>();	// instanciação de mapa de hash
		
		f1 = new Funcionario("34723769021", "José Silva", 7500, 1987, 12, 15);
		f2 = new Funcionario("17051688090", "Henrique Santos", 5000, 1989, 10, 1);
		f3 = new Funcionario("96554968059", "Maria Guimarães", 7500, 1990, 3, 15);
		
		quadro.put(f1.getCpf(), f1);	// mapeamento de 1º funcionário
		quadro.put(f2.getCpf(), f2);	// mapeamento de 2º funcionário
		quadro.put(f3.getCpf(), f3);	// mapeamento de 3º funcionário
		quadro.remove(f2.getCpf());		// remoção do 2º funcionário mapeado
		
		System.out.println("RELAÇÃO DE FUNCIONÁRIOS MAPEADOS");
		for (Funcionario f: quadro.values())
			System.out.println(f);
	}

}
