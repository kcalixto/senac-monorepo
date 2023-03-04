package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        // 19) Faca um algoritmo q leia e armazene 5 valores inteiros em um vetor Vet1.
        // Leia outros 5 valores inteiros e armazene num vetor Vet2. A partir destes
        // valores lidos, mostre na tela:
        // - a soma dos elementos de cada vetor, nas respectivas posições
        // - a diferença dos elementos de cada vetor, nas respectivas posições
        // - o produto dos elementos de cada vetor, nas respectivas posições
        // - a divisão entre os elementos de cada vetor, nas respectivas posições

        System.out.println(
                " 19) Faca um algoritmo q leia e armazene 5 valores inteiros em um vetor Vet1. Leia outros 5 valores   inteiros e armazene num vetor Vet2. A partir destes valores lidos, mostre na tela:   - a soma dos elementos de cada vetor, nas respectivas posições   - a diferença dos elementos de cada vetor, nas respectivas posições   - o produto dos elementos de cada vetor, nas respectivas posições   - a divisão entre os elementos de cada vetor, nas respectivas posições ");
        new ex19();
    }

    public ex19() {
        int MAX = 5;
        int[] vet1 = new int[MAX];
        int[] vet2 = new int[MAX];
        Scanner input = new Scanner(System.in);

        System.out.println("Informe os valores do vet1: ");
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = ask(input, i + 1, vet1.length);
        }
        System.out.println("Informe os valores do vet2: ");
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = ask(input, i + 1, vet2.length);
        }

        for (int i = 0; i < vet2.length; i++) {
            int a = vet1[i];
            int b = vet2[i];
            System.out.println(a + " + " + b + " = " + sum(a, b));
            System.out.println(a + " - " + b + " = " + dif(a, b));
            System.out.println(a + " * " + b + " = " + prod(a, b));
            System.out.println(a + " / " + b + " = " + div(a, b));
            System.out.println("----------");
        }

    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int prod(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static int ask(Scanner input, int index, int total) {
        try {
            System.out.print("Digite um número (" + index + "/" + total + "): ");
            return Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            return ask(input, index, total);
        }
    }
}