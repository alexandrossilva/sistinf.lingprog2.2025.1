package notasaula06;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CodificacaoCaracteresUtil {

	public static void main(String[] args) {
		Map<String, Charset> mapaCodificaoes = Charset.availableCharsets();

		Set<String> chavesCodificacao = mapaCodificaoes.keySet();
		
		Iterator<String> it = chavesCodificacao.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}		
	}

}
