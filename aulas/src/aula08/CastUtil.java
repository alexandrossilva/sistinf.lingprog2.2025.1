package aula08;

// Demonstração de operações com objetos incluindo-se cast, que consistem em fazer objetos 
// de determinada classe se passarem por objetos de alguma outra classe
public class CastUtil {

	public static void main(String[] args) {
		// instanciação de array de objetos da classe Integer
		Integer[] numeros;
		
		// instanciação de array de objetos da classe Object e, após isso, 
		// atribuição, via cast, ao array de objetos da classe Integer
		numeros = (Integer[])new Object[10];
		
		// instanciação de array de objetos da classe Integer e, após isso, atribuição a um array 
		// de objetos da classe Object (cast desnecessário por Integer ser subtipo da classe Object)
		Object[] objetos = new Integer[10];
		
		// instanciação de array de objetos da classe Candidato e, após isso, atribuição a um array 
		// de objetos da classe Object (cast desnecessário por Candidato ser subtipo da classe Object)
		Object[] candidatos = new Candidato[10];
	}

}