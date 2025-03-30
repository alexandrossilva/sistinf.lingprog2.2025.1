package lista01.questao08;

import java.util.Date;
import lista01.questao07.Voo;

public class VooFlexivel extends Voo {

	// construtor com indicação de número, data e horário e quantidade de assentos de voo
	public VooFlexivel(int numero, Date dataHorario, int assentos) {
		super(numero, dataHorario);				// invocação de construtor da superclasse
		this.assentos = new boolean[assentos];	// inicialização de capacidade de assentos de voo
	}
	
	// obtenção de quantidade de assentos com base em tamanho de array de situação de assentos
	public int getTotalAssentos() {
		return assentos.length;
	}

}