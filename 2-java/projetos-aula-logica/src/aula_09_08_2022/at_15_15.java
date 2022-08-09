package aula_09_08_2022;

import java.util.Scanner;

public class at_15_15 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia uma sequência de
        // números do usuário e realize a soma desses números.

        //Encerre a execução quando um número negativo for digitado.

        Scanner teclado= new Scanner(System.in);

        int numero=0;
        int soma=0;

        for (int i = 0;i<10000000;i++){
            System.out.println("Informe o numero:");
            numero = teclado.nextInt();

            soma=soma+numero;

            if (numero<0){
                break;
            }
        }
        System.out.println("Total da soma dos numeros:");
        System.out.println(soma);

    }
}
