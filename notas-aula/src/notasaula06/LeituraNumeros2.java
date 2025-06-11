package notasaula06;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

//Leitura de números armazenados em arquivo na forma de caracteres
public class LeituraNumeros2 {

	public static void main(String[] args) {
		try {			
			Path caminho = FileSystems.getDefault().getPath("numeros.txt");
			List<String> linhas = Files.readAllLines(caminho);

			Iterator<String> it = linhas.iterator();
			
			while (it.hasNext()) {
				String linha = it.next();
				int n = Integer.parseInt(linha);	// leitura de próximo número a partir de fluxo
				System.out.println(n);				// listagem de número
			}			
		}
		catch (IOException e) {						// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}
