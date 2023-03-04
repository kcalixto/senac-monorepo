package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        // 7) Ler 10 salários. Depois de lidos e armazenados, mostre o maior valor.

        System.out.println(" 7) Ler 10 salários. Depois de lidos e armazenados, mostre o maior valor. ");

        int MAX = 10;
        double[] arr = new double[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ask(input);
        }

        System.out.println("\nSalários:");
        print(arr);
        System.out.println("\nMaior: " + findMax(arr));
    }

    public static void print(double[] arr) {
        for (double i : arr) {
            System.out.print(i + " ");
        }
    }

    public static double findMax(double[] arr) {
        double max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
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