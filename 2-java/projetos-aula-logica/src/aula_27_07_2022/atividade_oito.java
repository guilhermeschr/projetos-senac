package aula_27_07_2022;

import java.util.Scanner;

public class atividade_oito {
    public static void main(String[] args) {

        // Escreva um algoritmo que leia três valores inteiros e
        // diferentes e mostre-os em ordem decrescente.

        Scanner teclado = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        //maior
        int a = 0;
        //meio
        int b = 0;
        //menor
        int c = 0;

        System.out.println("Informe três números:");
        x= teclado.nextInt();
        y= teclado.nextInt();
        z= teclado.nextInt();

        if (x>y){
            if (x>z){
                if (y>z){
                  a=x;
                    c=z;
                    b=y;

                }else{
                    a=x;
                    b=z;
                    c=y;

                }
            }
        }
        if (x<y){
            if (y>z){
                if (x>z){
                    a=y;
                    b=x;
                    c=z;

                }else{
                    a=y;
                    b=z;
                    c=x;
                }
            }
        }
        if (x<y){
            if (y<z){
                a=z;
                b=y;
                c=x;
            }
        }
        if (x>y){
            if (x<z){
                a=z;
                b=x;
                c=y;
            }
        }

        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
