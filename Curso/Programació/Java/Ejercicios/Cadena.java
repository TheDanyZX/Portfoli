package Programació.Java.Ejercicios;

import java.util.Scanner;

public class Cadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String operacio;

        do {
            System.out.print("Introdueix el primer nombre: ");
            num1 = sc.nextInt();
            if (num1 == 'S') {
                break;
            }

            System.out.print("Introdueix el segon nombre: ");
            num2 = sc.nextInt();

            System.out.print("Introdueix l'operació (+, -, x o /): ");
            operacio = sc.next();

            switch (operacio) {
                case "+":
                    sumar(num1, num2);
                    break;
                case "-":
                    restar(num1, num2);
                    break;
                case "x":
                    multiplicar(num1, num2);
                    break;
                case "/":
                    dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operació no vàlida.");
            }
        } while (true);
    }

    public static void sumar(int a, int b) {
        System.out.println("La suma és: " + (a + b));
    }

    public static void restar(int a, int b) {
        System.out.println("La resta és: " + (a - b));
    }

    public static void multiplicar(int a, int b) {
        System.out.println("La multiplicació és: " + (a * b));
    }

    public static void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No es pot dividir per zero.");
        } else {
            System.out.println("La divisió és: " + (a / b));
        }
    }
}