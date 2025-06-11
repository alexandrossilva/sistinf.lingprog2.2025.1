package notasaula06;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Leitura de números armazenados em arquivo na forma de caracteres
public class LeituraNumeros {

	public static void main(String[] args) {
		try {			
			// abertura de fluxo de entrada de arquivo
			FileReader fluxoArquivo = new FileReader("numeros.txt");			
			// abertura de fluxo de entrada de dados a partir de fluxo de entrada de arquivo
			Scanner fluxo = new Scanner(fluxoArquivo);

			while (fluxo.hasNext()) {
				String linha = fluxo.nextLine();
				int n = Integer.parseInt(linha);			// leitura de próximo número a partir de fluxo
				System.out.println(n);			// listagem de número
			}
			
			// fechamento de fluxos
			fluxo.close();
			fluxoArquivo.close();
		}
		catch (IOException e) {					// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}
