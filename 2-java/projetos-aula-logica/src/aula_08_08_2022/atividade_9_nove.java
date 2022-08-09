package aula_08_08_2022;

import java.util.Scanner;

public class atividade_9_nove {
    public static void main(String[] args) {
        // Crie um algoritmo que receba vários números inteiros e positivos
        // e imprima o produto dos números ímpares digitados e a soma dos pares.
        // O algoritmo encerra quando o zero ou um número negativo é digitado.
        Scanner teclado = new Scanner(System.in);

        int somapar = 0;
        int produtoimpar=1;
        int contador= 0;
        int controle = 1;
        int numerocontole;

        while (contador<controle){
            System.out.println("Informe o numero:");
            numerocontole = teclado.nextInt();

            if (numerocontole % 2==0){
                somapar=somapar+numerocontole;
            }else{
                produtoimpar = produtoimpar*numerocontole;
            }
            if ((numerocontole==0) || (numerocontole<0)){
                contador=controle;
            }
        }
        System.out.println("Soma total dos numeros pares:");
        System.out.println(somapar);
        System.out.println("Produto total dos numeros impares:");
        System.out.println(produtoimpar);

    }
}
