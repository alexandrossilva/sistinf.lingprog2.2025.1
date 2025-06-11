package notasaula06;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class RegistroQuadroFuncionarios {

	public static void main(String[] args) {
		try {
			PrintWriter fluxo = new PrintWriter("quadro-funcionarios.txt");
			
			List<Funcionario> quadroFunc = new ArrayList<Funcionario>();
			
			quadroFunc.add(new Funcionario("José Silva", 7500, 1987, 12, 15));
			quadroFunc.add(new Funcionario("Henrique Santos", 5000, 1989, 10, 1));
			quadroFunc.add(new Funcionario("Maria Guimarães", 7500, 1990, 3, 15));
			
			Iterator<Funcionario> it = quadroFunc.iterator();

			while (it.hasNext()) {
				Funcionario func = it.next();
				int diaAdmissao = func.getDataAdmissao().get(Calendar.DAY_OF_MONTH);
				int mesAdmissao = func.getDataAdmissao().get(Calendar.MONTH) + 1;
				int anoAdmissao = func.getDataAdmissao().get(Calendar.YEAR);			
				
				fluxo.print(func.getNome() + "|");
				fluxo.print(func.getSalario() + "|");
				fluxo.println(anoAdmissao + "-" + mesAdmissao + "-" + diaAdmissao);
			}
			
			fluxo.close();			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
