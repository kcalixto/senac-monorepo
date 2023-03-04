package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        // 9) Leia 10 números em uma array, pergunte ao usuário um número a ser
        // procurado. Assim que localizar, imprimir qual a localização do número na
        // array.

        System.out.println(
                " 9) Leia 10 números em uma array, pergunte ao usuário um número a ser procurado. Assim que   localizar, imprimir qual a localização do número na array. ");

        int MAX = 10;
        double[] arr = new double[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ask(input);
        }

        System.out.println("\nValores:");
        print(arr);

        searchOption(input, arr);
    }

    public static void searchOption(Scanner input, double[] arr) {
        System.out.print("\nDigite um número para procurar: ");
        double search = Integer.parseInt(input.nextLine());

        int index = findIndex(search, arr);
        if (index == -1) {
            System.out.println("Valor não encontrado.");
            searchOption(input, arr);
        } else {
            System.out.println("Valor na posição " + index + " do vetor.");
        }
    }

    public static int findIndex(double search, double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i + 1;
            }
        }

        return -1;
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