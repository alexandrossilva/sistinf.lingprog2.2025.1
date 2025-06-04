package notasaula03;

public class ContagemUtil {

	public static void main(String[] args) {
		ContadorThread t1 = new ContadorThread();
		ContadorThread t2 = new ContadorThread();
		t1.start();
		t2.start();
	}

}
