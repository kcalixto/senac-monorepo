package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        // 11) Ler 10 números em uma array e criar outra array booleana do mesmo tamanho
        // e retorne, para cada elemento, true quando o número do vetor 1 for par e
        // falso se o número do vetor 1 for ímpar.

        System.out.println(
                " 11) Ler 10 números em uma array e criar outra array booleana do mesmo tamanho e retorne, para   cada elemento, true quando o número do vetor 1 for par e falso se o número do vetor 1 for   ímpar. ");

        int MAX = 10;
        int[] arr = new int[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ask(input);
        }

        System.out.println("\nNúmeros:");
        printInt(arr);
        System.out.println("\nBooleans:");
        printBool(parseBool(arr));
    }

    public static void printInt(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "     ");
        }
    }

    public static void printBool(Boolean[] arr) {
        for (Boolean i : arr) {
            System.out.print(i + " ");
        }
    }

    public static Boolean[] parseBool(int[] arr) {
        Boolean[] arrbool = new Boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arrbool[i] = false;
            } else {
                arrbool[i] = true;
            }
        }

        return arrbool;
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