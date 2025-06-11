package notasaula06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegistroListaObjetos {

	public static void main(String[] args) {
		try {
			FileOutputStream fluxoArquivo = new FileOutputStream("quadro-funcionarios.obj");
			ObjectOutputStream fluxoObjetos = new ObjectOutputStream(fluxoArquivo);
			
			List<Funcionario> quadroFunc = new ArrayList<Funcionario>();
			
			quadroFunc.add(new Funcionario("José Silva", 7500, 1987, 12, 15));
			quadroFunc.add(new Funcionario("Henrique Santos", 5000, 1989, 10, 1));
			quadroFunc.add(new Funcionario("Maria Guimarães", 7500, 1990, 3, 15));
			
			Gerente gerente = new Gerente("Renata Batista", 12200, 1990, 3, 15);
			gerente.setBonus(1000);
			quadroFunc.add(gerente);			

			fluxoObjetos.writeInt(quadroFunc.size());
			
			Iterator<Funcionario> it = quadroFunc.iterator();
			
			while (it.hasNext()) {
				Funcionario func = it.next();
				
				fluxoObjetos.writeObject(func);
			}
			
			fluxoObjetos.close();
			fluxoArquivo.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
