package aula_26_07_2022;

import java.util.Scanner;
// NÃO FUNCIONA
public class atividade_onze {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        //O IMC – Indice de Massa Corporal é um critério da Organização Mundial
        // de Saúde para dar umaindicação sobre a condição de peso de uma pessoa
        // adulta. A fórmula é IMC = peso / ( altura )2 Elabore um algoritmo que
        // leia o peso e a altura de um adulto e mostre sua condição de acordo com
        // a tabela abaixo. IMC em adultos Condição Abaixo de 18,5 Abaixo do peso
        // Entre 18,5 e 25 Peso normal Entre 25 e 30 Acima do peso Acima de 30 obeso

        double peso,altura,IMC;

        System.out.println("Calculadora de IMC:");
        System.out.println();
        System.out.println("Informe seu peso:");
        peso = teclado.nextDouble();
        System.out.println("Informe sua altura:");
        altura = teclado.nextDouble();


        //peso=80
        //altura=1,7
        //IMC=23,5
        IMC= peso/(altura*2);
        System.out.println(IMC);

        if ((IMC<=18.5));{
            System.out.println("Está abaixo do peso!");
        }
        if ((IMC>18.5)&&(IMC<=25)){
            System.out.println("Está normal o peso!");
        }
        if ((IMC>25)&&(IMC<=30)){
            System.out.println("Está acima do peso!");
        }
        if ((IMC>30)){
            System.out.println("Está obeso!");
        }


    }
}
