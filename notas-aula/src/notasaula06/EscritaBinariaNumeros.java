package notasaula06;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//Leitura de inteiros a partir de arquivo
public class EscritaBinariaNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			// abertura de fluxo de saída de arquivo
			FileOutputStream fluxoArquivo = new FileOutputStream("numeros.bin");
			// abertura de fluxo de saída de dados a partir de fluxo de saída de arquivo
			DataOutputStream fluxoDados = new DataOutputStream(fluxoArquivo);

			int n;								// próximo número fornecido a partir de console
			
			do {
				System.out.print("Digite um número ou 0 (zero) para encerrar: ");
				n = scanner.nextInt();			// entrada de número a partir de console
				if (n != 0)						// se número fornecido por diferente de 0 (zero)...
					fluxoDados.writeInt(n);		// gravação de número em arquivo
			} while (n != 0);
			
			System.out.println("Números digitados gravados em arquivo!");
			
			// fechamento de fluxos
			fluxoDados.close();
			fluxoArquivo.close();
		}
		catch (IOException e) {					// captura de exceção de entrada/saída
			e.printStackTrace();
		}
		
		scanner.close();						// fechamento de fluxo de entrada via console
	}

}
