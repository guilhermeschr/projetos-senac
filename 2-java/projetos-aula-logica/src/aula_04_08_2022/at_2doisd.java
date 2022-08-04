package aula_04_08_2022;

import java.util.Scanner;

public class at_2doisd {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        int a;
        int cont=0;

        System.out.println("Informe um valor:");
        a= teclado.nextInt();

        while (a>=cont) {
            System.out.println(cont);
            cont++;
        }
    }
}
