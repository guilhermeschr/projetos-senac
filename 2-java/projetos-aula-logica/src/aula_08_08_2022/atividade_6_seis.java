package aula_08_08_2022;

import java.util.Scanner;

public class atividade_6_seis {
    public static void main(String[] args) {

//mplemente um algoritmo que leia um número e uma opção de listagem.
//Com base nessa opção, escreva a sequência dos números:
//em ordem crescente (de zero até o número)
//ou decrescente (do número até zero).
//Exemplo:
//Opcao=> 1 - CRESCENTE
//Opcao=> 2 - DECRESCENTE

        Scanner teclado = new Scanner(System.in);
        int opcao;
        int n = 0;

        System.out.println("Informe um numero:");
        n = teclado.nextInt();

        System.out.println("Informe a o tipo de sequencia:");
        System.out.println("1-cresente");
        System.out.println("2-decresente");
        opcao = teclado.nextInt();

        if (opcao == 1) {
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = n; n >= 0; n--) {
                System.out.println(n);
            }

        }
    }
}
