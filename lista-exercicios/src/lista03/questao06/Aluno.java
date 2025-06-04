package lista03.questao06;

// Encapsulamento de dados típicos de aluno
public class Aluno {

	private int matricula;			// matrícula
	private String nome;			// nome
	private String sexo;			// Sexo ("F", se feminino, ou "M", se masculino)
	private String curso;			// curso (nome)
	private int anoIngresso;		// ano de ingresso
	private int semestreIngresso;	// semestre de ingresso (1 ou 2)
	
	public Aluno(int matricula, String nome, String sexo, String curso, int anoIngresso, int semestreIngresso) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.curso = curso;
		this.anoIngresso = anoIngresso;
		this.semestreIngresso = semestreIngresso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public int getSemestreIngresso() {
		return semestreIngresso;
	}

	public void setSemestreIngresso(int semestreIngresso) {
		this.semestreIngresso = semestreIngresso;
	}	
	
}