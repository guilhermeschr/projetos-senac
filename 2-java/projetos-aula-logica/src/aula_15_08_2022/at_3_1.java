package aula_15_08_2022;

import java.util.Scanner;

public class at_3_1 {
    public static void main(String[] args) {
        //desenvolva um programa que leia 10 salarios,
        // armazane num vetor (double) e depois percorra
        // esse vetor identificado qual o índice do maior salário.

        Scanner teclado = new Scanner(System.in);
        int contador = 10;
        double salario[] = new double[contador];
        double salariomaior = 0;

        for (int i = 0; i<contador;i++){
            System.out.println("Informe o salario da posiçao "+i+":");
            salario[i]= teclado.nextInt();

            if (salario[i]>salariomaior){
                salariomaior=salario[i];
            }
        }

        System.out.println("O maior salario é:");
        System.out.println(salariomaior);

    }

}

