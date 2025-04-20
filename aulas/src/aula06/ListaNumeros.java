package aula06;

// Lista de números inteiros
public class ListaNumeros {

	private int qtd;		// quantidade de inteiros até então inseridos
	private int v[];		// array de inteiros
	
	// construtor com indicação de capacidade da lista
	public ListaNumeros(int MAX) {
		qtd = 0;			// inicialização de quantidade inserida inicialmente (lista vazia)
		v = new int[MAX];	// instanciação de array com tamanho de acordo com a capacidade passada como parâmetro
	}
	
	// inserção de novo inteiro na lista
	public void adicionar(int numero) throws Exception {
		// lançamento de exceção em caso de capacidade máxima alcançada
		if (qtd == v.length) {
			throw new Exception("Capacidade máxima alcançada!");
		}
		
		v[qtd] = numero;	// atribuíção de inteiro
		qtd++;				// atualização de quantidade de inteiros inseridos na lista
	}
	
	// retorno de tamanho da lista
	public int getTamanho() {
		return qtd;			// retorno de quantidade de inteiros até então inserida
	}
	
	@Override
	public String toString() {
		String elementos = "";

		// iteração entre os inteiros até então inseridos
		for (int i = 0; i < qtd; i++) {
			if (i > 0) {
				elementos += ", ";
			}
			
			// concatenação de enésimo inteiro à string de retorno
			elementos += v[i];
		}
		
		return elementos;	// retorno de string
	}
	
}