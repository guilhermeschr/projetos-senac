package aula_26_07_2022;

import java.util.Scanner;

public class atividade_um {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a,b,c = 0;
        int soma = 0;

        //Faça um algoritmo que leia os valores A, B, C e //
        // imprima na tela se a soma de A + B é menor que C.

        System.out.println("Informe valor a:");
        a = teclado.nextInt();
        System.out.println("Informe valor b:");
        b = teclado.nextInt();
        System.out.println("Informe valor c:");
        c = teclado.nextInt();

        soma = a+b;

        if(soma < c){
            System.out.println("A soma de A + B é menor que C.");
        } else {
            System.out.println("A soma de A + B não é menor que C.");
        }
    }
}
