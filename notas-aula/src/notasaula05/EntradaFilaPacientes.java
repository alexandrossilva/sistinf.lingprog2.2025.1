package notasaula05;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class EntradaFilaPacientes {

	public static void main(String[] args) {
		Queue<String> filaPacientes = new ArrayDeque<String>();
		Scanner scanner 			= new Scanner(System.in);
		char op;	// variável sentinela de controle de operações da fila
		
		do {
			System.out.println("\nOPERAÇÕES COM FILA DE PACIENTES");
			System.out.print("Inserir, Remover, Listar ou Encerrar (I/R/L/E)? ");
			op = scanner.nextLine().toLowerCase().charAt(0);  // entrada de operação
			
			switch(op) {
				case 'i':  	// entrada de nome de paciente e inserção na fila
					System.out.print("\nNome de Novo Paciente: ");
					String nome = scanner.nextLine().toUpperCase();
					filaPacientes.add(nome);
					break;
				case 'r':	// remoção de próximo paciente da fila (se não estiver vazia)
					if (filaPacientes.isEmpty())
						System.out.println("\nFila Vazia!");
					else
						System.out.printf("\nÚltimo Paciente Removido: %s!\n", filaPacientes.remove());
					break;
				case 'l':	// listagem de pacientes da fila (se não estiver vazia)
					if (filaPacientes.isEmpty())
						System.out.println("\nFila Vazia!");
					else {
						System.out.println("\nFila de Pacientes");
						Iterator<String> it = filaPacientes.iterator();
						for (int i = 1; it.hasNext(); i++)
							System.out.printf("Paciente %2d: %s\n", i, it.next());
					}
					break;
			}
		} while(op != 'e');	// verificação de sinalização de encerramento
		
		scanner.close();	// encerramento de fluxo de entrada
	}
	
}
