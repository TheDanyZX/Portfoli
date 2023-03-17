package Programació.Java.Ejercicios;

import java.util.Scanner;

public class Figures3D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String figura;
        double base, altura, costat, radi, perimetre, superficie, volum;

        System.out.println("Introdueix el tipus de  figura (cilindre, hexaedre, tetraedre o esfera)");
        figura = sc.nextLine();

        switch (figura) {
            case "cilindre":
                System.out.println("Introdueix la seva altura");
                altura = sc.nextDouble();
                System.out.println("Introdueix el seu radi");
                radi = sc.nextDouble();
                superficie = ((2 * Math.PI * radi * altura)+(2 * Math.PI * radi));
                volum = (radi * radi * Math.PI * altura); 
                System.out.println("Superficie:" + superficie);
                System.out.println("Volum:" + volum);
                break;
            case "hexaedre":
                System.out.println("Introdueix la seva altura");
                altura = sc.nextDouble();
                System.out.println("Introdueix la seva base");
                base = sc.nextDouble();
                volum = ((base * altura) * altura);
                superficie = (6 * (base * altura));
                System.out.println("Volum:" + volum);
                System.out.println("Superficie" + superficie);
                break;
            case "tetraedre":
                System.out.println("Introdueix la seva altura");
                altura = sc.nextDouble();
                System.out.println("Introdueix la seva base");
                base = sc.nextDouble();
                superficie = ((base * altura) / 2);
                volum = ((1/3) * base * altura);
                System.out.println("Superficie:" + superficie);
                System.out.println("Volum:" + volum);
                break;
            case "esfera":
                System.out.println("Introdueix el radi");
                radi = sc.nextDouble();
                superficie = (4 * Math.PI * radi * 2);
                volum = ((4/3) * Math.PI * (radi * radi * radi));
                System.out.println("Superficie:" + superficie);
                System.out.println("Volum:" + volum);
                break; 

        }
        

    }
    
}
