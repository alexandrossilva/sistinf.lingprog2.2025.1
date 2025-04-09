package lista02.questao02;

public class Conta {

	private double saldo;		// saldo corrente
	private double saldoMinimo;	// saldo mínimo (saldo atual não pode ser inferior a este saldo)

	// método construtor de inicialização de saldo mínimo
	public Conta(double saldoMinimo) {
		this.saldo = 0;	// inicialização de saldo atual (corrente) com 0 (zero)
		this.saldoMinimo = saldoMinimo;
	}

	// retorno de valor atual do saldo mínimo
	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	// atualização de valor atual do saldo mínimo
	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	// retorno de valor atual do saldo corrente
	public double getSaldo() {
		return saldo;
	}

	// operação de registro de depósito em conta, com atualização de saldo corrente
	public void depositar(double deposito) {
		saldo += deposito;
	}

	// operação de registro de saque em conta, com atualização de saldo corrente
	public void sacar(double saque) throws Exception {
		// saldo atualizado previsto após dedução de saque
		double saldoAtualizado = saldo - saque;

		// verificação de previsão de saldo atualizado abaixo de ao saldo mínimo
		if (saldoAtualizado < saldoMinimo) {
			// lançamento de exceção se saldo abaixo de saldo mínimo
			throw new Exception("Tentativa de realização de saque que implique em saldo inferior (" + 
								saldoAtualizado + ") ao saldo mínimo de " + saldoMinimo + "...");			
		}
		else {
			// efetiva atualização de saldo da conta
			saldo = saldoAtualizado;
		}
	}
	
}
