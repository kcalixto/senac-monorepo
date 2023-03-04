package com.segundo_semestre.ado02;

public class ADO02_02 {
    // Exercícios
    // 2. Faça um programa para calcular a transposta de uma matriz.

    public static void main(String[] args) {
        System.out.println(
                "Exercício 2. Faça um programa para calcular a transposta de uma matriz.");
        new ADO02_02();
    }

    public ADO02_02() {
        int[][] matrix = new int[][] {
                { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 },
        };
        print(calc(matrix));
    }

    public int[][] calc(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
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