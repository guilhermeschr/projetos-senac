import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        // 3) Faça um algoritmo para receber um número
        // qualquer e informar na tela se é par ou ímpar.

        System.out.println("Informe o numero:");
        numero = teclado.nextInt();

        // com funcao do java %

        // % é o mod no JAVA, pega o resto da divisao
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        // calculando o resto
        // obriga a variavel resultado a ser inteira
        // exemplo 9 / 2 => 4,5, parte inteira = 4
        int resultado = numero / 2;

        int resto = numero - (resultado * 2);

        System.out.println("Resultado:" + resultado);

        System.out.println("Resto:" + resto);

        // comparacao e 2 igual
        if (resto == 0) {
            System.out.println("Par Calculado!");
        } else {
            System.out.println("Impar calculado!");
        }
    }