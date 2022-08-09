package aula_09_08_2022;

import java.util.Scanner;

public class at_12_12 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 20 números
        // do usuário e exiba quantos números são pares
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        int pares_numero=0;

        for (int i = 0;i<20;i++){
            System.out.println("Informe o numero:");
            numero = teclado.nextInt();

            if (numero%2==0){
                pares_numero++;
            }
        }
        System.out.println("Total de numeros pares é:");
        System.out.println(pares_numero);

    }
}
