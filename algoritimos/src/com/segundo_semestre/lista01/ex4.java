package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // 4) Solicita 5 valores ao usuário, armazena esses valores em um array chamado
        // vet1 de inteiros. Depois, copia o conteúdo desse array para um segundo array
        // chamado vet2. O programa deve imprimir os dois arrays na tela.

        System.out.println(
                " 4) Solicita 5 valores ao usuário, armazena esses valores em um array chamado vet1 de inteiros.   Depois, copia o conteúdo desse array para um segundo array chamado vet2. O programa deve   imprimir os dois arrays na tela. ");

        int MAX = 5;
        int[] vet1 = new int[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = ask(input);
        }

        System.out.println("\nVet1:");
        print(vet1);
        System.out.println("\nVet2:");
        int[] vet2 = clone(vet1);
        print(vet2);
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] clone(int[] vet1) {
        int[] vet2 = new int[vet1.length];

        for (int i = 0; i < vet1.length; i++) {
            vet2[i] = vet1[i];
        }

        return vet2;
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