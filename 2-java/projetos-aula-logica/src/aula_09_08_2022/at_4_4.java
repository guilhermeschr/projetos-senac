package aula_09_08_2022;

import java.util.Scanner;

public class at_4_4 {
    public static void main(String[] args) {

        //Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes.

        Scanner teclado = new Scanner(System.in);

        int numero=0;
        String nome = " ";

        System.out.println("Informe o nome do usuario:");
        nome = teclado.next();

        System.out.println("Informe a quantidade de vezes repetira:");
        numero = teclado.nextInt();

        for (int i = 0;i<numero;i++){
            System.out.println(nome);
        }
    }
}
