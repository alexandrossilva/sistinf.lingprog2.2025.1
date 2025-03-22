package notasaula01.parte2.classesinternas;

public abstract class Pessoa {

	private String nome;
	
	public Pessoa(String n) {
		nome = n;
	}
	
	public String getNome() {
		return nome;
	}

	public abstract String getDescricao();
	
}