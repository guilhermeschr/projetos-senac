package aula_01_08_2022;

import java.util.Scanner;

public class at_5 {
    public static void main(String[] args) {

       //Faça um algoritmo para verificar se uma pessoa ja pode tirar carteira
        // de motorista considerando a idade >= 18 anos e mostre na tela uma mensagem:
        // JA POSSO TIRAR A CARTEIRA DE MOTORISTA, se for o caso AINDA NÃO POSSO TIRAR
        // A CARTEIRA DE MOTORISTA, se for o caso

        Scanner teclado = new Scanner(System.in);
        int idade;

        System.out.println("Informe sua idade:");
        idade = teclado.nextInt();

        if (idade>=18){
            System.out.println("Já pode tirar a carteira de motorista!");
        }else {
            System.out.println("Ainda não pode tirar a carteira!");
        }


    }
}
