package aula_01_08_2022;

import java.util.Scanner;

public class at_15 {
    public static void main(String[] args) {
        //Calcule o salario do mes de um funcionario.
        // * O funcionario ganha 3000, mais 500 reais por
        // carro vendido, * mais 5% do valor total de cada
        // carro vendido. * Quanto o funcionario ganha ao fim do mes?

        Scanner teclado = new Scanner(System.in);
        int quantidade_de_carros;
        int valor_carro;
        float salario;
        int valor_todal_carro;

        System.out.println("Calculadora de salario:\n");
        System.out.println("Quantidade de carros vendidos:");
        quantidade_de_carros= teclado.nextInt();
        System.out.println("Valor do carro:");
        valor_carro= teclado.nextInt();

        valor_todal_carro=quantidade_de_carros*valor_carro;


        salario = 3000f+(500f*quantidade_de_carros)+(valor_todal_carro*0.05f);

        System.out.println("O funcionario recebe de salario:");

        System.out.println(salario);

    }
}
