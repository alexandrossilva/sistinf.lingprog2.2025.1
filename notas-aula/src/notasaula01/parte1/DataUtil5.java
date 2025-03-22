package notasaula01.parte1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataUtil5 {
	
	public static void main(String[] args) {
		// data e hora correspondente ao horário de construção do objeto
		GregorianCalendar dataHoraAtual = new GregorianCalendar();

		// data e hora específica, pela indicação ao construtor, nessa ordem, de ano, mês e dia
		GregorianCalendar dataHora = new GregorianCalendar(2021, 05, 04);
		
		GregorianCalendar dataHora2 = new GregorianCalendar(2021, Calendar.JUNE, 04);
		
		System.out.println(dataHora2.toString());
	}

}