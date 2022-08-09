package aula_09_08_2022;

import java.util.Scanner;

public class at_3_3 {
    public static void main(String[] args) {
        //Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
        Scanner teclado= new Scanner(System.in);
        String nome = " " ;
        System.out.println("Informe seu nome:");
        nome = teclado.next();

        for (int i =0;i<10;i++){
            System.out.println(nome);
        }

    }
}
