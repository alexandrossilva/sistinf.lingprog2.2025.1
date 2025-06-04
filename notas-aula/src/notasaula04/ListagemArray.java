package notasaula04;

public class ListagemArray {
    
    // listagem de elementos de array de inteiros
    public static void listarArray(int[] array) {        
        for (int i = 0; i < array.length; i++) {
            // listagem de enésimo inteiro do array
            System.out.print(array[i]);

            // listagem de caractere separador (vírgula) se não for último inteiro
            if (i < array.length - 1)
                System.out.print(", ");
        }

        // listagem de caractere de quebra de linha
        System.out.println();
    }

    // listagem de elementos de array de inteiros
    public static void listarArray(double [] array) {        
        for (int i = 0; i < array.length; i++) {
            // listagem de enésimo inteiro do array
            System.out.print(array[i]);

            // listagem de caractere separador (vírgula) se não for último inteiro
            if (i < array.length - 1)
                System.out.print(", ");
        }

        // listagem de caractere de quebra de linha
        System.out.println();
    }

    // listagem de elementos de array de inteiros
    public static void listarArray(char[] array) {        
        for (int i = 0; i < array.length; i++) {
            // listagem de enésimo inteiro do array
            System.out.print(array[i]);

            // listagem de caractere separador (vírgula) se não for último inteiro
            if (i < array.length - 1)
                System.out.print(", ");
        }

        // listagem de caractere de quebra de linha
        System.out.println();
    }

}
