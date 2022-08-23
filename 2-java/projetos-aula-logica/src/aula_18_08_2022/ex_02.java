package aula_18_08_2022;

public class ex_02 {
    public static void main(String[] args) {
        //Dadas duas matrizes A e B de ordem 3 X 3.
        //Matriz A =
        //[
        //  [2, 59, 617],
        //  [8, 5, 95],
        //  [1, 59, 67]
        //]
        //Matriz B =
        //[
        //  [22, 559, 678],
        //  [13, 59 , 7],
        //  [27, 159, 627]
        //]
        //Faca um algoritmo que some as duas e gere a matriz C que é a Soma dos respectivos elementos de A e B.
        //Imprima os valores das tres matrizes.

        int[][] matrizA={
                {2, 59, 617},
                {8, 5, 95},
                {1, 59, 67},
        };
        int [][] matrizB={
                {22, 559, 678},
                {13, 59 , 7},
                {27, 159, 627},
        };
        int [][] matrizc=new int[3][3];


        for (int linha=0;linha<matrizA.length;linha++){

            for (int coluna=0;coluna<matrizA.length;coluna++){
                matrizc[linha][coluna]=matrizA[linha][coluna]+matrizB[linha][coluna];
            }
        }
        System.out.println(" ");

        System.out.println("Matriz A:");
        for (int linha=0;linha<matrizA.length;linha++){

            for (int coluna=0;coluna<matrizA.length;coluna++) {

                System.out.println("O numero da linha("+linha+") e coluna("+coluna+") da matriz A é: "+matrizA[linha][coluna]);

            }
        }

        System.out.println(" ");

        System.out.println("Matriz B:");
        for (int linha=0;linha<matrizA.length;linha++){

            for (int coluna=0;coluna<matrizA.length;coluna++) {

                System.out.println("O numero da linha("+linha+") e coluna("+coluna+") da matriz B é: "+matrizB[linha][coluna]);

            }
        }
        System.out.println(" ");

        System.out.println("Soma da matriz A com matriz B:");
        System.out.println("Matriz C:");
        for (int linha=0;linha<matrizA.length;linha++){
            for (int coluna=0;coluna<matrizA.length;coluna++) {

                System.out.println("O numero da linha("+linha+") e coluna("+coluna+") da matriz C é: "+matrizc[linha][coluna]);

            }
        }

    }
}
