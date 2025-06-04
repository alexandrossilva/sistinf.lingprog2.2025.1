package notasaula03;

public class ContadorFlexivel implements Runnable {
	
	private int limiteContagem; 	// limite de contagem
	private int contagemAtual; 		// valor atual de contagem
	
	// construtor com inicialização de limite de contagem e contagem inicial
	public ContadorFlexivel(int limite) {
		limiteContagem = limite;
		contagemAtual 	= 0;
	}
	
	// tarefa de contagem
	public void run() {
		try {
			// contagem se limite não for positivo ou este, se sendo, ser superior à contagem atual
			while (limiteContagem <= 0 || contagemAtual < limiteContagem) {
				contagemAtual++;		// incremento de contagem
				Thread.sleep(1000);	// espera da thread por 1.000 milissegundo
			}
		}
		// captura de exceção de interrupção durante inatividade da thread
		catch(InterruptedException e) {
			System.out.println("Contagem interrompida durante espera!");
		}
	}
	
	// retorno de string representativa de estado atual do contador
	public String toString() {
		return "Contagem Atual = " + this.contagemAtual;
	}
}
