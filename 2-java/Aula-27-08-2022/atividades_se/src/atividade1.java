import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a,b,c = 0;
        int soma = 0;

        System.out.println("Informe valor a:");
        a = teclado.nextInt();
        System.out.println("Informe valor b:");
        b = teclado.nextInt();
        System.out.println("Informe valor c:");
        b = teclado.nextInt();

        if(soma < c){
            System.out.println("A soma de A + B é menor que C.");
        } else {
            System.out.println("A soma de A + B não é menor que C.");
        }
    }
}
