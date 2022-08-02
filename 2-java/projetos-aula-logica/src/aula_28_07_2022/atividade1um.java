package aula_28_07_2022;

import java.util.Scanner;

public class atividade1um {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Faca um algoritmo que leia o nome e as tres notas
        // de um aluno e ao final, escreva o seu nome, sua media
        // e se ele foi aprovado. Media de aprovacao igual a 8.

        Double a,b,c,media;
        String nome;

        System.out.println("Informe o nome do aluno:");
        nome = teclado.next();
        System.out.println("Informe as três notas:");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        media=(a+b+c)/3;

        System.out.println("Nome do aluno: "+ nome );
        System.out.println("Média do aluno: "+ media);

        if (media>=8){
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Aluno reprovado!");
        }

    }
}
