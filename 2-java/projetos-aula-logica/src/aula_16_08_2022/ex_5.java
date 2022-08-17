package aula_16_08_2022;

import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        //Faça um algoritmo que determine qual
        // o maior valor existente no vetor do Exercício 02.

        Scanner teclado = new Scanner(System.in);
        int contador =10;

        int [] numeros = new int[contador];
        int numeromaior=0;

        for (int i = 0;i<contador;i++){
            System.out.println("Informe um numero:");
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0;i<contador;i++){
            System.out.println("Numero armazenado na posiçao "+i+":");
            System.out.println(numeros[i]);
        }

        for (int i = 0;i<contador;i++){
            if (numeros[i]>numeromaior){
                numeromaior=numeros[i];
            }
        }
        System.out.println("O maior numero é:");
        System.out.println(numeromaior);


    }
}
