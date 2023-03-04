package com.segundo_semestre.lista01;

public class ex12 {
    public static void main(String[] args) {
        // 12) Faça um programa que possua um vetor denominado A que armazene 6 números
        // inteiros. O programa deve ex12ecutar os seguintes passos: (a) Atribua os
        // seguintes valores a esse vetor: 1, 0, 5,-2,-5, 7. (b) Armazene em uma
        // variável inteira (simples) a soma entre os valores das posições A[0], A[1] e
        // A[5] do vetor e mostre na tela esta soma. (c) Modifique o vetor na posição 4,
        // atribuindo a esta posição o valor 100. (d) Mostre na tela cada valor do vetor
        // A, um em cada linha.

        System.out.println(
                " 12) Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O   programa deve ex12ecutar os seguintes passos:   (a) Atribua os seguintes valores a esse vetor: 1, 0, 5,-2,-5, 7.   (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0],   A[1] e A[5] do vetor e mostre na tela esta soma.   (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.   (d) Mostre na tela cada valor do vetor A, um em cada linha. ");

        new ex12();
    }

    public ex12() {
        int[] arr = { 1, 0, 5, -2, -5, 7 };
        int sum = arr[0] + arr[1] + arr[5];
        System.out.println("Soma: " + sum);
        arr[4] = 100;
        printInt(arr);
    }

    public static void printInt(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}