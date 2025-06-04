package notasaula05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class ColecaoInteiros {

	public static void main(String[] args) {
		Collection<Integer> colecao = new ArrayList<Integer>();
		Random geradorAleatorio = new Random();
		
		for (int i = 0; i < 10; i++)
			colecao.add(geradorAleatorio.nextInt(100));
		
		double soma = 0;		
		for (Integer n: colecao)
			soma += n;		
		double media = soma / colecao.size();
		
		System.out.println("Média de " + colecao + ": " + media);
	}

}
