package aula_04_08_2022;

import java.util.Scanner;

public class at_1um {
    public static void main(String[] args) {

        //crie um algoritmo que leia um numero e escreva a sequencia de zero atè o numero.

        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        int n;
        System.out.println("Mostra do 0 ao número:\n");
        System.out.println("Informe um número:");
        n= teclado.nextInt();


        for (int i =0; i<=n ;i++){
            System.out.println(i);
        }

    }
}
