package notasaula01.parte1;

import java.util.Date;

public class DataUtil2 {
	
	public static void main(String[] args) {
		Date dataHora = new Date();
		
		String descDataHora = new Date().toString();

		Date dataHoraTermino; 						// não referência de nenhum objeto
		
		dataHoraTermino = dataHora;  				// referência de objeto criado anteriormente
		
		descDataHora = dataHoraTermino.toString(); 	// não há mais erro de compilação
	}

}