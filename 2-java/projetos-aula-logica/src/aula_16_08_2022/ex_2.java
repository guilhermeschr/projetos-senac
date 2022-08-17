package aula_16_08_2022;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia, via teclado,
        // 10 valores do tipo inteiro e os guarde na memória.
        //Após a leitura liste os numeros armazenados.
        Scanner teclado = new Scanner(System.in);
        int contador =10;

        int [] numeros = new int[contador];

        for (int i = 0;i<contador;i++){
            System.out.println("Informe um numero:");
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0;i<contador;i++){
            System.out.println("Numero armazenado na posiçao "+i+":");
            System.out.println(numeros[i]);
        }

    }
}
