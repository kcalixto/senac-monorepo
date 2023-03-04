package com.segundo_semestre.ado02;

public class ADO02_04 {
    // Exercícios
    // 4. Faça um programa que leia uma matriz “mat” de tamanho 4 x 4, e imprima na
    // tela a soma dos elementos abaixo da diagonal principal da matriz.

    public static void main(String[] args) {
        System.out.println(
                "Exercício 4. Faça um programa que leia uma matriz “mat” de tamanho 4 x 4, e imprima na tela a soma dos elementos abaixo da diagonal principal da matriz.");
        new ADO02_04();
    }

    public ADO02_04() {
        int[][] mat = new int[][] {
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
        };
        System.out.print("\nMatriz:");
        print(mat);
        System.out.println("------------------");

        System.out.print("Elementos abaixo da diagonal principal da matriz: ");
        print(getTarget(mat));

        System.out.println("------------------");

        System.out.print("\nSoma dos elementos abaixo da diagonal principal: " + calc(getTarget(mat)));
    }

    public int[][] getTarget(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // i - 1 define que pegaremos a diagonal abaixo da principal, i == j seria a diagonal exata.
                if ((i - 1) == j) {
                    System.out.print(matrix[i][j]);
                    result[i][j] = matrix[i][j];
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        return result;
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