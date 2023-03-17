package Programació.Java.Ejercicios;

import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {

        String [] tablero = {"_","_","_","_","_","_","_","_","_"};
        int tirada = 0;
        boolean alguienGano = false;
        boolean empate = false;
        int casillasOcupadas = 0;

        do {
            showTablero(tablero);
            String ficha = tirada%2==0? "\u001B[31mX\u001B[0m" : "\u001B[34mO\u001B[0m";
            juegaPlayer(ficha, tablero);

            alguienGano = evaluateWin(tablero);
            if(alguienGano) {
                System.out.println("Enhorabuena, player " + ficha);
            } else {
                casillasOcupadas++;
                if(casillasOcupadas == 9) {
                    empate = true;
                }
            }    
            tirada++;


        } while (!alguienGano && !empate);

        if(empate) {
            System.out.println("El juego ha terminado en empate.");
        }

    }

    static void showTablero(String [] tablero) {
        System.out.println(tablero[0] + " | "+ tablero[1]+" | "+ tablero[2]);
        System.out.println(tablero[3] + " | "+ tablero[4]+" | "+ tablero[5]);
        System.out.println(tablero[6] + " | "+ tablero[7]+" | "+ tablero[8]);


    }

    static void juegaPlayer(String ficha, String [] tablero) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Donde quieres mover, jugador X?");
        int posicion = lector.nextInt();

        tablero[posicion] = ficha;
    }

    public static boolean evaluateWin(String tablero[]) {

        if(tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && !tablero[0].equals("_")){
            return true;
        }else if(tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && !tablero[3].equals("_")){
            return true;
        }else if(tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && !tablero[6].equals("_")){
            return true;
        }else if(tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && !tablero[0].equals("_")){
            return true;
        }else if(tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && !tablero[1].equals("_")){
            return true;
        }else if(tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && !tablero[2].equals("_")){
            return true;
        }else if(tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8]) && !tablero[0].equals("_")){
            return true;
        }else if(tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6]) && !tablero[2].equals("_")){
            return true;
        }

        return false;
    }

}
