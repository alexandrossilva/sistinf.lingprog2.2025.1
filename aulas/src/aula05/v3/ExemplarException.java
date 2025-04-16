package aula05.v3;

// Customização de exceções para fins de manipulação de instâncias da classe Exemplar
public class ExemplarException extends Exception {

	private boolean tomboInvalido;		// indicativo de instanciação de exemplar com número de tombo inválido
	private boolean tituloInvalido;		// indicativo de instanciação de exemplar com título inválido
	private boolean autoresInvalido;	// indicativo de instanciação de exemplar com nomes inválidos de autores
	
	// construtor (com indicação de campos de instância inválidos)
	public ExemplarException(String mensagem, boolean tomboInvalido, boolean tituloInvalido, 
			boolean autoresInvalido) {
		super(mensagem);
		this.tomboInvalido = tomboInvalido;
		this.tituloInvalido = tituloInvalido;
		this.autoresInvalido = autoresInvalido;
	}

	// métodos getter de indicação ou não de campos de instância inválidos (tombo, título e autores)
	public boolean isTomboInvalido() {
		return tomboInvalido;
	}

	public boolean isTituloInvalido() {
		return tituloInvalido;
	}

	public boolean isAutoresInvalido() {
		return autoresInvalido;
	}
	
}
