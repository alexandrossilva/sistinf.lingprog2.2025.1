package notasaula06;

import java.io.FileInputStream;
import java.io.IOException;

// Leitura de bytes a partir de arquivo
public class LeituraBytes {

	public static void main(String[] args) {
		try {
			// abertura de fluxo de entrada de arquivo
			FileInputStream fluxo = new FileInputStream("arquivo.bin");
			byte byteLido;								// próximo byte lido
			
			// leitura de bytes enquanto não se alcançar final do arquivo
			do {
				byteLido = (byte)fluxo.read();			// leitura de próximo byte
				if (byteLido != -1)						// se byte tiver sido lido...
					System.out.print((char)byteLido);	// listagem de próximo byte como caractere
			} while (byteLido != -1);
			
			fluxo.close();								// fechamento de fluxo
		}
		catch (IOException e) {							// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}
