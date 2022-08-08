package aula_08_08_2022;

import java.util.Scanner;

public class atividade_4_quatro {
    public static void main(String[] args) {
        //Dada uma serie de 5 valores, faca um algoritmo que calcule e escreva a media destes.
        //Entretanto, se a media obtida for maior que 8, devera ser atribuido 10 para a media.

        Scanner teclado=new Scanner(System.in);
        int notas=0;

        int media=0;
        int mediaa=0;

        for (int i = 0;i<5;i++){
            System.out.println("Informe um numero para media:");
            notas = teclado.nextInt();

            media=media+notas;

        }
        mediaa=media/5;

        if (mediaa>8){
            System.out.println("Media dos numeros é: 10");
        }else{
            System.out.println("Media dos numeros é:"+mediaa);
        }


    }
}
