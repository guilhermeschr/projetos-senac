package aula_09_08_2022;

import java.util.Scanner;

public class at_13_13 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia 20 números e,
        // ao final, escreva quantos estão entre 0 e 100.

        Scanner teclado=new Scanner(System.in);

        int numero=0;
        int etre0e100=0;

        for (int i = 0;i<20;i++){
            System.out.println("Informe um numero:");
            numero= teclado.nextInt();

            if ((numero<100)&&(numero>0)){
                etre0e100++;
            }
        }

        System.out.println("Total de numeros entre 0 e 100:");
        System.out.println(etre0e100);
    }
}
