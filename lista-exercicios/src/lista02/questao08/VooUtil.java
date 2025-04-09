package lista02.questao08;

import java.util.Date;
import java.util.Scanner;
import lista02.questao07.resp.Voo;

public class VooUtil {

	public static void main(String[] args) {
		final int TAM = 70;		// definição de quantidade de assentos de voo		
		int op;					// operação a realizar
		Scanner scanner = new Scanner(System.in);
		
		// instanciação de voo com capacidade de acordo com constante indicada por TAM
		Voo v = new Voo(1, new Date(), TAM);
				
		// bloco de repetição de operações com o voo instanciado
		do {
			System.out.println("******************* MENU *******************");
			System.out.println("* 1 - Consultar Disponibilidade de Assento *");
			System.out.println("* 2 - Reservar Assento                     *");
			System.out.println("* 3 - Consultar Taxa de Ocupação           *");
			System.out.println("* 4 - Encerrar                             *");
			System.out.println("********************************************");
			
			System.out.print("\nInforme Código Operação (1-4): ");
			op = scanner.nextInt();					// entrada de operação
			
			switch(op) {
				// consulta de assento (livre ou ocupado)
				case 1:
					System.out.print("\nInforme Assento (1-" + TAM + "): ");
					int n = scanner.nextInt();		// entrada de número de assento
					
					try {
						if (v.isAssentoLivre(n))	// consulta de situação de assento
							System.out.println("\nAssento Livre!\n");
						else 
							System.out.println("\nAssento Ocupado!\n");						
					}
					catch(Exception e) {			// tratamento de exceção se assento inválido
						System.out.println("\n" + e.getMessage() + "\n");
					}
					
					break;
				// reserva de assento
				case 2:
					System.out.print("\nInforme Assento (1-" + TAM + "): ");
					n = scanner.nextInt();			// entrada de número de assento
					
					try {
						if (v.ocuparAssento(n))		// tentativa de ocupação de assento
							System.out.println("\nAssento Ocupado com Sucesso!\n");
						else 
							System.out.println("\nFalha ao Ocupar Assento!\n");						
					}
					catch(Exception e) {			// tratamento de exceção se assento inválido
						System.out.println("\n" + e.getMessage() + "\n");
					}
					
					break;
				// consulta de taxa de ocupação
				case 3: 
					System.out.println("\nTaxa de Ocupação: " + v.getTaxaOcupacao() + "%\n");
			}
		} while (op != 4);
		
		scanner.close();
	}

}