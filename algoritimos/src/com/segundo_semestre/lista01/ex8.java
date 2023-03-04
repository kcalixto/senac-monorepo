package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        // 8) Crie um programa que leia 6 valores inteiros pares e, em seguida, mostre
        // na tela os valores lidos na ordem inversa.

        System.out.println(
                " 8) Crie um programa que leia 6 valores inteiros pares e, em seguida, mostre na tela os valores lidos   na ordem inversa. ");

        int MAX = 6;
        int[] vet1 = new int[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = ask(input);
        }

        System.out.println("\nVetor Normal:");
        print(vet1);
        System.out.println("\nInvertido:");
        print(reverse(vet1));
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverse(int[] vet1) {
        int[] vet2 = new int[vet1.length];

        for (int i = vet1.length - 1, j = 0; i >= 0; i--, j++) {
            vet2[j] = vet1[i];
        }

        return vet2;
    }

    public static int ask(Scanner input) {
        try {
            System.out.print("Digite um número PAR: ");
            int value = Integer.parseInt(input.nextLine());
            if (value % 2 == 0) {
                return value;
            } else {
                System.out.println("Valor inválido, tente novamente!");
                return ask(input);
            }
        } catch (Exception e) {
            return ask(input);
        }
    }
}