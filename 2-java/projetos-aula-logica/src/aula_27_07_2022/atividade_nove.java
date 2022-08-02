package aula_27_07_2022;

import java.util.Scanner;

public class atividade_nove {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Escreva um algoritmo que leia três valores inteiros e
        // diferentes e mostre-os em ordem decrescente.

        int x = 0;
        int y = 0;
        int z = 0;
        String decrescente;

        System.out.println("Informe três números:");
        x= teclado.nextInt();
        y= teclado.nextInt();
        z= teclado.nextInt();

        if (x>y){
            if (x>z){
                if (y>z){
                    System.out.println(z);
                    System.out.println(y);
                    System.out.println(x);
                }else{
                    System.out.println(y);
                    System.out.println(z);
                    System.out.println(x);
                }
            }
        }
        if (x<y){
            if (y>z){
                if (x>z){
                    System.out.println(z);
                    System.out.println(x);
                    System.out.println(y);
                }else{
                    System.out.println(x);
                    System.out.println(z);
                    System.out.println(y);
                }
            }
        }
        if (x<y){
            if (y<z){
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
        }
        if (x>y) {
            if (x < z) {
                System.out.println(y);
                System.out.println(x);
                System.out.println(z);
            }
        }
    }
}
