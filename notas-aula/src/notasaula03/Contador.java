package notasaula03;

public class Contador implements Runnable {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Contagem Atual " + Thread.currentThread().getName() + ": " + i);
		}
	}

}
