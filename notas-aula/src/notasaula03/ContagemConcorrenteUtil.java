package notasaula03;

public class ContagemConcorrenteUtil {

	public static void main(String[] args) {
		// instanciação de 2 (duas) threads de contagem
		Thread t1 = new ContadorThread();
		Thread t2 = new ContadorThread();
		
		// definição de nomes das 2 (duas) threads de contagem
		t1.setName("C1");
		t2.setName("C2");
		
		// início da execução das tarefas das 2 (duas) threads de contagem
		t1.start();
		t2.start();
	}

}





