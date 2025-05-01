package aula08;

// Lista genérica de elementos (tipo a ser definido no momento da instanciação)
public class ListaGenerica <E> {

	private int qtd;		// quantidade de elementos até então inseridos
	private E v[];			// array de elementos
	
	public ListaGenerica(int MAX) {
		qtd = 0;			// inicialização de quantidade inserida inicialmente (lista vazia)
		
		// instanciação de array de objetos com tamanho de acordo com a capacidade passada como parâmetro
		// e, após isso, uso de cast considerando tipo de elementos definido no momento da instanciação da lista
		v = (E[])new Object[MAX];
	}
	
	// inserção de novo elemento na lista
	public void adicionar(E elemento, int posicao) throws Exception, IllegalArgumentException {
		// lançamento de exceção em caso de capacidade máxima alcançada
		if (qtd == v.length) {
			throw new Exception("Capacidade máxima alcançada!");
		}
		// lançamento de exceção em caso de indicação de posição inválida
		else if (posicao > qtd) {
			throw new IllegalArgumentException("Posição de inserção inválida!");			
		}
		else {
			// deslocamento de elementos já inseridos (a partir da posição de inserção do novo elemento)
			for (int i = qtd; i > posicao; i--) {
				v[i] = v[i - 1];	// deslocamento de enésimo elemento				
			}
			
			v[posicao] = elemento;	// atribuíção de elemento
			qtd++;					// atualização de quantidade de elementos inseridos na lista			
		}		
	}
	
	// retorno de tamanho da lista
	public int getTamanho() {
		return qtd;			// retorno de quantidade de elementos até então inserida
	}
	
	@Override
	public String toString() {
		String elementos = "";
		
		// iteração entre os elementos até então inseridos
		for (int i = 0; i < qtd; i++) {
			if (i > 0) {
				elementos += ", ";
			}

			// concatenação de enésimo elemento à string de retorno
			elementos += v[i];
		}
		
		return elementos;	// retorno de string
	}
	
}