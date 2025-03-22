package notasaula02;

public class RaizQuadradaNumeroNegativoException extends Exception {

	public RaizQuadradaNumeroNegativoException() {
		super("Raiz quadrada de número negativo inexistente!");
	}

	public RaizQuadradaNumeroNegativoException(String messagem) {
		super(messagem);
	}

}
