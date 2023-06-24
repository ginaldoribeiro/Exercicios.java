package Exercicios;

import java.util.Scanner;

public class ExercicioFixacao01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x, y= 0;
        x = sc.nextInt();
        y = sc.nextInt();
        int soma = x +y;
        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
