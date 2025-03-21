package aula01;

public class Exemplar {

    private int tombo;
    private String titulo;
    private String autores;
    private boolean aptoEmprestimo;
    private int emprestimos;

    public Exemplar(int tombo, String titulo, String autores, boolean aptoEmprestimo) {
        this.tombo = tombo;
        this.titulo = titulo;
        this.autores = autores;
        this.aptoEmprestimo = aptoEmprestimo;
    }

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

    public void habilitarEmprestimo() {
        this.aptoEmprestimo = true;
    }

    public void desabilitarEmprestimo() {
        this.aptoEmprestimo = false;
    }

    public void adicionarEmprestimo() {
        if (this.aptoEmprestimo) {
            this.emprestimos += 1;
        }
    }

}