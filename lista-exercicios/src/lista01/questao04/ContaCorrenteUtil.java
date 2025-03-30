package lista01.questao04;

import java.util.Scanner;

public class ContaCorrenteUtil {
	
	public static void main(String[] args) {
		char resp;
		Scanner scanner = new Scanner(System.in);

		ContaCorrente conta = new ContaCorrente();
		
		System.out.println("Saldo Inicial: " + conta.getSaldo());
		System.out.println("\nOPERAÇÕES DE DEPÓSITO (D) OU SAQUE (S)");
		
		do {
			System.out.print("\nValor de Depósito/Saque: ");
			double v = scanner.nextDouble();
			
			System.out.print("Tipo de Operação (D/S).: ");
			char op = scanner.next().charAt(0);

			if (op == 'D' || op == 'd')
				conta.registrarDeposito(v);
			else if (op == 'S' || op == 's')
				conta.registrarSaque(v);
			
			System.out.println("Saldo Atualizado.......: " + conta.getSaldo());
			
			System.out.print("\nDeseja encerrar (S/N)? ");
			resp = scanner.next().charAt(0);
		} while (resp == 'N' || resp == 'n');
		
		scanner.close();
	}
	
}
