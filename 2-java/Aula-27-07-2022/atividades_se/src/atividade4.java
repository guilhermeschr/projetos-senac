import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int a,b,c;

        // 4) Faça um algoritmo que leia dois valores inteiros A e B,
        // e se os valores forem iguais deverá se somar os dois,
        // caso contrário multiplique A por B.
        // Ao final de qualquer um dos cálculos deve-se atribuir
        // o resultado para uma variável C e mostrar seu conteúdo na tela.

        System.out.println("Informe um valor para A:");
        a = teclado.nextInt();

        System.out.println("Informe um valor para B:");
        b = teclado.nextInt();



        if (a==b){
            c=a+b;
        }else{
            c=a*b;
        }
        System.out.println("O valor de C é:" + c);
    }
}
