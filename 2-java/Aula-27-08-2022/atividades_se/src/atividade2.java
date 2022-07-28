import java.util.Scanner;

public class atividade2 {
        // Faça um algoritmo que leia o nome, o sexo("F" ou "M") e
        // o estado civil de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”,
        // solicitar o tempo de casada (anos).
        public static void main(String[] args) {
            // Com char usar o igual para comparar a igualdade
            Scanner teclado=new Scanner(System.in);
             char sexo;

            System.out.println("Informe seu sexo M ou F:");
            sexo = teclado.next();

            if(sexo == 'F'){
                System.out.println("Feminino");
            } else {
                System.out.println("Masculino");
            }

        }
}
