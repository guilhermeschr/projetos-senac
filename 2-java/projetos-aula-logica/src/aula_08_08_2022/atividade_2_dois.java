package aula_08_08_2022;

import java.util.Scanner;

public class atividade_2_dois {
    public static void main(String[] args) {


        //Dado o modelo(Fiat, Ford,GM, Wolskwagen,Toyota,Honda), ano fabricação, cor e placa de 5 carros.
        //Faca um algoritmo que:
        //a)Imprima quantos carros sao da cor verde e o percentual em relacao ao total.
        //b)Imprima quantos foram fabricados antes de 1990 percentual em relacao ao total;
        //c)Imprima quantos sao da Fiat e o percentual em relacao ao total;


        Scanner teclado = new Scanner(System.in);

        String modelo=" ";
        int totaldafiat=0;

        int anodefabricaçao=0;
        int totalfabricado1990=0;

        String cor=" ";
        int totalverde=0;

        String placa=" ";

        System.out.println("Tabela de carros:\n");

        for (int i=0;i<=5;i++){

            System.out.println("Informe o modelo do carro:");
            modelo = teclado.next();
            System.out.println("Informe o ano de fabricação:");
            anodefabricaçao = teclado.nextInt();
            System.out.println("Informe a cor do carro:");
            cor = teclado.next();
            System.out.println("Informe a placa do carro:");
            placa = teclado.next();
            System.out.println(" ");
            System.out.println(" ");


            if (cor.equals("verde")){
                totalverde++;
            }
            if (anodefabricaçao==1990){
                totalfabricado1990++;
            }
            if (modelo.equals("fiat")){
                totaldafiat++;
            }
        }
        System.out.println("O total de carros verdes são:");
        System.out.println(totalverde+ "\n");
        System.out.println("O total de carros fabricados em 1990:");
        System.out.println(totalfabricado1990+"\n");
        System.out.println("O total de carros da Fiat:");
        System.out.println(totaldafiat);



    }
}
