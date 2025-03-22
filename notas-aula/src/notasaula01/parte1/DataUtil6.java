package notasaula01.parte1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataUtil6 {
	
	public static void main(String[] args) {
		GregorianCalendar data 			 = new GregorianCalendar();
		Date data2 						 = new Date();
		
		Date dataConversao 				 = data.getTime();

		GregorianCalendar dataConversao2 = new GregorianCalendar();
		dataConversao2.setTime(data2);
		
		System.out.println(dataConversao.toString());		
		System.out.println(dataConversao2.get(Calendar.YEAR));				
	}

}