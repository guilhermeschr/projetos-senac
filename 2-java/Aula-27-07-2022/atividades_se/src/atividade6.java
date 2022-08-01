import java.util.Scanner;
// NÃO FUNCIONA
public class atividade6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        boolean idade = false;
        String idadedois;
        //Escreva um algoritmo que lê dois valores booleanos (lógicos) e então determina se ambos são
        // VERDADEIROS ou FALSOS.Obs:Faça uma pergunta por exemplo:Você é maior de idade?Responda SIM
        // ou NAO. Atribua o valor conforme o caso e no final mostre a resposta: A pessoa é maior de
        // idade, se a resposta for SIM A pessoa é menor de idade, se a resposta for NAO

        System.out.println("Você é maior de idade?");
        idade= teclado.hasNext();

        if (idade=false){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você é menor de idade!");
        }

    }
}
