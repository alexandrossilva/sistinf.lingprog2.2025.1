package aula01;

// Encapsulamento de dados típicos de exemplar
public class Exemplar {

	private int tombo;					// número de tombo
	private String titulo;				// título
	private String autores;				// nomes dos autores
	private boolean aptoEmprestimo;		// exemplar apto (true) ou não (false) a ser emprestado
	private int emprestimos;			// quantidade até então de empréstimos registrados do exemplar

	// construtor
	public Exemplar(int tombo, String titulo, String autores, 
			boolean aptoEmprestimo) {
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
	public void adicionarEmprestimo() {
		if (this.aptoEmprestimo) {		// se exemplar apto a ser emprestado
			this.emprestimos += 1;		// incremento de quantidade de empréstimos
		}
	}

}