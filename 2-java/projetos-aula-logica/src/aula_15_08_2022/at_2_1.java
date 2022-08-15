package aula_15_08_2022;

import java.util.Scanner;

public class at_2_1 {
    public static void main(String[] args) {
        //desenvolva um programa que leia 10 idades,
        // armazene num vetor (int) e depois percorra
        // esse vetor calculando a media das idades.

        Scanner teclado=new Scanner(System.in);
        int contador =10;
        int media=0;

        int idades[]=new int[contador];


        for (int i = 0;i<contador;i++){
            System.out.println("Informe valor para posiçao "+i+":");
            idades[i]=teclado.nextInt();
        }

        for (int i = 0; i<contador;i++){
            media =media + idades[i];
        }
        System.out.println(" ");
        media=media/contador;
        System.out.println("Media de todos os valores:");
        System.out.println(media);

    }
}
