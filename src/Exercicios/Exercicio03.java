package Exercicios;

import java.util.Locale;
import java.util.Scanner;
/*Lendo palavras a partir do teclado*/
public class Exercicio03 {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);/*Locale é usado para definição Estados Unidos*/
        Scanner sc = new Scanner(System.in);/* o Scanner é usado p/ inseri dados pelo teclado*/


        String x;
        int y;
        double z;
        x = sc.next();/*Usado para chamar a variavel X*/
        y = sc.nextInt();/*Usado para chamar a variavel Y*/
        z = sc.nextDouble();/*Usado para chamar a variavel Z*/
        /*System.out.println("Seu Nome:" + x);
        System.out.println("Seu numero é:" + y);
        System.out.printf("Seu valor é: %.2f%n", z);*/
        System.out.println("Dados Digitados");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();
    }
}
