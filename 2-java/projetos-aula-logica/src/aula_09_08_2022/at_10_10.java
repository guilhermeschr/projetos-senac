package aula_09_08_2022;

import java.util.Scanner;

public class at_10_10 {
    public static void main(String[] args) {
        //Crie um algoritmo leia um número do usuário
        // e exiba a sua tabuada de multiplicação.

        Scanner teclado = new Scanner(System.in);
        int numero=0;
        int tabuada=0;
        System.out.println("Informe um numero:");
        numero= teclado.nextInt();


        for (int i = 1;i<=10;i++){
            tabuada=numero*i;
            System.out.println(tabuada);
        }
    }
}
