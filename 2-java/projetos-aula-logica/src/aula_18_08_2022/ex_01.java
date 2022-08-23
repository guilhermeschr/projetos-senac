package aula_18_08_2022;

import java.util.Arrays;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Faca uma matriz A de ordem 9x3 que:
        //leia nome, idade e sexo de nove pessoas.
        //Imprima os valores da matriz gerada.

        String nome, sexo;
        int idade;

        String dados[][] = new String[3][3];
        for (int l = 0; l < dados.length; l++) {
            for (int c = 0; c < dados[l].length; c++) {
                switch (c) {
                    case 0:
                        System.out.println("Nome: ");
                        nome = teclado.next();
                        dados[l][c] = nome;
                        break;
                    case 1:
                        System.out.println("Idade: ");
                        idade = teclado.nextInt();
                        dados[l][c] = Integer.toString(idade);
                        break;
                    case 2:
                        System.out.println("Sexo: ");
                        sexo = teclado.next();
                        dados[l][c] = sexo;
                        break;
                }
            }
        }

        for (int l = 0; l < dados.length; l++) {
            System.out.println(Arrays.toString(dados[l]));
        }
    }
}

               // System.out.println("Elemento da linha("+linhas+") e coluna("+colunas+"): "+nome[linhas][colunas]);
                   //     System.out.println("Elemento da linha("+linhas+") e coluna("+colunas+"): "+sexo[linhas][colunas]);
                   //     System.out.println("Elemento da linha("+linhas+") e coluna("+colunas+"): "+idade[linhas][colunas]);