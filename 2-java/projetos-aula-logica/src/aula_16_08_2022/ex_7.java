package aula_16_08_2022;

import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        //Amplie o exercício 06 imprimindo o menor Nome do vetor
        //(usar função strlen() do JAVA)
        //(A função strlen retorna o número de caracteres inseridos
        // numa variável. Ex.: Caso o usuário digitar o nome Maria,
        // o strlen() retornará o valor 05.

        Scanner teclado = new Scanner(System.in);

        int contador = 10;
        String[] nomes = new String[contador];
        int numerodeletras;
        String menornome=" ";


        for (int i =0;i<contador;i++){
            System.out.println("Informe um nome:");
            nomes[i] =teclado.next();
        }
        int nova=0;
        System.out.println("Nomes armazenados:");
        for (int i = 0;i<contador;i++){
            System.out.println(nomes[i]);
            numerodeletras = nomes[i].length();

            if (nova==0){
                nova = numerodeletras;
                menornome = nomes[i];
            }

            if (numerodeletras<nova){
                nova = numerodeletras;
                menornome = nomes[i];
            }

        }
        System.out.println("  ");
        System.out.println("Menor nome:");
        System.out.println(menornome);

        System.out.println("Quantidade de letras:");
        System.out.println(nova);



    }
}
