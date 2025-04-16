package aula05.v3;

// Encapsulamento de dados típicos de exemplar (com incorporação de mecanismo de lançamento de exceção da classe Exception ou 
// da classe customizada ExemplarException, esta última quando da tentativa de instanciação de novo objeto)
public class Exemplar {

	private int tombo;					// número de tombo
	private String titulo;				// título
	private String autores;				// nomes dos autores
	private boolean aptoEmprestimo;		// exemplar apto (true) ou não (false) a ser emprestado
	private int emprestimos;			// quantidade até então de empréstimos registrados do exemplar

	// construtor (possível lançamento de exceção não verificada da classe customizada ExemplarException)
	public Exemplar(int tombo, String titulo, String autores, 
			boolean aptoEmprestimo) throws ExemplarException {
		
		boolean tomboInvalido = tombo <= 0;						// indicação de número de tombo não positivo
		boolean tituloInvalido = titulo.trim().equals("");		// indicação de atribuição ou não de string vazia para o título
		boolean autoresInvalido = autores.trim().equals("");	// indicação de atribuição ou não de string vazia para os nomes dos autores
				
		// lançamento de exceção em caso de número de tombo não positivo ou atribuição de string vazia para o título ou os nomes dos autores
		if (tomboInvalido || tituloInvalido || autoresInvalido) {
			throw new ExemplarException("Um ou mais dados de exemplar estão inválidos!",
					tomboInvalido, tituloInvalido, autoresInvalido);
		}
		
		// inicialização de atributos (se forem válidos e não havendo, portanto, lançamento de exceçao
		this.tombo = tombo;
		this.titulo = titulo;
		this.autores = autores;
		this.aptoEmprestimo = aptoEmprestimo;
	}
	
	// métodos getter
	public int getTombo() {
		return tombo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutores() {
		return autores;
	}

	public boolean isAptoEmprestimo() {
		return aptoEmprestimo;
	}

	public int getEmprestimos() {
		return emprestimos;
	}

	// habilitação de exemplar para que possa ser emprestado
	public void habilitarEmprestimo() {
		this.aptoEmprestimo = true;
	}

	// desabilitação de possibilidade de exemplar poder ser emprestado
	public void desabilitarEmprestimo() {
		this.aptoEmprestimo = false;
	}

	// atualização de quantidade de empréstimos do exemplar em 1 (uma) unidade
	public void adicionarEmprestimo() throws Exception {
		if (!isAptoEmprestimo()) {	// se exemplar não habilitado para empréstimos...
			// lançamento de exceção com mensagem indicativa a respeito
			throw new Exception("Exemplar não habilitado para empréstimos");			
		}
		
		this.emprestimos += 1;		// incremento de quantidade de empréstimos
	}

}