package lista01.questao07;

import java.util.Date;
import java.util.Scanner;

public class VooUtil {

	public static void main(String[] args) {
		int op, n;
		Scanner scanner = new Scanner(System.in);
		
		Voo v;
		v = new Voo(1, new Date());
		v.assentos[2] = false;
				
		do {
			System.out.println("******************** MENU ********************");
			System.out.println("* 1 - Consultar Próximo Assento Livre        *");
			System.out.println("* 2 - Consultar Disponibilidade de Assentos  *");
			System.out.println("* 3 - Consultar Taxa de Ocupação             *");
			System.out.println("* 4 - Reservar Assento                       *");
			System.out.println("* 5 - Encerrar                               *");
			System.out.println("**********************************************");
			
			System.out.print("\nInforme Código Operação (1-4): ");
			op = scanner.nextInt();
			
			switch(op) {
				case 1:
					n = v.getProximoAssentoLivre();
					
					if (n == -1)
						System.out.println("\nNão há Assentos Livres!\n");
					else
						System.out.println("\nPróximo Assento Livre: " + n + "\n");
					
					break;
				case 2: 
					System.out.println("\nAssentos Livres: " + v.getTotalAssentosLivres() + "\n");
					break;
				case 3: 
					System.out.println("\nTaxa de Ocupação: " + v.getTaxaOcupacao() + "%\n");
					break;
				case 4:
					System.out.print("\nInforme Assento (1-70): ");
					n = scanner.nextInt();
					
					if (v.ocuparAssento(n))
						System.out.println("\nAssento Ocupado com Sucesso!\n");
					else 
						System.out.println("\nFalha ao Ocupar Assento!\n");
					
					break;
			}
		} while (op != 5);
		
		scanner.close();
	}

}