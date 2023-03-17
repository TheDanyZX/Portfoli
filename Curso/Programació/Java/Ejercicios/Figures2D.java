package Programació.Java.Ejercicios;
import java.util.Scanner;

public class Figures2D {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String figura;
        double base, altura, costat, radi, perimetre, superficie;

        System.out.print("Introdueix el tipus de figura (quadrat, rectangle, triangle isosceles o cercle): ");
        figura = input.nextLine();

        switch (figura) {
            case "quadrat":
                System.out.print("Introdueix la mida del costat: ");
                costat = input.nextDouble();
                perimetre = costat * 4;
                superficie = costat * costat;
                break;
            case "rectangle":
                System.out.print("Introdueix la mida de la base: ");
                base = input.nextDouble();
                System.out.print("Introdueix la mida de l'altura: ");
                altura = input.nextDouble();
                perimetre = 2 * (base + altura);
                superficie = base * altura;
                break;
            case "triangle isosceles":
                System.out.print("Introdueix la mida de la base: ");
                base = input.nextDouble();
                System.out.print("Introdueix la mida de l'altura: ");
                altura = input.nextDouble();
                costat = Math.sqrt((altura*altura) + ((base/2)*(base/2)));
                perimetre = 2*costat + base;
                superficie = (base * altura) / 2;
                break;
            case "cercle":
                System.out.print("Introdueix la mida del radi: ");
                radi = input.nextDouble();
                perimetre = 2 * Math.PI * radi;
                superficie = Math.PI * radi * radi;
                break;
            default:
                System.out.println("Figura no vàlida.");
                return;
        }

        System.out.println("Perímetre: " + perimetre);
        System.out.println("Superfície: " + superficie);
    }

}