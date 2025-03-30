package lista01.questao09;

// Encapsulamento de dados típicos de funcionários
public class Funcionario {

	private String nome;
	private String sobrenome;
	private double valorHora;		// valor por hora trabalhada
	private int horasTrabalhadas;	// quantidade de horas trabalhadas
	
	// construtor de inicialização de todos os atributos
	public Funcionario(String nome, String sobrenome, double valorHora) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.valorHora = valorHora;
		this.horasTrabalhadas = 0;		// inicialização de horas trabalhadas com 0 (zero)
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public double getValorHora() {
		return valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	// atualização de horas trabalhadas pela adição de horas adicionais
	public void adicionarCargaHoraria(int horas) {
		horasTrabalhadas += horas;
	}
	
	// retorno de salário líquido
	public double getSalarioLiquido() {
		double salario = horasTrabalhadas * valorHora;	// salário base
		
		// tetos de faixas salariais, para efeito de alíquotas de desconto
		double teto1 = 1212.00;
		double teto2 = 2427.35;
		double teto3 = 3641.03;
		double teto4 = 7087.22;
		
		// base de cálculo da 1ª faixa salarial
		double baseCalculo1 = salario < teto1 ? salario : teto1;
		// base de cálculo da 2ª faixa salarial
		double baseCalculo2 = salario < teto1 ? 0 : salario >= teto2 ? teto2 - teto1 : salario - teto1;
		// base de cálculo da 3ª faixa salarial
		double baseCalculo3 = salario < teto2 ? 0 : salario >= teto3 ? teto3 - teto2 : salario - teto2;
		// base de cálculo da 4ª faixa salarial
		double baseCalculo4 = salario < teto3 ? 0 : salario >= teto4 ? teto4 - teto3 : salario - teto3;
		
		// somatório de descontos obtidos por base de cálculo de cada faixa salarial
		double desconto = baseCalculo1 * 7.5/100 +
				baseCalculo2 * 9.0/100 +
				baseCalculo3 * 12.0/100 +
				baseCalculo4 * 14.0/100;
		
		return salario - desconto;	// retorno de salário líquido
	}
	
}