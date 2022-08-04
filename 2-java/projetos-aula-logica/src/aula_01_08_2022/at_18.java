package aula_01_08_2022;

import java.util.Scanner;

public class at_18 {
    public static void main(String[] args) {

        //Faça um algoritmo que receba do usuario o raio em cm e calcule o volume de uma esfera.
        //Formula:
        //VOLUME = 4 * PI * R ao cubo.

        Scanner teclado=new Scanner(System.in);

        float raio,volume;

        System.out.println("Calculadora de area da superficie de uma esfera:\n");
        System.out.println("Informe o valor do raio em cm:");
        raio= teclado.nextFloat();

        volume=4*3.14f*raio*raio*raio;

        System.out.println(volume+"cm²");
    }
}
