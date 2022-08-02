package aula_28_07_2022;

import java.util.Scanner;

public class atividade3tres {
    public static void main(String[] args) {

        //Faca um algoritmo que leia o menor numero de tres digitados.
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

        System.out.println("Esse é o menor número:");
        System.out.println(c);
    }
}


