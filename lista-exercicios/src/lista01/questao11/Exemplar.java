package lista01.questao11;

// Encapsulamento de dados e operações típica de exemplares
public class Exemplar {

	private int tombo;					// número de tombo
	private String titulo;				// título
	private String autoria;				// autores
	private boolean aptoEmprestimos;	// apto ou não para empréstimos
	private int emprestimos;			// quantidade de empréstimos
	
	public Exemplar(int tombo, String titulo, String autoria, boolean aptoEmprestimos) {
		this.tombo = tombo;
		this.titulo = titulo;
		this.autoria = autoria;
		this.aptoEmprestimos = aptoEmprestimos;
		this.emprestimos = 0;			// inicialização de empréstimos de exemplar
	}

	public int getTombo() {
		return tombo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutoria() {
		return autoria;
	}

	public boolean isAptoEmprestimos() {
		return aptoEmprestimos;
	}

	public int getEmprestimos() {
		return emprestimos;
	}
	
	// habilitação de exemplar para empréstimos
	public void habilitarEmprestimo() {
		aptoEmprestimos = true;			// atualização de campo de instância de habilitação
	}
	
	// desabilitação de exemplar para empréstimos
	public void desabilitarEmprestimo() {
		aptoEmprestimos = false;		// atualização de campo de instância de habilitação				
	}
	
	// incremento de quantodade de empréstimos registrados de exemplar
	public void adicionarEmprestimo() {
		if (aptoEmprestimos)			// se exemplar habilitado para empréstimos...
			emprestimos++;				// incremento de totalizador de empréstimos
	}

}