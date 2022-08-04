package aula_01_08_2022;

import java.util.Scanner;

public class at_14 {
    public static void main(String[] args) {
        //Desenvolva um algoritmo para identificar se um
        // determinado numero inteiro, * é positivo,negativo,ou nulo.

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Demonstra se um número é possitivo ou negativo ou nulo:\n");
        System.out.println("Informe um número:");
        numero= teclado.nextInt();

        if (numero>0){
            System.out.println("Esse número é positivo!");
        } else if (numero<0) {
            System.out.println("Esse número é negativo!");
        }else{
            System.out.println("Esse número é nulo!");
        }

    }
}
