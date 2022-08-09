package aula_09_08_2022;

import java.util.Scanner;

public class at_7_7 {
    public static void main(String[] args) {
        //Leia a idade de 20 pessoas e exiba a média das idades.

        Scanner teclado = new Scanner(System.in);
        int idade = 0;
        int totalidade = 0;
        int mediaidade;

        for (int i = 0; i < 20; i++) {
            System.out.println("Informe a idade:");
            idade = teclado.nextInt();

            totalidade=totalidade+idade;
        }
        mediaidade = totalidade/20;

        System.out.println("Média das idades é:");
        System.out.println(mediaidade);

    }
}
