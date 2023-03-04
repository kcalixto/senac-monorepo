package com.segundo_semestre.ado01;

public class ADO01 {
    public static void main(String[] args) throws Exception {
        System.out.println("\nex01:");
        ex01();
        System.out.println("\nex02:");
        ex02();
        System.out.println("\nex03:");
        ex03();
    }

    public static void ex01() {
        // 1. Faça um Algoritmo que copie o conteúdo de um vetor em um segundo vetor.
        // Apresente o vetor resulante.
        int arr1[] = { 1, 5, 6 };
        int arr2[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            System.out.print(arr2[i] + " ");
        }
    }

    public static void ex02() {
        // 2. Faça um Algoritmo que some o conteúdo de dois vetores e armazene o
        // resultado em um terceiro vetor. Apresente o vetor resulante.
        int arr1[] = { 1, 5, 6 };
        int arr2[] = { 8, 5, 3 };

        int result = 0;

        for (int i = 0; i < arr1.length; i++) {
            result = result + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result = result + arr2[i];
        }

        System.out.print("total: " + result);

    }

    public static void ex03() {
        // 3. Crie uma função para unir dois vetores de mesmo tamanho e mesmo tipo em um
        // terceiro vetor com dobro do tamanho. Apresente o vetor resulante.

        int arr1[] = { 1, 5 };
        int arr2[] = { 8, 5, 3, 6 };

        int result[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0 + arr1.length; i < (arr1.length + arr2.length); i++) {
            result[i] = arr2[i - arr1.length];
        }

        for (int res : result) {
            System.out.print(" " + res + "\n");
        }
    }
}
