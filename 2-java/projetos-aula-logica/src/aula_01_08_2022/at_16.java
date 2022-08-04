package aula_01_08_2022;

import java.util.Scanner;

public class at_16 {
    public static void main(String[] args) {

        //Fornecido os coeficientes de uma equação do 2 grau,
        // (a,b,c - ler do teclado) * faça um algoritmo que calcule
        // as raizes se houverem * Validar se o numero e negativo, pois
        // não existe raiz de numero negativo!

        Scanner teclado = new Scanner(System.in);

        int a,b,c;
        double raizum,raizdois,raiztres;

        System.out.println("Calculadora de raiz quadrada:\n");
        System.out.println("Informe um valor para A:");
        a= teclado.nextInt();
        System.out.println("Informe um valor para B:");
        b= teclado.nextInt();
        System.out.println("Informe um valor para C:");
        c= teclado.nextInt();

        if (a>0){
        raizum= Math.sqrt(a);
            System.out.println("Raiz quadrada de A:");
            System.out.println(raizum+"\n");
        }else{
            System.out.println("Raiz quadrada de A:");
            System.out.println("Não tem raiz quadrada!\n");
        }
        if (b>0){
            raizdois= Math.sqrt(b);
            System.out.println("Raiz quadrada de B:");
            System.out.println(raizdois+"\n");
        }else{
            System.out.println("Raiz quadrada de B:");
            System.out.println("Não tem raiz quadrada!\n");
        }
        if (c>0){
            raiztres= Math.sqrt(c);
            System.out.println("Raiz quadrada de C:");
            System.out.println(raiztres+"\n");
        }else{
            System.out.println("Raiz quadrada de C:");
            System.out.println("Não tem raiz quadrada!\n");
        }

    }
}
