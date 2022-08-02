package aula_28_07_2022;

import java.util.Scanner;

public class atividade7sete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Faca um algoritmo que leia um numero e apos imprima
        // o numero lido, o seu antecessor e o seu sucessor na tela;

        //b=sucessor     c=antecessor
        int a,b,c;

        System.out.println("Informe um número:");
        a = teclado.nextInt();

        //sucessor
        b=a+1;
        //antecessor
        c=a-1;

        System.out.println("Número informado: "+ a);
        System.out.println("Número sucessor do informado: "+ b);
        System.out.println("Número antecessor do informado: "+ c);
    }
}
