package aula_15_08_2022;

import java.util.Scanner;

public class at_1_1 {
    public static void main(String[] args) {
        //desenvolva um programa que leia 10 nomes,
        // armazene num vetor (de String) e depois
        // percorra esse vetor escrevendo os nomespresentes nele.

        Scanner teclado = new Scanner(System.in);
        int contadorfinal=10;
        String [] nomes = new String[contadorfinal];

        for (int i =0;i<nomes.length;i++){
            System.out.println("Informe o nome da posiçao "+i+":");
            nomes[i]= teclado.next();
        }

        System.out.println("Nomes escritos:");
        for (int i = 0; i < nomes.length;i++){
            System.out.println(nomes[i]);
        }


    }
}
