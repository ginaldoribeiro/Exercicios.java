package Exercicios;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*Aula como printar varios elementos em diferentes variaveis*/
        String nome = "Ginaldo Ribeiro";
        int idade = 40;
        double renda = 3000.0;
        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.3f%n", x);
        /*o uso do US server para mostrar um ponto em lugar da virgula*/
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n", x);
        System.out.println("Bom dia!");
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}