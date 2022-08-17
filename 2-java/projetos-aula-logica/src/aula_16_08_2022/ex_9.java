package aula_16_08_2022;

import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {

        //Faça um algoritmo que leia Nome e notas (total de 4 notas) de 5 alunos de um colégio.
        //Após a leitura faça:
        //a. Imprima o Nome e a média dos alunos aprovados (Média >= 7.0).
        //b. Imprima o Nome e a média dos alunos em Recuperação (5.0 >= Média menor que 7.0)
        //c. Imprima o Nome e a média dos alunos reprovados (Média menor que 5.0).
        //d. Imprima o percentual de alunos aprovados.
        //e. Imprima o percentual de alunos reprovados.

        Scanner teclado = new Scanner(System.in);

        //alunos = contador
        int contador= 3;

        String [] nomes = new String[contador];
        float [] notas1 = new float[contador];
        float [] notas2 = new float [contador];
        float [] notas3 = new float [contador];
        float [] notas4 = new float [contador];
        float [] media = new float[contador];
        float aprovado=0;
        float percentualaprovado=0;
        float reprovado=0;
        float percentualreprovado=0;
        float recuperaçao=0;
        float percentualrecuperaçao=0;

        for (int i = 0;i<contador;i++) {
            System.out.println("Informe o nome do aluno:");
            nomes[i] = teclado.next();

            System.out.println("Informe uma nota:");
            notas1[i] = teclado.nextInt();
            System.out.println("Informe uma nota:");
            notas2[i] = teclado.nextInt();
            System.out.println("Informe uma nota:");
            notas3[i] = teclado.nextInt();
            System.out.println("Informe uma nota:");
            notas4[i] = teclado.nextInt();
            System.out.println(" ");
        }

        //a. Imprima o Nome e a média dos alunos aprovados (Média >= 7.0).

        System.out.println("Alunos aprovados:");
        for (int i = 0;i<contador;i++){
            media[i] = ((notas1[i] + notas2[i] + notas3[i] + notas4[i]) / 4);

            if (media[i]>=7){
                System.out.println("Nome: "+nomes[i]);
                System.out.println("Média:"+ media[i]+"\n");
                aprovado++;
            }
        }

        //b. Imprima o Nome e a média dos alunos em Recuperação (5.0 >= Média menor que 7.0)

        System.out.println("Alunos com recuperação:");
        for (int i = 0;i<contador;i++){
            media[i] = ((notas1[i] + notas2[i] + notas3[i] + notas4[i]) / 4);

            if ((media[i]>=5)&&(media[i]<7)){
                System.out.println("Nome: "+nomes[i]);
                System.out.println("Média:"+ media[i]+"\n");
                recuperaçao++;
            }

        }

        //c. Imprima o Nome e a média dos alunos reprovados (Média menor que 5.0).

        System.out.println("Alunos reprovados:");

        for (int i = 0;i<contador;i++){
            media[i] = ((notas1[i] + notas2[i] + notas3[i] + notas4[i]) / 4);

            if (media[i]<5){
                System.out.println("Nome: "+nomes[i]);
                System.out.println("Média:"+ media[i]+"\n");
                reprovado++;
            }

        }

        //d. Imprima o percentual de alunos aprovados.
        percentualaprovado = (aprovado/contador)*100f;
        System.out.println("Quantidade de aprovados:");
        System.out.println(aprovado);
        System.out.println("Percentual de aprovados:");
        System.out.println(percentualaprovado+"\n");


        //e. Imprima o percentual de alunos reprovados.

        percentualreprovado = (reprovado/contador)*100f;
        System.out.println("Quantidade de reprovados:");
        System.out.println(reprovado);
        System.out.println("Percentual de reprovados:");
        System.out.println(percentualreprovado+"\n");

        //  percentualrecuperaçao

        percentualrecuperaçao=(recuperaçao/contador)*100f;

        System.out.println("Quantidade de recuperaçoes:");
        System.out.println(recuperaçao);
        System.out.println("Percentual de recuperaçoes:");
        System.out.println(percentualrecuperaçao);

    }

}
