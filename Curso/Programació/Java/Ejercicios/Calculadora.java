package Programació.Java.Ejercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix dos nombres enters:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.println("Introdueix l'operació a realitzar (+, -, *, /):");
        char calculadora = scanner.next().charAt(0);
        
        int result = 0;
        switch(calculadora) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Operació invàlida.");
                return;
        }
        
        System.out.println("El resultat és: " + result);
    }
    
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Divisió per zero no permesa.");
            return 0;
        }
        return num1 / num2;
    }
}