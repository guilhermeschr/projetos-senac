package aula_01_08_2022;

import java.util.Scanner;

public class at_6 {
    public static void main(String[] args) {

        //Faça um algoritmo para verificar se uma pessoa ja atingiu a maioridade.
        // algoritmo deve receber como entrada apenas o ano de nascimento e considerar
        // o ano atual para calculo e 18 anos para maioridade.

        Scanner teclado = new Scanner(System.in);

        int idade;
        int anonas;

        System.out.println("Informe o ano do seu nascimento:");
        anonas = teclado.nextInt();

        if (anonas<= 2004){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você é menor de idade!");
        }

    }
}
