package Programació.Java.Ejercicios;

import java.util.Scanner;

public class ExerciciExamen2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String[] estudiants = {"Ana", "Carles", "David"};
        double[][] notes = new double[3][3];
        double[] notesfinals = new double[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Introdueix les notes dels alumnes " + estudiants [i] + ": ");
            for (int j = 0; j < 3; j++) {
                notes [i][j] = sc.nextDouble();
                notesfinals [i] += notes [i][j];
            }
        }


        double[] mitjanaexercici = new double[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mitjanaexercici [i] += notes[j][i];
            }
            mitjanaexercici [i] /= 3;
        }


        double mitjana = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println((notesfinals[i] >= 10 ? "Està aprovat! " : "Està suspès! ") + notesfinals [i] + " " + estudiants[i]);
            mitjana  += notesfinals [i];
        }
        
        mitjana  /= 3;

        double puntuacióMax = Double.MIN_VALUE;
        double puntuacióMin = Double.MAX_VALUE;


        for (int i = 0; i < 3; i++) {
            puntuacióMax = Math.max(puntuacióMax , notesfinals [i]);
            puntuacióMin = Math.min(puntuacióMin , notesfinals[i]);
        }


        int numAprovats = 0;

        for (int i = 0; i < 3; i++) {
            if (notesfinals [i] >= 10) {
                numAprovats ++;
            }
        }


        System.out.println("Mitjana del primer exercici: " + mitjanaexercici[0]);
        System.out.println("Mitjana del segon exercici: " + mitjanaexercici [1]);
        System.out.println("Mitjana del tercer exercici: " + mitjanaexercici [2]);
        System.out.println("Mitjana de l'examen: " + mitjana );
        System.out.println("Nota més alta de l'examen: " + puntuacióMax );
        System.out.println("Nota més baixa de l'examen: " + puntuacióMin );
        System.out.println("Percentatge d'aprovats a l'assignatura: " + (numAprovats  / 3.0) * 100 + "%");
    }
}