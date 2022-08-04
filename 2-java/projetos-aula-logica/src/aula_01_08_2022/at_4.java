package aula_01_08_2022;

import java.util.Scanner;

public class at_4 {
    public static void main(String[] args) {
        //Faça um algoritmo para verificar se um aluno esta APROVADO
        // ou REPROVADO, lendo 3 notas e calculando sua media que deve ser maior ou igual a 7.

        Scanner teclado = new Scanner(System.in);
        Double a,b,c,media;

        System.out.println("Informe as três notas:");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        media=(a+b+c)/3;

        System.out.println("Média do aluno: "+ media);

        if (media>=7){
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Aluno reprovado!");
        }
    }
}
