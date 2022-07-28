import java.util.Scanner;

public class atividade3 {
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

        }
    }