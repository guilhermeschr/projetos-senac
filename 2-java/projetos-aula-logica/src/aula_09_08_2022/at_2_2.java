package aula_09_08_2022;

public class at_2_2 {
    public static void main(String[] args) {
        //Escreva um algoritmo que calcule a soma dos números de 1 a 15.

        int soma=0;
        int controlador=15;
        int contador =0;

       for (contador=1;contador<=controlador;contador++){
           soma=soma+contador;
       }

        System.out.println("Soma dos numeros de 1 a 15 é:");
        System.out.println(soma);
    }

}

