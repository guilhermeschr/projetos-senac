package aula_08_08_2022;

import java.util.Scanner;

public class atividade_8_oito {
    public static void main(String[] args) {
//Escrever um algoritmo que leia um número n que indica quantos valores
//devem ser lidos a seguir. Para cada número lido, mostre os valores lidos
//e o fatorial destes valores.

        Scanner teclado = new Scanner(System.in);

        int numero=0;
        int n=0;
        int num=0;

        System.out.println("Informe quantidade de valores para serem lidos:");
        numero = teclado.nextInt();
        n=numero;

        for (int o = n;o>=1;o--) {
            System.out.println("Informe um numero para fatoracao:");
            num = teclado.nextInt();


            int fatorial = 1;
            for (int p = num; p >= 1; p--) {
                fatorial = fatorial * p;

            }
            System.out.println("Numero lido: " + num);
            System.out.println("Fatoria do numero: " + fatorial);

        }

         }
    }
