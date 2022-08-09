package aula_09_08_2022;

import java.util.Scanner;

public class at_11_11 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 20 números do
        // usuário e exiba quantos números são maiores do que 8
        Scanner teclado=new Scanner(System.in);

        int numero=0;
        int maiorque8=0;

        for (int i=0;i<20;i++){
            System.out.println("Informe o numero:");
            numero= teclado.nextInt();

            if (numero>8){
                maiorque8++;
            }
        }

        System.out.println("Foram digitados "+maiorque8+" numeros maiores que 8!!");
    }
}
