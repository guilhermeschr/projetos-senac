package aula_16_08_2022;

import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        //Faça um algoritmo que determine qual
        // o menor valor existente no vetor do Exercício 02.

        Scanner teclado = new Scanner(System.in);
        int contador =10;
        int [] numeros = new int[contador];
        int numeromenor=0;
        int nova =0;


        for (int i = 0;i<contador;i++){

            System.out.println("Informe um numero:");
            numeros[i] = teclado.nextInt();

        }

        for (int i = 0;i<contador;i++){

            System.out.println("Numero armazenado na posiçao " + i + ":");
            System.out.println(numeros[i]);

            if (nova==0){
                nova = numeros[i];
            }

            if (numeros[i]<nova){
                numeromenor=numeros[i];
            }

        }
        System.out.println(" ");

        System.out.println("O menor numero: " +numeromenor);


    }
}
