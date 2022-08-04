package aula_01_08_2022;

import java.util.Scanner;

public class at_17 {
    public static void main(String[] args) {
        //Suponha que voce foi ao supermercado e comprou:
        // n Kg de café á x reais; k litros de leite á y reais;
        // m Kg de farinha a z reais; Faça um algoritmo que imprima
        // o ticket de compra. Primeiro produto: R$ 0,00 Segundo // : R$ 0.00

        Scanner teclado=new Scanner(System.in);

        int kgcafe,litrosleite,kgfarinha;

        int precafe,preleite,prefarinha;
        int totalprecafe,totalpreleite,totalprefarinha;
        int total;

        System.out.println("Informe quantidade de café e o preço por Kg:");
        kgcafe = teclado.nextInt();
        precafe=teclado.nextInt();

        System.out.println("Informe quantidade de leite e o preço por litro:");
        litrosleite= teclado.nextInt();
        preleite=teclado.nextInt();

        System.out.println("Informe quantidade de farinha e o preço por Kg:");
        kgfarinha=teclado.nextInt();
        prefarinha=teclado.nextInt();

        totalprecafe=kgcafe*precafe;
        totalpreleite=litrosleite*preleite;
        totalprefarinha=kgfarinha*prefarinha;

        System.out.println("Café: "+ totalprecafe);
        System.out.println("Leite: "+ totalpreleite);
        System.out.println("Farinha: "+ totalprefarinha);

        total=totalprecafe+totalprefarinha+totalpreleite;
        System.out.println("Valor total da compra: "+total);

    }
}
