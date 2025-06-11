package notasaula06;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

//Leitura de inteiros a partir de arquivo
public class LeituraBinariaNumeros {

	public static void main(String[] args) {
		try {
			// abertura de fluxo de entrada de arquivo
			FileInputStream fluxoArquivos = new FileInputStream("numeros.bin");
			// abertura de fluxo de entrada de dados a partir de fluxo de entrada de arquivo
			DataInputStream fluxoDados = new DataInputStream(fluxoArquivos);

			boolean finalArquivo = false;				// flag de alcance de final de arquivo
			
			// leitura de números enquanto final de arquivo não for alcançado
			while (!finalArquivo) {
				try {
					int numLido = fluxoDados.readInt();	// leitura de próximo número					
					System.out.println(numLido);		// listagem de número lido				
				}
				catch(EOFException e) {
					finalArquivo = true;				// atualização de flag de final de arquivo
					System.out.println("Arquivo totalmente lido!");
				}				
			}
			
			// fechamento de fluxos
			fluxoDados.close();
			fluxoArquivos.close();
		}
		catch (IOException e) {							// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}
