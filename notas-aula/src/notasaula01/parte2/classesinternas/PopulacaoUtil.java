package notasaula01.parte2.classesinternas;

public class PopulacaoUtil {

	public static void main(String[] args) {
		Pessoa[] populacao = new Pessoa[2];
		
		populacao[0] = new Pessoa("Renata Silva") {
			double salario = 5500;
			public String getDescricao() {
				return "Funcionário " + getNome() + ", com um salário de R$ " + salario;				
			}
		};
		
		populacao[1] = new Pessoa("Francisco Moares") {
			String curso = "Sistemas de Informação";
			public String getDescricao() {
				return "Estudante " + getNome() + ", do curso de " + curso;
			}
		};
		
		// impressão de descrição de pessoas
		for (Pessoa p: populacao)
			System.out.println(p.getDescricao());
	}

}