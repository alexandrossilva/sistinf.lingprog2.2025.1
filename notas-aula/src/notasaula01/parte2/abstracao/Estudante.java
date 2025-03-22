package notasaula01.parte2.abstracao;

public class Estudante extends Pessoa {

	private String curso;

	public Estudante(String n, String c) {
		super(n);
		curso = c;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public String getDescricao() {
		return "Estudante " + getNome() + ", do curso de " + curso;
	}
	
}