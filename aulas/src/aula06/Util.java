package aula06;

public class Util {

	public static void main(String[] args) {
		Mamifero m = new Primata();
		m.andar();
		((Primata)m).andar(20);
		((Primata)m).andar(20.5);
	}

}
