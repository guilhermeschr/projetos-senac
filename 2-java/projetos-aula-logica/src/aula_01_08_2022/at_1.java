package aula_01_08_2022;

public class at_1 {
    public static void main(String[] args) {
        ////Conta telefônica - Uma conta telefônica é composta dos
        //        // seguintes custos: assinatura: R$ 17,90 impulsos: R$ 0,04
        //        // por impulso que exceder a 90 interurbanos chamadas p/ celular:
        //        // R$0,20 por impulso Monte a fórmula para calcular o valor da conta para
        //        // 254 impulsos, R$34,29 de interurbanos e 23 chamadas para celular. Elabore
        //        // um programa que mostra os custos, calcula e mostra o valor total.

        //        //conta de telefone = 17,90 + ( 0,04 * (quantidade de impulso-90) ) + ( 0,20 * chamadas de celular )


        //assinatura 17,90 + 34,29
        //impulsos 254-90 =164

        double preco_impulsos = 164 * 0.04;


        double preco_chamadas_de_celular = 23 * 0.20 ;
        double contatelefonica = 0;



        contatelefonica =  preco_impulsos + preco_chamadas_de_celular + 17.90+34.29;

        System.out.println("Valor dos interurbanos:");
        System.out.println(preco_impulsos+ " reais");

        System.out.println("Valor das chamadas para celular:");
        System.out.println(preco_chamadas_de_celular+" reais");

        System.out.println("Valor total da conta telefonica:");
        System.out.println(contatelefonica+ " reais");

    }
}
