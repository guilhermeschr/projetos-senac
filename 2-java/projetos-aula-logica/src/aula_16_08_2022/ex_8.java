package aula_16_08_2022;

import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String palindromo;
        boolean pali = true;
        System.out.println("Insira uma palavra:");
        palindromo = sc.next();
        int len = palindromo.length();
        for(int i = 0; i < len; i++) {
            if (palindromo.charAt(i) != palindromo.charAt(len - i - 1)) {
                pali = false;
            }
        }
        if (pali) {
            System.out.println(palindromo + " é palíndromo!");
        } else {
            System.out.println(palindromo + " não é palíndromo!");
        }
    }
}
