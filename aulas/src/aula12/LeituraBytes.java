package aula12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// Leitura e listagem, em formato decimal, de bytes a partir de arquivo de texto
public class LeituraBytes {

	public static void main(String[] args) {
		try {
			// abertura de fluxo de entrada de arquivo
			InputStream fluxo = new FileInputStream("src/aula12/arquivos/arquivo.txt");
			int byteLido;								// próximo byte lido
			
			// leitura de bytes enquanto não se alcançar final do arquivo
			do {
				byteLido = fluxo.read();				// leitura de próximo byte
				if (byteLido != -1)						// se byte tiver sido lido...
					System.out.print(byteLido);			// listagem de próximo byte
			} while (byteLido != -1);
			
			fluxo.close();								// fechamento de fluxo
		}
		catch (IOException e) {							// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}