package aula06;

public class ListaNumeros {

	private int qtd;
	private int v[];	
	
	public ListaNumeros(int MAX) {
		qtd = 0;
		v = new int[MAX];
	}
	
	public void adicionar(int numero) throws Exception {
		if (qtd == v.length) {
			throw new Exception("Capacidade máxima alcançada!");
		}
		v[qtd] = numero;
		qtd++;
	}
	
	public int getTamanho() {
		return qtd;
	}
	
	public String toString() {
		String elementos = "";
		
		for (int i = 0; i < qtd; i++) {
			if (i > 0) {
				elementos += ", ";
			}
			elementos += v[i];
		}
		
		return elementos;
	}
	
}
