package lista03.questao09;

// Encapsulamento de dados típicos de instituição de ensino no território nacional
public class InstituicaoEnsino {

	private String nome;			// nome
	private String sigla;			// Sigla
	private String siglaEstado;		// sigla de estado da sede
	private boolean publica;		// instituição pública (se true) ou privada (se false)
	private int quantidadeCursos;	// quantidade de cursos
	
	public InstituicaoEnsino(String nome, String sigla, String siglaEstado, boolean publica, int quantidadeCursos) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.siglaEstado = siglaEstado;
		this.publica = publica;
		this.quantidadeCursos = quantidadeCursos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public boolean isPublica() {
		return publica;
	}

	public void setPublica(boolean publica) {
		this.publica = publica;
	}

	public int getQuantidadeCursos() {
		return quantidadeCursos;
	}

	public void setQuantidadeCursos(int quantidadeCursos) {
		this.quantidadeCursos = quantidadeCursos;
	}
	
}