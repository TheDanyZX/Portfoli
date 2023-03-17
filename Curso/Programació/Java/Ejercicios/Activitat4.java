package Programació.Java.Ejercicios;

import java.util.Scanner;

public class Activitat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String input = sc.nextLine();

        String newString = input.replace("a", "e");
        int numChanges = input.length() - newString.length();

        System.out.println("Nueva frase: " + newString);
        System.out.println("Se han cambiado " + numChanges + " letras");

        if (input.charAt(0) == 'a') {
            System.out.println("La primera letra era una 'a'");
        }
        if (input.charAt(input.length() - 1) == 'a') {
            System.out.println("La última letra era una 'a'");
        }
    }
}
