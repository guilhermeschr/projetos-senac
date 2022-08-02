package aula_26_07_2022;

import java.util.Scanner;

public class atividade_cinco {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int a,b;
        //Encontrar o dobro de um número caso ele seja positivo e
        // o seu triplo caso seja negativo, imprimindo o resultado.

        System.out.println("Informe um valor para A:");
        a = teclado.nextInt();

        if (a>0){
            b=a*a;
        }else{
            b=a*a*a;
        }
        System.out.println("Valor do B:" + b);
    }
}
