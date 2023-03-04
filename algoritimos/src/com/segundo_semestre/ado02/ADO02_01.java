package com.segundo_semestre.ado02;

public class ADO02_01 {
    // Exercícios
    // 1. Faça um programa para somar duas matrizes.

    public static void main(String[] args) {
        System.out.println(
                "Exercício 1. Faça um programa para somar duas matrizes.");
        new ADO02_01();
    }

    public ADO02_01() {
        int[][] m1 = new int[][] {
                { 5, 2, 6 },
                { 1, 6, 7 },
                { 10, 8, 3, 4 },
        };

        int[][] m2 = new int[][] {
                { 0, 13, 5 },
                { 15, 1, 4, 6 },
                { 1 },
                { 1 },
        };

        System.out.print("\n1ST MATRIX: ");
        print(m1);
        System.out.print("\n2ND MATRIX: ");
        print(m2);
        System.out.print("\nFINAL MATRIX: ");
        print(sum(m1, m2));
    }

    public int[][] sum(int[][] m1, int[][] m2) {
        int max = Math.max(m1.length, m2.length);
        int[][] result = new int[max][max];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                result[i][j] = m1[i][j];
            }
        }

        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                result[i][j] += m2[i][j];

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