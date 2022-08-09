package aula_09_08_2022;

import java.util.Scanner;

public class at_14_14 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia 20 números e, ao final,
        // escreva quantos estão entre 0 e 100,
        //quantos estão entre 101 e 200 e quantos são maiores de 200.

        Scanner teclado = new Scanner(System.in);

        int numero=0;
        int entre0e100=0;
        int entre101e200=0;
        int maior200=0;

        for (int i=0;i<20;i++){
            System.out.println("Informe o numero:");
            numero= teclado.nextInt();

            if ((numero<100)&&(numero>=0)){
                entre0e100++;
            }else if ((numero>=100)&&(numero<200)){
                entre101e200++;
            }else {
                maior200++;
            }
        }

        System.out.println("Total de numeros entre 0 e 100:");
        System.out.println(entre0e100);
        System.out.println("Total de numeros entre 100 e 200:");
        System.out.println(entre101e200);
        System.out.println("Total de numeros maior que 200:");
        System.out.println(maior200);
    }
}
