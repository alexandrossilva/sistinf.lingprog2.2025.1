package notasaula06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeituraBinariaQuadroFuncionarios {

	public static void main(String[] args) {		
		List<Funcionario> quadroFunc = new ArrayList<Funcionario>();

		try {
			RandomAccessFile fluxoArquivo = new RandomAccessFile("quadro-funcionarios.dat", "r");
			
			long tamArquivo = fluxoArquivo.length();
			long qtdRegistros = tamArquivo / Funcionario.BYTES_POR_REGISTRO;
			
			for (int i = 0; i < qtdRegistros; i ++) {
				String nome = "";
				
				for (int j = 0; j < Funcionario.TAMANHO_NOME; j++)
					nome += fluxoArquivo.readChar();
				
				double salario = fluxoArquivo.readDouble();
				
				int anoAdmissao = fluxoArquivo.readInt();
				int mesAdmissao = fluxoArquivo.readInt();
				int diaAdmissao = fluxoArquivo.readInt();
				
				Funcionario func = new Funcionario(nome.trim(), salario, anoAdmissao, mesAdmissao, diaAdmissao);
				
				quadroFunc.add(func);
			}
			
			fluxoArquivo.close();

			Iterator<Funcionario> it = quadroFunc.iterator();
			
			while (it.hasNext())
				System.out.println(it.next());					
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
