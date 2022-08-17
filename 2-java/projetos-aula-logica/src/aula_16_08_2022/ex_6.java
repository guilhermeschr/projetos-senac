package aula_16_08_2022;

import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia 10 nomes
        // e os guarde na memória. No fim, imprima os 10 nomes armazenados.

        Scanner teclado = new Scanner(System.in);

        int contador = 10;
        String[] nomes = new String[contador];

        for (int i =0;i<contador;i++){
            System.out.println("Informe um nome:");
            nomes[i] =teclado.next();
        }

            System.out.println("Nomes armazenados:");
        for (int i = 0;i<contador;i++){
            System.out.println(nomes[i]);
        }
    }
}
