package notasaula03;

public class ContadorThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Contagem Atual de " + getName() + ": " + i);
		}
	}

}
