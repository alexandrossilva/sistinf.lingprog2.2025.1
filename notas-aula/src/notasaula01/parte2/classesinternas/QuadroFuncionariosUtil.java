package notasaula01.parte2.classesinternas;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class QuadroFuncionariosUtil {

	public static final int TAM = 5;	// quantidade de funcionários
	
	public static void main(String[] args) {		
		Funcionario[] quadro = new Funcionario[TAM];
		Scanner scanner 	 = new Scanner(System.in);
		GregorianCalendar hoje = new GregorianCalendar();
		String n;	// nome do enésimo funcionário
		double s;	// salário do enésimo funcionário

		// entrada de nomes e salários de de cada funcionário
		for (int i = 0; i < TAM; i++) {
			System.out.printf("\nFUNCIONÁRIO %d\n", i + 1);
			System.out.print("Nome...: ");
			n = scanner.nextLine();
			System.out.print("Salário: ");
			s = scanner.nextDouble();
			scanner.nextLine();		// descarte de caracteres após número fornecido

			// inserção de enésimo funcionário no array
			// fixação de data de admissão como primeiro dia do ano corrente
			quadro[i] = new Funcionario(n, s, hoje.get(Calendar.YEAR), Calendar.JANUARY, 1);
		}
		
		Arrays.sort(quadro, new Comparator() {
			public int compare(Object o1, Object o2) {
				Funcionario func1 = (Funcionario)o1;
				Funcionario func2 = (Funcionario)o2;
				return func1.getNome().compareTo(func2.getNome());
			}
		});
		
		// listagem de funcionários após ordenação
		System.out.println("Listagem Ordenada de Quadro de Funcionários");
		for (Funcionario f: quadro)
			System.out.println(f);
		
		scanner.close();
	}

}