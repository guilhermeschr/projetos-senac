package aula_09_08_2022;

import java.util.Scanner;

public class at_9_9 {
    public static void main(String[] args) {

        //Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

        Scanner teclado = new Scanner(System.in);
        int idade;
        int nova = 0;
        String nome;
        String maisnova = null;

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe nome:");
            nome = teclado.nextLine();

            System.out.println("Informe idade:" + nome);
            idade = teclado.nextInt();
            teclado.nextLine();

            if (nova == 0) {
                nova = idade;
            }

            if (idade < nova) {
                nova = idade;
                maisnova = nome;
            }

        }
        System.out.println(maisnova);
        System.out.println(nova);
    }
}
