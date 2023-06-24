package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao03 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Aqui pode ser declarado as variaveis dessa forma*/
        /*double largura, comprimento;
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();*/
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();
        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Preço = %.2f%n",  preco);

        sc.close();
    }
}
