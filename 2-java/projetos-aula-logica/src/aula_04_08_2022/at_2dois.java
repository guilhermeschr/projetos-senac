package aula_04_08_2022;

import java.util.Scanner;

public class at_2dois {
    public static void main(String[] args) {

        //crie um algoritmo que leia um numero e
        // escreva a sequencia decrescente atè o 0.

        Scanner teclado=new Scanner(System.in);
        int cont;
        int n;

        System.out.println("Mostra de um número ao 0:\n");
        System.out.println("Informe um número:");
        n= teclado.nextInt();

        cont=n;

        for (int i =n; n>=0 ;n--){
           System.out.println(n);
        }
        System.out.println("FIM!");
    }
}
