package lista01.questao13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LeituraDataHora {
	
	public static Date ler(Scanner scanner) {
		// instância de classe de formatação e conversão de datas e/ou horas
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		// entrada de data e hora
		String dataHoraString = scanner.nextLine();

		// tentativa de conversão para instanciação de objeto Date
		try {
			return formato.parse(dataHoraString);         
		}
		// captura de exceção em caso de entrada de data/hora em formato inválido
		catch(Exception e) {
			System.out.println("Data/hora em formato inválido!");
			return null;
		}
	}

}