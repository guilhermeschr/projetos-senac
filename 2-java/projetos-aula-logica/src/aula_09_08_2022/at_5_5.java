package aula_09_08_2022;

import java.util.Scanner;

public class at_5_5 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 10 números
        // do usuário e calcule a soma desses números.
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        int numero1=0;
        int n=0;
        for (int i =0;i<10;i++){
            System.out.println("Informe o numero:");
            numero = teclado.nextInt();

            numero1=numero1+numero;

        }
        System.out.println("Soma dos numeros é:");
        System.out.println(numero1);

    }
}
