package aula_01_08_2022;

import java.util.Scanner;

public class at_11 {
    public static void main(String[] args) {
        //Determine a velocidade de um automovel que percorreu uma
        // distancia S em km, * em um intervalo de tempo T,informando em horas.

        Scanner teclado = new Scanner(System.in);

        float km;
        float tempo;
        float km_h;

        System.out.println("Calculadora de km/h");

        System.out.println("Informe a distancia:");
        km = teclado.nextFloat();
        System.out.println("Informe o tempo:");
        tempo = teclado.nextFloat();

        km_h=km/tempo;

        System.out.println("A velocidade:");
        System.out.println(km_h+ " km/h");


    }
}
