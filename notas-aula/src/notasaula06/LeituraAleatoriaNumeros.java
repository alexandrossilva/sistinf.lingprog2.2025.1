package notasaula06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

//Leitura aleatória de inteiros a partir de arquivo
public class LeituraAleatoriaNumeros {

	public static void main(String[] args) {
		final int BYTES_POR_NUMERO = 4;
		
		try {
			// abertura de fluxo de entrada via console
			Scanner scanner = new Scanner(System.in);
			// abertura de fluxo de acesso aleatório de arquivo
			RandomAccessFile fluxoArquivo = new RandomAccessFile("numeros.bin", "r");
			
			long tamArquivo = fluxoArquivo.length();	// tamanho do arquivo em bytes
			long qtdNumeros = tamArquivo / BYTES_POR_NUMERO;
			long pos;
			
			do {
				System.out.print("Digite posição (1-" + qtdNumeros + ") de número a ser lido ou 0 (zero) para encerrar: ");
				pos = scanner.nextLong();
				
				if (pos != 0) {
					fluxoArquivo.seek((pos - 1) * BYTES_POR_NUMERO);
					System.out.println("Número lido: " + fluxoArquivo.readInt());
				}
			} while (pos != 0);
			
			// fechamento de fluxos
			fluxoArquivo.close();
			scanner.close();
		}
		catch (IOException e) {							// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}
