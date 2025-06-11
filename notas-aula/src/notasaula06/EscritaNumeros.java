package notasaula06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//Escrita em arquivo, na forma de caracteres, de inteiros
public class EscritaNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			// abertura de fluxo de saída de arquivo (sem sobrepor seu conteúdo anterior)
			FileWriter fluxoArquivo = new FileWriter("numeros.txt", true);
			// abertura de fluxo de saída de dados a partir de fluxo de saída de arquivo
			PrintWriter fluxo = new PrintWriter(fluxoArquivo, true);

			int n;								// próximo número fornecido a partir de console
			
			do {
				System.out.print("Digite um número ou 0 (zero) para encerrar: ");
				n = scanner.nextInt();			// entrada de número a partir de console
				if (n != 0)						// se número fornecido por diferente de 0 (zero)...
					fluxo.println(n);			// gravação de número em arquivo
			} while (n != 0);
			
			System.out.println("Números digitados gravados em arquivo!");
			
			// fechamento de fluxos
			fluxo.close();
			fluxoArquivo.close();
		}
		catch (IOException e) {					// captura de exceção de entrada/saída
			e.printStackTrace();
		}
		
		scanner.close();						// fechamento de fluxo de entrada via console
	}

}
