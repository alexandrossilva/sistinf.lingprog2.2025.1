package notasaula05;

public class FilaCircular implements Fila {

	private Object[] elementos;
	private int cabeca;
	private int cauda;
	
	public FilaCircular(int capacidade) {
		elementos = new Object[capacidade];
	}
	
	public void adicionar(Object elemento) {
	}

	public Object remover() {
		return null;
	}

	public int tamanho() {
		return 0;
	}

}
