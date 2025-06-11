package notasaula06;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LeituraQuadroFuncionarios {

	public static void main(String[] args) {
		List<Funcionario> quadroFunc = new ArrayList<Funcionario>();

		try {
			FileReader fluxoArquivo = new FileReader("quadro-funcionarios.txt");
			
			Scanner fluxo = new Scanner(fluxoArquivo);
			
			while (fluxo.hasNext()) {
				String linha = fluxo.nextLine();
				
				String[] tokens = linha.split("\\|");
				
				String nome = tokens[0];
				double salario = Double.parseDouble(tokens[1]);
				
				String dataAdmissao = tokens[2];			
				String[] tokensDataAdmissao = dataAdmissao.split("-");
				int anoAdmissao = Integer.parseInt(tokensDataAdmissao[0]);
				int mesAdmissao = Integer.parseInt(tokensDataAdmissao[1]);
				int diaAdmissao = Integer.parseInt(tokensDataAdmissao[2]);
				
				Funcionario func = new Funcionario(nome, salario, anoAdmissao, mesAdmissao, diaAdmissao);
				
				quadroFunc.add(func);
			}
			
			fluxo.close();

			Iterator<Funcionario> it = quadroFunc.iterator();
			
			while (it.hasNext())
				System.out.println(it.next());					
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
