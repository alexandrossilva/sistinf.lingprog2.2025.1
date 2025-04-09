package lista02.questao06;

import java.util.Scanner;
import lista02.questao05.Data;

public class DataUtil {

	public static void main(String[] args) {
		int d, m, a;
		Data data;

		Scanner scanner = new Scanner(System.in);			

		// entrada de dia, mês e ano de data
		System.out.print("Informe Dia (1-31): ");
		d = scanner.nextInt();
		System.out.print("Informe Mês (1-12): ");
		m = scanner.nextInt();
		System.out.print("Informe Ano.......: ");
		a = scanner.nextInt();
		    
		// instanciação de objeto da classe Data
		data = new Data(d, m, a);

		// invocação de métodos do objeto instanciado da classe Data
		System.out.println("\nData em formato DD/MM/AAAA.............: " + data);			
		System.out.println("Quantidade de dias restantes para o ano: " + 
				data.getDiasTerminoAno());			

		scanner.close();
	}

}