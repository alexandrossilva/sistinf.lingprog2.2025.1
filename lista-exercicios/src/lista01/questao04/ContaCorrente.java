package lista01.questao04;

import java.util.Scanner;

public class ContaCorrente {

	protected double saldo;			// saldo corrente da conta

	// obtenção de saldo corrente da conta
	public double getSaldo() {
		return saldo;
	}
	
	// operação de depósito com consequente atualização de saldo corrente da conta
	public boolean registrarDeposito(double valor) {
		if (valor <= 0)				// se valor a depositar não for positivo...
			return false;			
		else {						// caso contrário...
			saldo += valor;			// atualização de saldo corrente
			return true;
		}
	}

	// operação de saque com consequente atualização de saldo corrente da conta
	public boolean registrarSaque(double valor) {
		if (valor <= 0)				// se valor a sacar não for positivo...
			return false;
		else {						// caso contrário...
			// cálculo de tarifa (0,5% do valor de saque)
			double tarifa = valor * 0.5 / 100;
			
			// verificação de saldo negativo após dedução de saque e tarifa
			if (saldo < valor + tarifa)
				return false;		// não efetivação, neste caso, de saque
			else {
				// atualização de saldo deduzindo-se saque e tarifa
				saldo -= (valor + tarifa);
				return true;				
			}
		}
	}
	
	public static void main(String[] args) {
		char resp;
		Scanner scanner = new Scanner(System.in);

		// instanciação de objeto da classe ContaCorrente
		ContaCorrente conta = new ContaCorrente();
		
		System.out.println("Saldo Inicial: " + conta.getSaldo());
		System.out.println("\nOPERAÇÕES DE DEPÓSITO (D) OU SAQUE (S)");
		
		// operações de entrada e/ou saque
		do {
			// entrada de valor de saque e/ou depósito
			System.out.print("\nValor de Depósito/Saque: ");
			double v = scanner.nextDouble();
			
			// entrada de tipo de operação a realizar (saque ou depósito)
			System.out.print("Tipo de Operação (D/S).: ");
			char op = scanner.next().charAt(0);

			if (op == 'D' || op == 'd')			// se operação for de depósito...
				conta.registrarDeposito(v);
			else if (op == 'S' || op == 's')	// se operação for de saque...
				conta.registrarSaque(v);
			
			// listagem de saldo atualizado após operação de saque ou depósito
			System.out.println("Saldo Atualizado.......: " + conta.getSaldo());
			
			// entrada para encerrar ou realizar nova operação de saque ou depósito
			System.out.print("\nDeseja encerrar (S/N)? ");
			resp = scanner.next().charAt(0);
		} while (resp == 'N' || resp == 'n');
		
		scanner.close();
	}
	
}