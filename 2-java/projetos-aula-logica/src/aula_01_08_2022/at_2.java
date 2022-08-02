package aula_01_08_2022;

public class at_2 {
    public static void main(String[] args) {
       // Uma pessoa com pouco tempo disponível lê um livro por 5
        // minutos a cada dia, 6 dias por semana. Monte a fórmula e
        // escreva um programa que calcula e mostra na tela quanto tempo,
        // em horas, a pessoa terá dedicado ao livro ao final de um ano.

        int semanale;
        int semanas;
        int tempolido;

        //tempo lido no ano = tempo lido por semana * semanas no ano

        //por semana ele lê
        semanale=5*6;
        //semanas em um ano
        semanas=365/7;

        tempolido=semanale*semanas;

        System.out.println("Tempo lido no ano:");
        System.out.println(tempolido);

    }
}
