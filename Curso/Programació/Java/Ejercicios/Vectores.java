package Programació.Java.Ejercicios;

import java.util.Random;

import java.util.Scanner;

public class Vectores {

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int tamaño=sc.nextInt();


    int[] vec=new int[tamaño];
    vec=generarVector(vec,tamaño);
    mostraVector(vec);
    
}

public static int[] generarVector(int[] vec, int tamaño){
    vec=new int[tamaño];
    Random r=new Random();
    for(int i =0; i<tamaño; i++){
        vec[i]=r.nextInt(1,100);
    }
    return vec;
}
public static void mostraVector(int[] vec){
    for(int i=0; i<vec.length; i++){
        System.out.print(vec[i] +" ");

    }

}

}