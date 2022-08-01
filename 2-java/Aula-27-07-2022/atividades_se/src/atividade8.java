import java.util.Scanner;
// NÃO FUNCIONA
public class atividade8 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // Escreva um algoritmo que leia três valores inteiros e
        // diferentes e mostre-os em ordem decrescente.

        int a,b,c;
        int maior,meio,menor;

        System.out.println("Informe um valor para A:");
        a= teclado.nextInt();

        System.out.println("Informe um valor para B:");
        b= teclado.nextInt();

        System.out.println("Informe um valor para C:");
        c= teclado.nextInt();

        //maior

        if ((a>b)&&(a>c)){
           //a = maior;
        }
        if ((b>a)&&(b>c)){
            //b = maior;
        }
        if ((c>a)&&(c>b)) {
             //c = maior;
        }
        //menor

        if ((a<b)&&(a<c));{
           // a= menor;
        }
        if ((b<a)&&(b<c));{
           // b= menor;
        }
        if ((c<a)&&(c<b));{
            //c= menor;
        }

        //meio

        if ((a>b)&&(a<c)){
           // a=meio;

        }
        if ((a<b)&&(a>c)){
           // a=meio;

        }
        if ((b>a)&&(b<c)){
           // b=meio;

        }
        if ((b<a)&&(b>c)){
            //b=meio;

        }
        if ((c>a)&&(c<b)){
           // c=meio;

        }
        if ((c<a)&&(c>b)){
            //c=meio;

        }


    }
}
