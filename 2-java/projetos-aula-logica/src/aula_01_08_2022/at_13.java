package aula_01_08_2022;

import java.util.Scanner;

public class at_13 {
    public static void main(String[] args) {
        //Faça um algoritmo para ler uma temperatura em graus Celsius,
        // e transforme * para graus Farenheidt e Kelvin. * OBS: * C = 5 (F - 32)/9; * K = C + 273;

        Scanner teclado = new Scanner(System.in);

        float celsios;
        float farenheidt;
        float kelvin;

        System.out.println("Calculadora de graus Celsios para Farenheidt e Kelvin:\n");


        System.out.println("Informe uma temperatura em Celsios:");
        celsios= teclado.nextFloat();

        farenheidt= celsios  * 1.8f + 32;
        kelvin=celsios+273;

        System.out.println("Em Farenheidt:");
        System.out.println(farenheidt);
        System.out.println("Em Kelvin:");
        System.out.println(kelvin);
    }
}
