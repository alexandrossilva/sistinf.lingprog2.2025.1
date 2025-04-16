package aula05.v2;

// Encapsulamento de dados típicos de exemplar (com incorporação de mecanismo de lançamento de exceção)
public class Exemplar {

	private int tombo;					// número de tombo
	private String titulo;				// título
	private String autores;				// nomes dos autores
	private boolean aptoEmprestimo;		// exemplar apto (true) ou não (false) a ser emprestado
	private int emprestimos;			// quantidade até então de empréstimos registrados do exemplar

	// construtor (possível lançamento de exceção verificada da classe Exception)
	public Exemplar(int tombo, String titulo, String autores, 
			boolean aptoEmprestimo) throws Exception {
		// lançamento de exceção em caso de número de tombo não positivo
		if (tombo <= 0) {
			throw new Exception("Número de tombo inválido");
		}

		// lançamento de exceção em caso de indicação de título na forma de string vazia
		if (titulo.trim().equals("")) {
			throw new Exception("Título não indicado");
		}
		
		// lançamento de exceção em caso de indicação de autores na forma de string vazia
		if (autores.trim().equals("")) {
			throw new Exception("Nome(s) de autor(es) não indicado(a)s");
		}
		
		// inicialização de atributos
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
	// (possível lançamento de exceção verificada da classe Exception)
	public void adicionarEmprestimo() throws Exception {
		if (!isAptoEmprestimo()) {	// se exemplar não habilitado para empréstimos...
			// lançamento de exceção com mensagem indicativa a respeito
			throw new Exception("Exemplar não habilitado para empréstimos");			
		}
		
		this.emprestimos += 1;		// incremento de quantidade de empréstimos
	}

}