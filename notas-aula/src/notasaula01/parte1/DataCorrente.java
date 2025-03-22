package notasaula01.parte1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DataCorrente {
	
	public static void main(String[] args) {
		char siglaCampoData;
		Scanner scanner = new Scanner(System.in);
		GregorianCalendar dataAtual = new GregorianCalendar();
		
		System.out.print("Qual informação da data corrente deseja obter (A/M/S/D)? ");
		siglaCampoData = scanner.next().charAt(0);
		
		switch(siglaCampoData) {
			case 'A': // A = Ano
				System.out.println("Ano: " + dataAtual.get(Calendar.YEAR));
				break;
			case 'M': // M = Mês
				System.out.println("Mês: " + dataAtual.get(Calendar.MONTH) + 1);
				break;
			case 'S': // S = Semana
				System.out.println("Dia da Semana: " + dataAtual.get(Calendar.DAY_OF_WEEK)); 
				break;
			case 'D': // D = Dia
				System.out.println("Dia: " + dataAtual.get(Calendar.DAY_OF_MONTH));
				break;
			default :
				System.out.println("Informação não reconhecida!");
		}
		
		scanner.close();
	}

}