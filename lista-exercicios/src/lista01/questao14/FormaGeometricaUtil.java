package lista01.questao14;

import java.util.Scanner;

public class FormaGeometricaUtil {

	public static void main(String[] args) {
		int n;
		double base, altura, lado, raio;
		char tipoForma;
		
		Scanner scanner = new Scanner(System.in);
		FormaGeometrica[] formas;
		
		System.out.print("Informe Quantidade de Formas Geométricas: ");
		n = scanner.nextInt();		// entrada de quantidade de formas geométricas
		
		// instanciação de array de formas geométricas com base em quantidade fornecida
		formas = new FormaGeometrica[n];
		
		// entrada de dados de cada forma geométrica
		for (int i = 0; i < n; i++) {
			System.out.println("\nFORMA " + (i+1));
			
			System.out.print("Tipo de Forma (R/Q/C): ");
			// entrada de tipo de forma geométrica (retângulo, quadrado ou círculo)
			tipoForma = scanner.next().charAt(0);
			
			switch(tipoForma) {
				case 'r':
				case 'R':
					// entrada de comprimentos (base e altura) de retângulo
					System.out.print("Comprimento de Base..: ");
					base = scanner.nextDouble();
					System.out.print("Comprimento de Altura: ");
					altura = scanner.nextDouble();
					
					// instanciação de objeto de Retangulo com base em comprimentos fornecidos
					formas[i] = new Retangulo(base, altura);
					break;
				case 'q':
				case 'Q':
					// entrada de comprimento de lado de quadrado
					System.out.print("Comprimento de Lado..: ");
					lado = scanner.nextDouble();
					
					// instanciação de objeto de Quadrado com base em comprimento de lado fornecido
					formas[i] = new Quadrado(lado);
					break;
				case 'c':
				case 'C':
					// entrada de comprimento de raio de círculo
					System.out.print("Comprimento de Raio..: ");
					raio = scanner.nextDouble();
					
					// instanciação de objeto de Circulo com base em comprimento de raio fornecido
					formas[i] = new Circulo(raio);
					break;
			}
		}
		
		System.out.println();
		
		// listagem de tipo, área e perímetro de cada forma geométrica instanciada
		for (int i = 0; i < n; i++) {
			System.out.print("FORMA " + (i+1) + " (");
			
			// listagem de tipo de enésima forma geométrica (retângulo, quadrado ou círculo)
			if (formas[i] instanceof Retangulo)
				System.out.print("Retângulo");
			else if (formas[i] instanceof Quadrado)
				System.out.print("Quadrado");
			else
				System.out.print("Círculo");
			
			// listagem de área de enésima forma geométrica
			System.out.println(") com Área de " + formas[i].getArea());
			
			// listagem de área de enésima forma geométrica
			System.out.println(" e Perímetro de " + formas[i].getPerimento());
		}
		
		scanner.close();
	}

}