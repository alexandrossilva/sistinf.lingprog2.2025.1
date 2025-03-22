package notasaula01.parte2.interfaces;

public interface MovelAMotor extends Movel {

	double LIMITE_VELOCIDADE = 80;
	
	double deslocamentoPorLitroCombustivel();
	
	default boolean velocidadeSuperiorLimite(double distancia, double tempo) {
		return distancia / tempo > LIMITE_VELOCIDADE;
	}
	
}