package notasaula03;

public class ContagemConcorrenteUtil3 {

	public static void main(String[] args) {
		// instanciação de 2 (dois) contadores
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		
		// instanciação de 2 (duas) threads com os contadores criados anteriormente
		Thread t1 = new Thread(c1, "C1");
		Thread t2 = new Thread(c2, "C2");
		
		// início da execução das tarefas das 2 (duas) threads de contagem
		t1.start();
		t2.start();
	}

}
