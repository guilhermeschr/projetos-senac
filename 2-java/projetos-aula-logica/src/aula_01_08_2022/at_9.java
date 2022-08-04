package aula_01_08_2022;

import java.util.Scanner;

public class at_9 {
    public static void main(String[] args) {
        //Um estudante muito metódico estava matriculado em 6 disciplinas,
        // e dispunha de 1 hora e 40 minutos para estudar. Sua intenção era
        // dividir o tempo disponível igualmente para as 6 disciplinas, e descansar
        // livremente o tempo restante. Faça um programa que calcule o tempo que ele
        // deve dedicar para cada disciplina e o tempo livre.

        Scanner teclado = new Scanner(System.in);

        int tempo_total_min = 40+60;
        int tempo_por_materia_e_tempolivre=tempo_total_min/7;

        System.out.println("O tempo dividido para as 6 diciplinas e o tempo livre é:");
        System.out.println(tempo_por_materia_e_tempolivre+ " minutos");


    }
}
