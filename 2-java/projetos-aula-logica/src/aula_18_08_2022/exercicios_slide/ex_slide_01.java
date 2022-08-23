package aula_18_08_2022.exercicios_slide;

import java.util.Scanner;

public class ex_slide_01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //capture do teclado valor para o preenchimento de uma
        // matriz M 3x3. Ápos a captura imprima a matriz criada
        // e emcontre a quantidades de numeros pares e a quantidade de numeros impares.

        int M[][]=new int[3][3];
        int par=0;
        int impar=0;

        for (int linhas=0;linhas< M.length;linhas++){
            for (int colunas=0;colunas< M.length;colunas++){
                System.out.println("Informe numero da linha("+linhas+") e coluna("+colunas+"):");
                M[linhas][colunas]= teclado.nextInt();

            }
        }
        for (int linhas=0;linhas< M.length;linhas++){
            for (int colunas=0;colunas< M.length;colunas++){
                System.out.println("O numero da linha("+linhas+") e coluna("+colunas+") é:");
                System.out.println(M[linhas][colunas]);
            }
        }



        for (int linhas=0;linhas< M.length;linhas++){
            for (int colunas=0;colunas< M.length;colunas++){

                if (M[linhas][colunas] % 2 == 0){
                    par++;
                }else {
                    impar++;
                }

            }
        }

        System.out.println("Total de numeros pares é: "+par+"\n");
        System.out.println("Total de numeros impares é: "+impar);




    }
}
