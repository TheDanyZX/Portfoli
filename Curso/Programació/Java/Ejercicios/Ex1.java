package Programació.Java.Ejercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el teu nom: ");
        String name = scanner.nextLine();
        System.out.print("Introdueix la teva edat: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // netejar el buffer
        System.out.print("Introdueix la teva adreça: ");
        String address = scanner.nextLine();
        System.out.print("Introdueix el teu telèfon: ");
        int phone = scanner.nextInt();
        scanner.nextLine(); // netejar el buffer
        System.out.print("Introdueix el teu sexe (M/F): ");
        char gender = scanner.nextLine().charAt(0);

        System.out.println("Em dic " + name + ", tinc " + age + " anys, sóc " + (gender == 'M' ? "home" : "dona") + ", la meva adreça és " + address + " i el meu telèfon és el " + phone + ".");
    }
}