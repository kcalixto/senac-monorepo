package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        // 6) Ler 20 números reais e armazena esses valores em um array. O programa deve
        // calcular a média aritmética dos valores do vetor e imprimir todos os valores
        // menores do que a média calculada.

        System.out.println(
                " 6) Ler 20 números reais e armazena esses valores em um array. O programa deve calcular a média   aritmética dos valores do vetor e imprimir todos os valores menores do que a média calculada. ");

        int MAX = 20;
        double[] arr = new double[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ask(input);
        }

        System.out.println("\nMédia aritimética: " + calc(arr));
    }

    public static double calc(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (sum / arr.length);
    }

    public static double ask(Scanner input) {
        try {
            System.out.print("Digite um número: ");
            return Double.parseDouble(input.nextLine());
        } catch (Exception e) {
            return ask(input);
        }
    }
}