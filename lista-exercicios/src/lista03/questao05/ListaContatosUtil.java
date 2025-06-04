package lista03.questao05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaContatosUtil {

	public static void main(String[] args) throws ParseException {
		char op;
		
		Scanner scanner	 	= new Scanner(System.in);
		List<Contato> lista = new ArrayList<Contato>();

		do {
			System.out.print("Lista de Contatos: Inserir, Consultar ou Encerrar (I/C/E)? ");
			op = scanner.next().charAt(0);          // entrada de operação a ser realizada
			
			switch (op) {
				// inserção de contato na agenda
				case 'i':
				case 'I':
					System.out.println("Contato nº " + (lista.size() + 1));

					System.out.print("Nome....................: ");
					String nome = scanner.next();
					
					System.out.print("Telefone (DDNNNNNNNNN)..: ");
					long telefone = Long.parseLong(scanner.next());

					System.out.print("Aniversário (DD/MM/AAAA): ");
					// entrada de string e posteror conversão para um objeto da classe java.util.Date
					Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.next());
					// Obtenção de objeto java.util.GregorianCalendar a partir de objeto anterior
					GregorianCalendar dataNascimentoTemp = new GregorianCalendar();
					dataNascimentoTemp.setTime(dataNascimento);
					
					// instanciação de objeto da classe contato
					Contato contato = new Contato(nome, telefone, dataNascimentoTemp);
					
					lista.add(contato);             // inserção de objeto instanciado na lista
					
					System.out.println();
					break;
				// consulta de objetos inseridos
				case 'c':
				case 'C':
					System.out.print("Contatos com qual Ano de Nascimento? ");
					int ano = scanner.nextInt();    // entrada de ano de nascimento desejado
					
					// navegação entre os contatos da lista
					for (Contato contatoTemp: lista) {
						// verificação de ano de nascimento de enésimo contato (idêntico ou não ao ano desejado)
						if (contatoTemp.getDataNascimento().get(Calendar.YEAR) == ano) {
							System.out.println(contatoTemp);   // listagem de dados de contato
						}
					}

					System.out.println();
					break;
			}
		} while (op != 'e' && op != 'E');
		
		scanner.close();
	}

}
