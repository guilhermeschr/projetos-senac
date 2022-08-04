package aula_01_08_2022;

import java.util.Scanner;

public class at_12 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia dois numeros inteiros (n1 e n2) * calcule a divisão de n1/n2,
        // e informe o resto desta divisão. * Não pode ser usado funções pre-programadas(mod em VisualG e % em JAVA).

        Scanner telhado = new Scanner(System.in);

        int a,b;
        int divisao;
        int resto;

        System.out.println("Informe dois valores:");
        a= telhado.nextInt();
        b= telhado.nextInt();

        divisao=a/b;
        resto=a%b;

        System.out.println("Resto da divisão:");
        System.out.println(resto);

    }
}
