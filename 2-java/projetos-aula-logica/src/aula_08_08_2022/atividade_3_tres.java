package aula_08_08_2022;

import java.util.Scanner;

public class atividade_3_tres {
    public static void main(String[] args) {
        //Dada uma relacao de 5 nomes de carros, imprima quantos sao da cor azul.
        //Sendo que para cada carro tem-se uma ficha contendo a cor e o nome.

        Scanner teclado = new Scanner(System.in);

        String nomedocarros=" ";

        String cordocarro=" ";
        int totaldacorazul=0;

        for (int i=0;i<=5;i++){

            System.out.println("Infome o modelo do carro:");
            nomedocarros = teclado.next();
            System.out.println("Informe a cor do carro:");
            cordocarro = teclado.next();
            System.out.println(" ");


            if (cordocarro.equals("azul")){
                totaldacorazul++;
            }

        }
        System.out.println(" ");
        System.out.println("O total de carros azul:");
        System.out.println(totaldacorazul);

    }
}
