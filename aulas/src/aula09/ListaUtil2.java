package aula09;

import java.util.ArrayList;

public class ListaUtil2 {

	public static void main(String[] args) {
		ArrayList<Candidato> lista = new ArrayList<Candidato>();

		Candidato c1 = new Candidato(1, "Fulano", 40, "Presidente");
		Candidato c2 = new Candidato(7, "Sicrano", 45, "Presidente");
		
		lista.add(c1);
		lista.add(c2);		
		
		Object c3 = new Candidato(7, "Sicrano", 45, "Presidente");
		System.out.println(c3.equals("Sicrano"));
		
		System.out.println(lista);
		System.out.println(lista.contains(c3));
	}

}
