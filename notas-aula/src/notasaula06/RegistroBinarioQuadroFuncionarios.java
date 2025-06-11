package notasaula06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class RegistroBinarioQuadroFuncionarios {

	public static void main(String[] args) {
		try {
			RandomAccessFile fluxoArquivo = new RandomAccessFile("quadro-funcionarios.dat", "rw");
			
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
				
				fluxoArquivo.writeChars(func.getNomeTamFixo());
				fluxoArquivo.writeDouble(func.getSalario());
				fluxoArquivo.writeInt(anoAdmissao);
				fluxoArquivo.writeInt(mesAdmissao);
				fluxoArquivo.writeInt(diaAdmissao);
			}
			
			fluxoArquivo.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
