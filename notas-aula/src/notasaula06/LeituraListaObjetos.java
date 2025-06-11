package notasaula06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeituraListaObjetos {

	public static void main(String[] args) {
		try {
			FileInputStream fluxoArquivo = new FileInputStream("quadro-funcionarios.obj");
			ObjectInputStream fluxoObjetos = new ObjectInputStream(fluxoArquivo);
			
			List<Funcionario> quadroFunc = new ArrayList<Funcionario>();
			
			int numFunc = fluxoObjetos.readInt();
			
			for (int i = 0; i < numFunc; i++) {
				Funcionario func = (Funcionario)fluxoObjetos.readObject();
				
				quadroFunc.add(func);
			}
			
			fluxoObjetos.close();
			fluxoArquivo.close();

			Iterator<Funcionario> it = quadroFunc.iterator();
			
			while (it.hasNext())
				System.out.println(it.next());					
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
