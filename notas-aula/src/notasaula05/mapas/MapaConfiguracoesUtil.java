package notasaula05.mapas;

import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class MapaConfiguracoesUtil {

	public static void main(String[] args) {
		// instanciação de mapa de configurações de um programa típico
		Properties configuracoes = new Properties();
		Scanner scanner = new Scanner(System.in);
		char op;									// operação a ser realizada com mapa

		System.out.println("Gerenciamento de Configurações de Programa");

		do {	// bloco de repetição enquando não for indicado encerramento do programa
			System.out.print("Inserir Parâmetro (I), Listar Parâmetro (L) ou Encerrar (E)? ");
			op = scanner.nextLine().toLowerCase().charAt(0);		// entrada de operação
			
			switch(op) {
				// mapeamento de novo parâmetro de configuração
				case 'I':
				case 'i':
					System.out.print("Nome de Novo Parâmetro.: ");
					String parametro = scanner.nextLine().toUpperCase();
					System.out.print("Valor de Novo Parâmetro: ");
					String valor = scanner.nextLine();
					configuracoes.setProperty(parametro, valor);	// parâmetro usado como chave
					break;
				// listagem de parâmetros de configuração mapeados
				case 'l':
				case 'L':
					// obtenção de conjunto de chaves de parâmetros
					Set parametros = configuracoes.keySet();
					
					System.out.println("Lista de Configurações");
					for (Object param: parametros) {				// iteração entre os parâmetros
						System.out.println(param + ": " + configuracoes.get(param));
					}
			}
			
		} while (op != 'E' && op != 'e');
		
		scanner.close();
	}

}
