package aula09;

import java.util.ArrayList;

// Operações de manipulação de lista de candidatos
public class ListaUtil2 {

	public static void main(String[] args) {
		// instanciação de lista de candidatos
		ArrayList<Candidato> lista = new ArrayList<Candidato>();

		// instanciação de 2 (dois) objetos da classe Candidato
		Candidato c1 = new Candidato(1, "Fulano", 40, "Presidente");
		Candidato c2 = new Candidato(7, "Sicrano", 45, "Presidente");
		
		// inserção de candidatos na lista
		lista.add(c1);
		lista.add(c2);		
		
		// instanciação de 3º objeto da classe Candidato
		Object c3 = new Candidato(7, "Sicrano", 45, "Presidente");

		// verificação de existência, em lista, de 3º objeto da classe Candidato
		// considerando sobrecarga do método equals naquela classe
		System.out.println(c3.equals("Sicrano"));
		
		// listagem de candidatos
		System.out.println(lista);
		
		// verificação de existência, em lista de candidatos, de inteiro literal 3 (três)
		System.out.println(lista.contains(c3));
	}

}
