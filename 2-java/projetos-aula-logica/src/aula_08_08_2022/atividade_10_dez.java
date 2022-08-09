package aula_08_08_2022;

import java.util.Scanner;

public class atividade_10_dez {
    public static void main(String[] args) {
        //Escreva um algoritmo que mostre o menor e o maior
        //dos números digitados pelo usuário.
        //Termine a leitura se o usuário digitar zero.
        Scanner teclado= new Scanner(System.in);
        int contador=0;
        int contolador=1;
        int numeros=0;
        int numeromaior=0;
        int numeromenor=0;
        int n=0;

        while (contador<contolador){
            System.out.println("Informe o valor do numero:");
            numeros = teclado.nextInt();

            if (numeros>numeromaior){
               numeromaior =numeros;
            }else if (numeros<numeromenor){
                numeromenor=numeros;
            }

            if (numeros==0){
                break;
            }
        }
        System.out.println("Numero maior:");
        System.out.println(numeromaior);
        System.out.println("Numero menor:");
        System.out.println(numeromenor);
    }
}
