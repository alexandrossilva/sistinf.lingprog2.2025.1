package notasaula05;

import java.util.Collection;
import java.util.Iterator;

public abstract class AbstractCollectionTemp<E> implements Collection<E> {

	public abstract Iterator<E> iterator();
	
	public boolean contains(Object obj) {
		for (E element: this)  			// obtenção de iterador
			if (element.equals(obj))	// testagem de enésimo elemento com objeto
				return true;			// retorno de true em caso de testagem positiva
		return false;					// retorno de false em caso de nenhuma testagem positiva
	}
	
}
