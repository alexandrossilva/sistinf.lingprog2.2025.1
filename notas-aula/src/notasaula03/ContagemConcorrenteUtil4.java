package notasaula03;

import java.util.Scanner;

public class ContagemConcorrenteUtil4 {

	public static void main(String[] args) {
		final int MAX = 5;	// quantidade máxima de contadores
		int qtdCont = 0;	// quantidade atual de contadores
		String op;			// operação a ser executada
		Scanner scanner = new Scanner(System.in);
		
		// array de threads de contagem
		ContadorFlexivel[] contadores = new ContadorFlexivel[MAX];
		
		// bloco de repetição enquanto não for selecionada opção de encerramento
		do {
			System.out.print("Adicionar (A), Listar (L) ou Encerrar (E)? ");
			op = scanner.nextLine().toLowerCase();	// entrada de operação
			
			switch(op) {
				case "a":	// criação de nova thread de contagem
					if (qtdCont == MAX)
						System.out.println("Não é possível adicionar mais contadores!");
					else {
						ContadorFlexivel cont = new ContadorFlexivel(100);
						Thread thread = new Thread(cont, "C" + (qtdCont + 1));
						thread.start();
						contadores[qtdCont++] = cont;
					}
					break;
				case "l":
					for (int i = 0; i < qtdCont; i++)
						System.out.println("C" + (i + 1) + ": " + contadores[i]);
			}
		} while(!op.equalsIgnoreCase("e"));
		
		scanner.close();
	}

}
