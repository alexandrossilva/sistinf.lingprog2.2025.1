package lista02.questao05.resp;

public class Data {

    private int dia;  // dia (um valor entre 1 e 31)
    private int mes;  // mês (um valor entre 1 e 12)
    private int ano;  // ano (um número positivo de 4 ou mais dígitos)
    
    public Data(int dia, int mes, int ano) throws DataIncorretaException {    	
    	// lançamento de exceção em caso de ano indicado for negativo ou possuir menos de 4 dígitos
    	if (ano < 1000)
    		throw new DataIncorretaException("Ano negativo ou com menos de 4 dígitos");
    	// lançamento de exceção em caso de argumento para o mês não estiver entre 1 e 12
    	else if (mes < 1 || mes > 12)
    		throw new DataIncorretaException("Mês inferior a 1 ou superior a 12");
    	// lançamento de exceção em caso de argumento para o dia for inválido
    	else {
        	int[] qtd = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // total de dias dos meses

        	int totalDiasMes = qtd[mes - 1];	// obtenção de quantidade de dias de mês indicado
        	
        	// atualização de total de dias se mês indicado for fevereiro e ano indicado for bissexto
        	if (mes == 2 && (ano % 400 == 0  || (ano % 4 == 0 && ano % 100 != 0)))
        		totalDiasMes++;
        	
        	// verificação de dia inferior a 1 ou superior ao total de dias do mês indicado
        	if (dia < 1 || dia > totalDiasMes)	// lançamento de exceção em caso positivo
        		throw new DataIncorretaException("Dia em mês " + mes + " inferior a 1 ou superior a " + 
        										 totalDiasMes);
    	}
    	
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	// retorno de string representativa da data encapsulada no formado DD/MM/AAAA
	public String mostrarData() {
		return (dia < 10 ? "0" : "") + dia + "/" + (mes < 10 ? "0" : "") + mes + "/" + ano;
	}
	
	// retorno de quantidade de dias restantes para o término do ano em que se situa a data
	public int getDiasTerminoAno() {
		// quantidade total de dias de cada mês do ano
		int[] qtdDias = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// alteração de quantidade total de dias do mês de fevereiro se data for de ano bissexto
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
			qtdDias[1]++;				

		if (mes == 12) {						// se mês da data for dezembro...
			// dias restantes equivalente à diferença entre 31 e dia da data acrescida de 1 (um)
			return 31 - dia + 1;
		}
		else {									// caso contrário (mês anterior a dezembro)...
			// diferença entre total de dias do mês e dia da data acrescida de 1 (um)
			int diasRestantes = qtdDias[mes-1] - dia + 1;

			// contabilização de total de dias dos meses subsequentes (até alcançar dezembro)
			for (int i = mes + 1; i <= 12; i++)
				diasRestantes += qtdDias[i-1];	// acréscimo de total de dias do enésimo mês
				
			return diasRestantes;				// retorno de total de dias restantes
		}
	}

}