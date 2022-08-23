package aula_18_08_2022;

public class ex_03 {
    public static void main(String[] args) {
//Dado uma matriz A de ordem 3x3.
//Matriz A =
//[
//  [2, 5, 7],
//  [8, 9, 3],
//  [1, 6, 10]
//]
//Faca um algoritmo que:
//a. Calcule a soma dos elementos da primeira coluna
//b. calcule o produto dos elementos da primeira linha
//c. Calcule a soma da diagonal principal

        int matriza[][]={
                {2, 5, 7},
                {8, 9, 3},
                {1, 6, 10},
        };

// a. Calcule a soma dos elementos da primeira coluna

        int somaprimeiracoluna=0;

        for (int i = 0;i<3;i++) {
            somaprimeiracoluna = somaprimeiracoluna + matriza[i][0];
        }
        System.out.println("Soma dos elementos da primeira coluna: "+somaprimeiracoluna);

//b. calcule o produto dos elementos da primeira linha

        int produtoprimeiralinha=0;
        int produtoprimeiralinha1=0;
        int contador=1;
        for (int i = 0;i<3;i++) {
            if (produtoprimeiralinha==0){
                produtoprimeiralinha=matriza[0][0];
            }
            produtoprimeiralinha = produtoprimeiralinha * matriza[0][i];
            produtoprimeiralinha1 = produtoprimeiralinha/matriza[0][0];
            contador++;
        }
        System.out.println("Produto dos elementos da primeira linha: "+produtoprimeiralinha1);

//c. Calcule a soma da diagonal principal

        int somadiagonal=0;

        somadiagonal=matriza[0][0]+matriza[1][1]+matriza[2][2];

        System.out.println("Soma da diagonal principal: "+somadiagonal);
    }
}
