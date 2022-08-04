package aula_01_08_2022;

public class at_3 {
    public static void main(String[] args) {
        //Vou e volto diariamente a pé para o trabalho, que dista aproximadamente 800 m de minha casa.
        // Supondo que trabalho 5 dias por semana, 45 semanas por ano, "bole" a operação matemática que
        // deve ser efetuada para calcular quantos quilômetros, aproximadamente, terei andado ao final de
        // um ano. Elabore um programa que faça as contas e mostre o resultado

        //por dia = 800*2
        //por semana = por dia * 5
        //em 45 semanas "por ano" = por semana * 45

        int pordia;
        int porsemana;
        int porano;
        int poranokm;

        pordia = 800*2;
        porsemana = pordia * 5;
        porano = porsemana  * 45;
        poranokm = porano / 1000;

        System.out.println("Por ano é andado:");
        System.out.println(poranokm+" quilômetros.");

    }
}
