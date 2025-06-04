package notasaula05.mapas;

import java.util.HashMap;
import java.util.Map;
import notasaula05.Funcionario;

public class MapaFuncionarios {

	public static void main(String[] args) {
		Funcionario f1, f2, f3;
		Map<String, Funcionario> quadro = new HashMap<String, Funcionario>();	// instanciação de mapa de hash

		f1 = new Funcionario("José Silva", 7500, 1987, 12, 15);
		f2 = new Funcionario("Henrique Santos", 5000, 1989, 10, 1);
		f3 = new Funcionario("Maria Guimarães", 7500, 1990, 3, 15);
		
		quadro.put("144-25-5464", f1);		// mapeamento de 1º funcionário
		quadro.put("567-24-2546", f2);		// mapeamento de 2º funcionário
		quadro.put("157-62-7935", f3);		// mapeamento de 3º funcionário		
		quadro.put("144-25-5464", new Funcionario("Josefina Amorim", 1200, 1965, 10, 31));
		quadro.remove("567-24-2546");		// remoção do 2º funcionário mapeado
		
		System.out.println("RELAÇÃO DE FUNCIONÁRIOS MAPEADOS");
		for (Funcionario f: quadro.values())
			System.out.println(f);
	}

}
