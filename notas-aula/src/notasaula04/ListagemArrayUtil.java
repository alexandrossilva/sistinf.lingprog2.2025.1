package package notasaula04;

public class ListagemArrayUtil {
    
    public static void main(String[] args) {
        // instanciação de array de inteiros e, após isso, listagem dos mesmos
        int[] arrayInt = new int[] {7, 2, 9, 1, 4};
        ListagemArray.listarArray(arrayInt);

        // instanciação de array de inteiros e, após isso, listagem dos mesmos
        double[] arrayDouble = new double[] {7.2, 2.1, 9.8, 1.6, 4.4};
        ListagemArray.listarArray(arrayDouble);

        // instanciação de array de caracteres e, após isso, listagem dos mesmos
        char[] arrayChar = new char[] {'L', 'P', 'I', 'I'};
        ListagemArray.listarArray(arrayChar);
    }

}
