package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // 10) Ler 10 números em uma array de inteiros e retorna a quantidade de
        // elementos do array que são números negativos.

        System.out.println(
                " 10) Ler 10 números em uma array de inteiros e retorna a quantidade de elementos do array que são   números negativos. ");

        int MAX = 10;
        int[] arr = new int[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ask(input);
        }

        System.out.println("\nNúmeros:");
        print(arr);
        System.out.println("\nQnt de negativos: " + findNegativeAmount(arr));
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int findNegativeAmount(int[] arr) {
        int amount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                amount++;
            }
        }

        return amount;
    }

    public static int ask(Scanner input) {
        try {
            System.out.print("Digite um número: ");
            return Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            return ask(input);
        }
    }
}