package aula_08_08_2022;

import java.util.Scanner;

public class atividade_7_sete {
    public static void main(String[] args) {
        
        //Crie um algoritmo que leia um número e calcule
        //seu fatorial.Ex: 5! = 5 * 4 * 3 * 2 * 1.

        Scanner teclado = new Scanner(System.in);
        int numero =0;

        System.out.println("Informe um numero:");
        numero = teclado.nextInt();
        int numero1 = 0;
        int n = numero;
        int nu=numero;
        
        for (int i = n;n>=0;n--){
            numero=numero*i;
        }

        System.out.println(numero1);
    }
}
