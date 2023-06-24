package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHoras, salario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHoras = sc.nextDouble();

        salario = valorHoras * horas;

        System.out.println("Numero = " + numero);
        System.out.printf("Salário = R$ %.2f%n", salario);

        sc.close();

    }
}
