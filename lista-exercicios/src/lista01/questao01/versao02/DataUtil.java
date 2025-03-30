package lista01.questao01.versao02;

import java.util.Scanner;

//Demonstração de capacidades da classe Data
public class DataUtil {

	public static void main(String[] args) {
		int d, m, a;				// inteiros para dia, mês e ano
		Data data;					// variável para referenciar objeto da classe Data
		
		// fluxo de entrada padrão (a partir de teclado)
		Scanner scanner = new Scanner(System.in);			

		// entrada de dia, mês e ano
		System.out.print("Informe Dia (1-31): ");
		d = scanner.nextInt();
		System.out.print("Informe Mês (1-12): ");
		m = scanner.nextInt();
		System.out.print("Informe Ano.......: ");
		a = scanner.nextInt();
					
		data = new Data(d, m, a);	// instanciação de objeto da classe Data
		
		// listagem de data no formato DD/MM/AAAA
		System.out.println("\nData em Formato DD/MM/AAAA: " + data.mostrarData());			

		scanner.close();			// fechamento de fluxo de entrada
	}

}