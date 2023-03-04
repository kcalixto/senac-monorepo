package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // 3) Solicita 8 inteiros ao usuário e guarda esses valores em um array. Depois
        // o programa deve descobrir e exibir qual a posição do elemento de maior
        // valor.

        System.out.println(
                " 3) Solicita 8 inteiros ao usuário e guarda esses valores em um array. Depois o programa deve   descobrir e ex3ibir qual a posição do elemento de maior valor. ");

        int MAX = 8;
        int[] arr = new int[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ask(input);
        }

        System.out.println("\nNúmeros:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nindex do maior num: " + findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return index + 1;
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