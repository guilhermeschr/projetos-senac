package aula_09_08_2022;

import java.util.Scanner;

public class at_8_8 {
    public static void main(String[] args) {
        //Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

        Scanner teclado = new Scanner(System.in);
        int idade;
        int maiordeidade=0;

        for (int i = 0;i<20;i++){
            System.out.println("Informe a idade:");
            idade = teclado.nextInt();

            if(idade>=18){
                maiordeidade++;
            }
        }
        System.out.println(maiordeidade);

    }
}
