package notasaula01.parte1;

import java.util.Date;

public class DataUtil4 {
	
	public static void main(String[] args) {
		Date dataHora = new Date(1622775600000l);  // Representação de 04/06/2021
		
		String descDataHora = dataHora.toString();

		System.out.println(descDataHora);
	}

}