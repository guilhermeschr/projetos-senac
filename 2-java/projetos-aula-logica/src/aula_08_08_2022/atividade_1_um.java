package aula_08_08_2022;

import java.util.Scanner;

public class atividade_1_um {
    public static void main(String[] args) {

        //Suponha que para cada aluno de uma sala exista
        // uma ficha contendo o nome e a idade de 05 alunos.
        //Faça algoritmo que determine quantos alunos tem idade maior que 30.

        Scanner teclado = new Scanner(System.in);
        int idade= 0;
        String nome=" ";
        int quantidadedealunosmaiorque30=0;

        for (int i = 0; i<5;i++){
            System.out.println("Nome aluno:");
            nome = teclado.next();
            System.out.println("Idade:");
            idade = teclado.nextInt();

            if ( idade >= 30 ){
                quantidadedealunosmaiorque30++;
            }
            System.out.println("Quantidade de alunos com mais de 30 amos: "+ quantidadedealunosmaiorque30);
        }




    }
}
