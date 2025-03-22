package notasaula01.parte2.enumeracoes;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncionarioUtil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n;
		double s;
		LocalDate admissao, nascimento;
		
		System.out.print("Nome...................: ");
		n = scanner.nextLine();
		System.out.print("Salário................: ");
		s = scanner.nextDouble();
		scanner.nextLine();  // descarte de caracteres após número fornecido
		System.out.print("Admissão (AAAA-MM-DD)..: ");
		// entrada de data de admissão e conversão para objeto java.time.LocalDate
		admissao = LocalDate.parse(scanner.nextLine());
		System.out.print("Nascimento (AAAA-MM-DD): ");
		// entrada de data de admissão e conversão para objeto java.time.LocalDate
		nascimento = LocalDate.parse(scanner.nextLine());
		
		Funcionario f = new Funcionario(n, s, admissao, nascimento);
		
		System.out.print("Faixa Etária...........: " + f.getFaixaEtaria());		
		
		scanner.close();
	}

}
