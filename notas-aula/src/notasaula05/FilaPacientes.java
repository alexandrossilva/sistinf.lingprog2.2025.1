package notasaula05;

import java.util.ArrayDeque;
import java.util.Queue;

public class FilaPacientes {

	public static void main(String[] args) {
		Queue<String> filaPacientes = new ArrayDeque<String>();
		String ultimoPaciente = null;				// último paciente removido
		
		filaPacientes.add("José Silva");			// inclusão de primeiro paciente
		filaPacientes.add("Henrique Santos");		// inclusão de segundo paciente
		System.out.println("Fila após Inclusão de Pacientes: " + filaPacientes);
		
		filaPacientes.add("Maria Guimarães");		// inclusão de terceiro paciente
		System.out.println("Fila após Nova Inclusão: " + filaPacientes);
		
		ultimoPaciente = filaPacientes.remove();	// remoção de primeiro paciente
		System.out.println("Fila após Saída de " + ultimoPaciente + ": " + filaPacientes);

		ultimoPaciente = filaPacientes.remove();	// remoção de segundo paciente
		ultimoPaciente = filaPacientes.remove();	// remoção de terceiro paciente
		System.out.println("Fila após Saída de mais Dois Pacientes: " + filaPacientes);
		
		filaPacientes.remove();						// nova tentativa de remoção (em fila vazia)
	}
	
}
