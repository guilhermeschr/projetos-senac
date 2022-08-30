package aula_29_08_2002;

import java.util.Scanner;

public class exer_2 {
    // Escreva uma classe em Java que represente o nome completo de uma pessoa, composto de
    //    //três strings (nome próprio, nome do meio e nome da família). Escreva nessa classe o método
    //    //rubrica que retorna somente as iniciais do nome completo em caracteres minúsculos, e
    //    //o método assinatura que retorna as iniciais dos nomes próprio e do meio (com pontos)
    //    //e o nome de família completo. Por exemplo, se o nome da pessoa representado por essa
    //    //classe for “Richard Langton Gregory”, o método rubrica deve retornar ”rlg” e o
    //    //método assinatura deve retornar ”R.L.Gregory”. Para facilitar, considere armazenar
    //    //os três nomes em strings separadas.

    public static String main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro nome:");
        String nome1 = teclado.next();
        System.out.println("Informe o segundo nome:");
        String nome2 = teclado.next();
        System.out.println("Informe o sobre nome:");
        String nome3 = teclado.next();


       // System.out.println("Iniciais do nome completo:\n"+ruplicatoda);


        //public static String ruplica(String nome1;String nome2;String nome3){
        char ruplica1 = nome1.charAt(0);
        char ruplica2 = nome2.charAt(0);
        char ruplica3 = nome3.charAt(0);

        System.out.println(ruplica1);
        System.out.println(ruplica2);
        System.out.println(ruplica3);

        System.out.println(ruplica1 + "" + ruplica2 + ruplica3);
        String ruplicatoda = ruplica1 + "" + ruplica2 + ruplica3;
        return ruplicatoda;

        //}

        //public static String assinatura (String nome1;
       // String nome2;
        //String nome3){

        }


    }




