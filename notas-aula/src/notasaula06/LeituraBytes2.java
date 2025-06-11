package notasaula06;

import java.io.FileInputStream;
import java.io.IOException;

// Leitura de bytes a partir de arquivo
public class LeituraBytes2 {

	public static void main(String[] args) {
		try {
			// abertura de fluxo de entrada de arquivo
			FileInputStream fluxo = new FileInputStream("arquivo.bin");
			int qtdBytes = fluxo.available();			// quantidade de bytes para leitura
			
			byte[] bytesLidos = new byte[qtdBytes];		// array de bytes a serem lidos
			
			// leitura de bytes e armazenamento em array
			if (fluxo.read(bytesLidos) != -1) {			// em caso de não alcance de final do arquivo...
				String texto = new String(bytesLidos);	// string a partir de decodificação de bytes lidos
				System.out.println(texto);				// listagem de bytes lidos na forma de texto				
			}							
			
			fluxo.close();								// fechamento de fluxo
		}
		catch (IOException e) {							// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}
