import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //Faça um algoritmo que leia uma variável e some 5 caso seja
        // par ou some 8 caso seja ímpar, imprimir o resultado desta operação.

        int numero,numero2;
        String parimpar;

        System.out.println("Informe um número:");
        numero= teclado.nextInt();

        if (numero % 2 == 0) {
            parimpar =("par");
        } else {
            parimpar =("ímpar");
        }

        if (parimpar=="par"){
            numero2=numero+5;
        }else{
            numero2=numero+8;
        }
        System.out.println("Valor é:  "+ numero2);
    }
}
