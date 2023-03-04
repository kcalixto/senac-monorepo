package com.segundo_semestre.lista02;

public class ex3 extends Facilities {
    public static void main(String[] args) {
        // 3) Dada uma matriz com N linhas e M colunas, escrever um programa para
        // calcular a soma de cada linha da matriz, criando-se um vetor B de dimensão N,
        // onde cada elemento de B representa a soma de uma linha da matriz.

        System.out.println(
                " 3) Dada uma matriz com N linhas e M colunas, escrever um programa para calcular a soma   de cada linha da matriz, criando-se um vetor B de dimensão N, onde cada elemento de B   representa a soma de uma linha da matriz. ");
        new ex3();
    }

    public ex3() {
        int[][] matrix = buildIntMatrix(2, 2);

        int[] sum = exec(matrix);

        printIntMatrix(matrix);
        System.out.printf("sum:\n" + getIntArrayString(sum));
    }

    public int[] exec(int[][] matrix) {
        int[] sum = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum[i] += matrix[i][j];
            }
        }
        return sum;
    }
}