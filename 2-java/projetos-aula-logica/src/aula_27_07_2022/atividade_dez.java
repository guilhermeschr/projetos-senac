package aula_26_07_2022;

import java.util.Scanner;

public class atividade_dez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Tendo como dados de entrada a altura e o sexo de uma pessoa, construa
        // um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
        //
        //    ● para homens: (72.7 * h) – 58;
        //    ● para mulheres: (62.1 * h) – 44.7.

        double altura, pesoideal,peso;
        char sexo;

        System.out.println("Calculadora de peso ideal:");
        System.out.println("");
        System.out.println("Informe sua altura:");
        altura = teclado.nextDouble();
        System.out.println("Informe seu sexo M ou F:");
        sexo = teclado.next().charAt(0);
        System.out.println("Informe seu peso:");
        peso = teclado.nextDouble();


        if (sexo == 'M') ;
        {
            pesoideal = 72.7 * altura - 58;
        }
        if (sexo == 'F') {
            pesoideal = 62.1 * altura - 44.7;
        }

        System.out.println("Seu peso ideal: " + pesoideal + " Kg.");

        if (peso>pesoideal){
            System.out.println("Você está com peso maior que o ideal!" );
        }else{
            System.out.println("Você está com peso menor que o ideal!" );

        }

    }
}