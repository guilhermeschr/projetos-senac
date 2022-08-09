package aula_09_08_2022;

import java.util.Scanner;

public class at_9_9 {
    public static void main(String[] args) {

        //Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

        Scanner teclado = new Scanner(System.in);
        int idade = 0;
        String nome =" ";
        String maisnova = " ";

        for (int i = 0;i<10;i++){
            System.out.println("Informe nome:");
            nome = teclado.next();

            System.out.println("Informe idade:");
            idade= teclado.nextInt();


            if (idade<idade){
                nome=maisnova;
            }

            System.out.println(maisnova);
        }
    }
}
