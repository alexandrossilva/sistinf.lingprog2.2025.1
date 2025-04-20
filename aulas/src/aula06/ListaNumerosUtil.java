package aula06;

public class ListaUtil {

	public static void main(String[] args) {
		ListaNumeros lista = new ListaNumeros(10);
		
		try {
			lista.adicionar(7);
			lista.adicionar(12);
			lista.adicionar(1);
			lista.adicionar(3);
			System.out.println(lista);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
