package com.segundo_semestre.lista02;

public class ex6 extends Facilities {
    public static void main(String[] args) {
        // 6) Dada uma matriz A de ordem N por M, encontrar o menor elemento da matriz e
        // informar o valor.

        System.out.println(
                " 6) Dada uma matriz A de ordem N por M, encontrar o menor elemento da matriz e   informar o valor. ");
        new ex6();
    }

    public ex6() {
        int[][] matrix = buildIntMatrix(3, 3);

        int num = exec(matrix);

        printIntMatrix(matrix);
        System.out.println("lowest num int matrix is " + num);
    }

    public int exec(int[][] matrix) {
        int min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min)
                    min = matrix[i][j];
            }
        }

        return min;
    }
}