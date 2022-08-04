package aula_01_08_2022;

import java.util.Scanner;

public class at_7 {
    public static void main(String[] args) {
        //Faça um algoritmo para verificar se um valor e PAR ou IMPAR;

        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        // 3) Faça um algoritmo para receber um número
        // qualquer e informar na tela se é par ou ímpar.

        System.out.println("Informe o numero:");
        numero = teclado.nextInt();

        // com funcao do java %

        // % é o mod no JAVA, pega o resto da divisao
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
