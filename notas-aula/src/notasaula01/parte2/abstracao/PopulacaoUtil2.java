package notasaula01.parte2.abstracao;

public class PopulacaoUtil2 {

	public static void main(String[] args) {
		Pessoa[] populacao = new Pessoa[2];
		
		// criação e/ou atribução, ao array, de objetos de subclasses de Pessoa
		populacao[0] = new Funcionario("Renata Silva", 5500);
		populacao[1] = new Estudante("Francisco Moares", "Sistemas de Informação");
		
		// impressão de descrição de pessoas
		for (Pessoa p: populacao) {
			System.out.println(p.getDescricao());
		}
	}

}