package lista02.questao06.resp;

import java.util.Scanner;
import lista02.questao05.resp.Data;
import lista02.questao05.resp.DataIncorretaException;

public class DataUtil {

    public static void main(String[] args) {
        int d, m, a;					// dia, mês e ano (para entrada) 
        Data data 			= null;		// inicialização de objeto da classe Data
        boolean anoValido 	= false;	// variável de controle de bloco de repetição
        
        Scanner scanner = new Scanner(System.in);			

        // repetição de entrada de data enquanto ela for inválida
        do {
	        // entrada de dia, mês e ano de data
	        System.out.print("Informe Dia (1-31): ");
	        d = scanner.nextInt();
	        System.out.print("Informe Mês (1-12): ");
	        m = scanner.nextInt();
	        System.out.print("Informe Ano.......: ");
	        a = scanner.nextInt();
	        
	        try {
		        // instanciação de objeto da classe Data a partir de entrada de dia, mês e ano
		        data = new Data(d, m, a);	
		        // atualização de variável de controle de bloco de repetição se entrada for válida
		        anoValido = true;
	        }
	        catch(DataIncorretaException e) {
	        	System.out.println(e.getMessage() + ". Necessário fornecer data novamente!");
	        }
        } while (!anoValido);
        
        // invocação de métodos do objeto instanciado da classe Data
        System.out.println("\nData em formato DD/MM/AAAA.............: " + data);			
        System.out.println("Quantidade de dias restantes para o ano: " + data.getDiasTerminoAno());			

        scanner.close();
    }

}