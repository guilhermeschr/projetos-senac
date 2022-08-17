package aula_16_08_2022;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Faça um algoritmo que leia Nome idade e sexo de N pessoas.
        // Após a leitura faça:

        //a. Imprima o Nome, idade e sexo das pessoas cuja idade seja
        // maior que a idade da primeira pessoa.

        //b. Imprima o Nome e idade de todas as mulheres.
        //c. Imprima o Nome dos homens menores de 21 anos.

        int contador = 0;

        System.out.println("Informe de quantas pessoas serão lidos os dados:");
        contador = teclado.nextInt();

        String nome []= new String[contador];
        int idade [] = new int[contador];
        String sexo [] = new String[contador];


        for (int i =0;i< nome.length;i++){
            System.out.println("Informe os dados da pessoa da posiçao "+i+":\n");
            System.out.println("Informe o nome:");
            nome[i]= teclado.next();
            System.out.println("Informe a idade:");
            idade[i] = teclado.nextInt();
            System.out.println("Informe o sexo M ou F:");
            sexo[i]= teclado.next();
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Maior que primeira idade:");

        for (int i =0;i< nome.length;i++) {
            if (idade[i] > idade[0]) {
                System.out.println("Nome: "+nome[i]);
                System.out.println("Sexo: "+sexo[i]);
                System.out.println("Idade: "+idade[i]);
            }

        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Mulheres:");
        for (int i =0;i< nome.length;i++){
            if (sexo[i].equals("f")){
                System.out.println("Nome: "+nome[i]);
                System.out.println("Idade: "+idade[i]);
                System.out.println(" ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Nomes dos homens menores de 21 anos:");

        for (int i =0;i< nome.length;i++){
            if ((sexo[i].equals("m"))&&(idade[i]<21)){
                System.out.println(nome[i]);
                System.out.println(" ");
            }
        }
    }
}
