package Programació.Java.Ejercicios;

import java.util.Scanner;

public class Matriu {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
                
                int[][] matriu = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                mostraMatriu(matriu);
        
                
                int files = 3;
                int columnes = 3;
                int[][] matriuUsuari = demanaMatriu(files, columnes);
                mostraMatriu(matriuUsuari);
        
                
                int min = 1;
                int max = 10;
                int[][] matriuAleatoria = generaMatriu(files, columnes, min, max);
                mostraMatriu(matriuAleatoria);
            }
        
            public static void mostraMatriu(int[][] matriu) {
                for (int i = 0; i < matriu.length; i++) {
                    for (int j = 0; j < matriu[i].length; j++) {
                        System.out.print(matriu[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        
            public static int[][] demanaMatriu(int files, int columnes) {
                Scanner sc = new Scanner(System.in);
                int[][] matriu = new int[files][columnes];
                for (int i = 0; i < files; i++) {
                    for (int j = 0; j < columnes; j++) {
                        System.out.print("Introdueix el valor per la posició [" + i + "][" + j + "]: ");
                        matriu[i][j] = sc.nextInt();
                    }
                }
                return matriu;
            }
        
            public static int[][] generaMatriu(int files, int columnes, int min, int max) {
                int[][] matriu = new int[files][columnes];
                for (int i = 0; i < files; i++) {
                    for (int j = 0; j < columnes; j++) {
                        matriu[i][j] = (int) (Math.random() * (max - min + 1) + min);
                    }
                }
                return matriu;
            }
        
        }