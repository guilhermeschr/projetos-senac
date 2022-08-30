package aula_29_08_2002;

import java.util.Scanner;

public class exer_1 {


    //// Exercícios sobre métodos

    ////Crie uma classe chamada Calculadora. Esta classe deve possuir os seguintes métodos:
    ////public double soma(double num1, double num2); Retorna a soma dos dois números.
    ////
    ////public double subtraçao(int num1, double num2); Retorna a subtração dos dois números.
    ////
    ////public double multiplicaçao(double num1, int num2); Retorna o produto dos dois números.
    ////
    ////public double divisao(int num1, int num2); Retorna o resultado da divisão dos dois números.
    ////
    ////public double resto da divisao(int num1, short num2); Retorna o resto da divisão dos dois números.
    ////
    ////Elabore um roteiro de teste para a sua calculadora e observe os resultados.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Informe dois numeros para os calculos:");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();


        double resultadosoma = soma(num1, num2);
        double resultadosub = subtraçao(num1, num2);
        double resultadomul = multiplicaçao(num1, num2);
        double resultadodiv = divisao(num1, num2);
        double resultadorestodiv = restodiv(num1, num2);


    }

    public static double soma(double num1, double num2) {
        double so;

        so = num2 + num1;

        System.out.println("Valor da soma:" + so);

        return so;

    }

    public static double subtraçao(double num1, double num2) {
        double sub;
        sub = num1 - num2;

        System.out.println("Resultado da subtraçao é:" + sub);

        return sub;

    }

    public static double multiplicaçao(double num1, double num2) {
        double mul;
        mul = num1 * num2;

        System.out.println("Resultado da multiplicaçao é:" + mul);

        return mul;

    }

    public static double divisao(double num1, double num2) {
        double div;
        div = num1 / num2;

        System.out.println("Resultado da divisao é:" + div);

        return div;
    }
    public  static double restodiv(double num1, double num2){
        double restod;
        restod=num1%num2;

        System.out.println("Resultado do resto da divisao é:"+ restod);
        return restod;
    }

}


