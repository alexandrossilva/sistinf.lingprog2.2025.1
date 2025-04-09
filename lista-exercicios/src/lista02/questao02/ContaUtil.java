package lista02.questao02;

import java.util.Scanner;

public class ContaUtil {
	
	public static void main(String[] args) {
		double valor;
		boolean isFalhaSaque;
		Conta conta = null;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe Saldo Mínimo: ");
		valor = scanner.nextDouble();      // entrada de saldo mínimo de conta

		conta = new Conta(valor);          // inicialização de objeto da classe Conta

		System.out.print("\nInforme Depósito Inicial: ");
		valor = scanner.nextDouble();      // entrada de valor de depósito inicial da conta

		conta.depositar(valor);            // operação de depósito

		isFalhaSaque = true;

		// bloco de repetição enquanto entrada de saque for inválida
		do {
			System.out.print("\nInforme Saque após Depósito Inicial: ");
			valor = scanner.nextDouble();   // entrada de valor de saque
			try {
				conta.sacar(valor);          // efetivação de operação de saque
				// atualização de variável de controle para encerramento de bloco de repetição
				isFalhaSaque = false;   
			}
			catch(Exception e) {            // exceção em caso de falha na operação de saqye
				System.out.println(e.getMessage());            
			}         
		} while (isFalhaSaque);
		System.out.print("\nInforme Saque após Depósito Inicial: ");

		// exibição de saldo corrente de conta após operações de depósito e saque
		System.out.println("\nSaldo Final: " + conta.getSaldo());

		scanner.close();
	}

}