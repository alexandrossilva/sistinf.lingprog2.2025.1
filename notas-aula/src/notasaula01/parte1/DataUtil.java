package notasaula01.parte1;

import java.util.Date;

public class DataUtil {
	
	public static void main(String[] args) {
		System.out.println(new Date());

		String descDataHora = new Date().toString();

		System.out.println(descDataHora);
		
		Date dataHora = new Date();
		
		System.out.println(descDataHora);
	}

}