package aula_08_08_2022;

import java.util.Scanner;

public class atividade_7_sete {
    public static void main(String[] args) {
        
        //Crie um algoritmo que leia um número e calcule
        //seu fatorial.Ex: 5! = 5 * 4 * 3 * 2 * 1.

        Scanner teclado = new Scanner(System.in);
        int numero =0;
        int n=1;

        System.out.println("Informe um numero:");
        numero = teclado.nextInt();
        
        for (int i = numero;i>=1;i--){
            n=n*i;
        }

        System.out.println(n);
    }
}
