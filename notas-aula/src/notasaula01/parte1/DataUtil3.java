package notasaula01.parte1;

import java.util.Date;

public class DataUtil3 {
	
	public static void main(String[] args) {
		Date dataHora = null; 						// não referência de nenhum objeto
		
		String descDataHora = dataHora.toString(); 	// erro em tempo de execução
		
		if (dataHora != null) { 					// verificação de variável-objeto
			descDataHora = dataHora.toString();
		}
	}

}