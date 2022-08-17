package aula_16_08_2022;

import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {

        //Faça um algoritmo que leia um nome e o guarde na memória.
        //Após a leitura, verifique se a palavra é um palíndromo.
        //Um palíndromo é aquela palavra que a sua leitura
        //é a mesma da esquerda para a direita e vice versa. Exemplo: ARARA, ANA, etc.
        //(usar função strlen() do JAVA).
        // (A função strlen retorna o número de caracteres inseridos numa variável.

        Scanner teclado = new Scanner(System.in);

        String nomes;
        int tamanho =0;
        String nomesinvertidos = " ";

            System.out.println("Informe um nome:");
            nomes =teclado.next();


            tamanho=nomes.length();

            //for(int i=tamanho-1;i>=0;i--){
           //      nomesinvertidos += .charAt(i);
            //}

         if(nomes.equals(nomesinvertidos)) {
             System.out.println(null,nomes + " É uma palavra palindroma");
         } else {
             System.out.println(nomes + " Não é uma palavra palindroma");
         }

    }
}
