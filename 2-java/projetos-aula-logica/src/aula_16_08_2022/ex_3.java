package aula_16_08_2022;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Amplie o exercício anterior emitindo um relatório
        // com todos os números pares que você leu.

        int contador =10;


        int [] numeros = new int[contador];

        for (int i = 0;i<contador;i++){
            System.out.println("Informe um numero:");
            numeros[i] = teclado.nextInt();

        }
        System.out.println(" ");
        for (int i = 0;i<contador;i++){
            System.out.println("Numero armazenado na posiçao "+i+":");
            System.out.println(numeros[i]);
        }
        System.out.println(" ");

                System.out.println("Esses são os numeros pares:");
        for (int i =0;i<contador;i++){
            if (numeros[i]%2==0){
                System.out.println(numeros[i]);
            }

        }


    }
}
