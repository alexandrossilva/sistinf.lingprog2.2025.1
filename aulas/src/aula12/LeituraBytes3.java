package aula12;

import java.io.FileInputStream;
import java.io.IOException;

// Leitura de bytes a partir de arquivo de texto seguido de listagem de inteiros e caracteres correspondentes
public class LeituraBytes3 {

	public static void main(String[] args) {
		try {
			// abertura de fluxo de entrada de arquivo
			FileInputStream fluxo = new FileInputStream("src/aula12/arquivos/arquivo.txt");
			int byteLido;								// próximo byte lido
			int qtdBytesLidos = 0;						// contador de bytes lidos
			
			// leitura de bytes enquanto não se alcançar final do arquivo
			do {
				byteLido = fluxo.read();				// leitura de próximo byte
				if (byteLido != -1) {					// se byte tiver sido lido...
					qtdBytesLidos++;					// atualização de quantidade de bytes lidos
					// listagem de próximo byte como caractere
					System.out.printf("%2dº Byte em decimal: %3d -> caractere [%s]\n", 
									  qtdBytesLidos, byteLido, (char)byteLido);
				}
			} while (byteLido != -1);
			
			fluxo.close();								// fechamento de fluxo
		}
		catch (IOException e) {							// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}