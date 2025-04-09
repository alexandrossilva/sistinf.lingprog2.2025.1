package lista02.questao05.resp;

public class DataIncorretaException extends Exception {
	
	// construtor com indicação de descrição específica de exceção instanciada
	public DataIncorretaException(String mensagem) {
		super(mensagem);	// invocação de construtor de superclasse
	}

}