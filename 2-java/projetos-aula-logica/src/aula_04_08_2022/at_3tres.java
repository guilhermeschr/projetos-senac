package aula_04_08_2022;

import java.util.Scanner;

public class at_3tres {
    public static void main(String[] args) {

        //Crie um algoritmo que recebe 2 números e multiplica o num1
        // pelo num2 atravez de somas repetidas.(esx.:2 e 3 = 2+2+2).

        int a,b;
        int d;
        int soma=0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe valor para A:");
        a= teclado.nextInt();
        System.out.println("Informe valor para B:");
        b= teclado.nextInt();


        for (int i =1;i<=b;i++){
            soma=soma+a;
            System.out.println(soma);
        }

        System.out.println("O valor das somas repetidas é: " + soma);
    }
}
