package aula_26_07_2022;

import java.util.Scanner;

public class atividade_dois {
        // Faça um algoritmo que leia o nome, o sexo("F" ou "M") e
        // o estado civil de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”,
        // solicitar o tempo de casada (anos).
        public static void main(String[] args) {
            // Com char usar o igual para comparar a igualdade
            Scanner teclado=new Scanner(System.in);
             char sexo;
             String estadocivil;
             int tempodecasada;
             String nome;

            System.out.println("Informe seu nome:");
            nome = teclado.next();

            System.out.println("Informe seu sexo M ou F:");
            sexo = teclado.next().charAt(0);

            System.out.println("Informe seu estado civil:");
            estadocivil = teclado.next();

            if ((sexo == 'F') && (estadocivil.equals("casada"))){
                System.out.println("Informe o tempo de casada:");
                tempodecasada = teclado.nextInt();
            }
        }
}
