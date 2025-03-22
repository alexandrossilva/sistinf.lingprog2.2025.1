package notasaula01.parte1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DataCorrente2 {
	
	public static void main(String[] args) {
		String[] meses = new String[] {"Janeiro", "Fevereiro",
				"Março", "Abril", "Maio", "Junho", "Julho",
				"Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		String[] diasSemana = new String[] {"Domingo", "Segunda-Feira",
				"Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};
		
		char siglaCampoData;
		Scanner scanner = new Scanner(System.in);
		GregorianCalendar dataAtual = new GregorianCalendar();
		
		System.out.print("Qual informação da data corrente deseja obter (A/M/S/D)? ");
		siglaCampoData = scanner.next().charAt(0);
		
		switch(siglaCampoData) {
			case 'A':
				System.out.println("Ano: " + dataAtual.get(Calendar.YEAR));
				break;
			case 'M':
				System.out.println("Mês: " + meses[dataAtual.get(Calendar.MONTH)]);
				break;
			case 'S':
				System.out.println("Dia da Semana: " + diasSemana[dataAtual.get(Calendar.DAY_OF_WEEK) - 1]);
				break;
			case 'D':
				System.out.println("Dia: " + dataAtual.get(Calendar.DAY_OF_MONTH));
				break;
			default :
				System.out.println("Informação não reconhecida!");
		}
		
		scanner.close();
	}

}