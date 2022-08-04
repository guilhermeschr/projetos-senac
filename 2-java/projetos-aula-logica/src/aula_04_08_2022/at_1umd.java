package aula_04_08_2022;

import java.util.Scanner;

public class at_1umd {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int a;
        int cont=0;

        System.out.println("Informe um valor:");
        a= teclado.nextInt();
        while (cont<=a){
            System.out.println(cont);
            cont++;
        }
    }
}
