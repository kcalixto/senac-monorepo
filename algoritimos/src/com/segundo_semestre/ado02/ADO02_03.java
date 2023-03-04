package com.segundo_semestre.ado02;

public class ADO02_03 {
    // Exercícios
    // 3. Faça um programa que leia uma matriz “mat” de tamanho 2 x 3 e imprima na
    // tela a soma de todos os elementos da matriz.

    public static void main(String[] args) {
        System.out.println(
                "Exercício 3. Faça um programa que leia uma matriz 'mat' de tamanho 2 x 3 e imprima na tela a soma de todos os elementos da matriz.");
        new ADO02_03();
    }

    public ADO02_03() {
        int[][] mat = new int[][] {
                { 1, 2, 3 },
                { 1, 2, 3 },
        };

        print(mat);

        System.out.println("\nSoma dos elementos: " + calc(mat));
    }

    public int calc(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public void print(int[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + spacing(1));
            }
            skipLine();
        }
    }

    public String spacing(int amount) {
        String str = "";
        for (int i = 0; i < amount; i++) {
            str += " ";
        }
        return str;
    }

    public void skipLine() {
        System.out.println();
    }
}