package com.segundo_semestre.lista02;

public class ex4 extends Facilities {
    public static void main(String[] args) {
        // 4) Fazer um programa para ler duas matrizes A e B de dimensão N por M e
        // calcular e imprimir a Matriz C = A – B.

        System.out.println(
                " 4) Fazer um programa para ler duas matrizes A e B de dimensão N por M e calcular e   imprimir a Matriz C = A – B. ");
        new ex4();
    }

    public ex4() {
        int[][] matrix = buildIntMatrix(2, 2);
        int[][] matrix_ = buildIntMatrix(3, 3);

        System.out.println("matrix a:");
        printIntMatrix(matrix);
        System.out.println("matrix b:");
        printIntMatrix(matrix_);
        System.out.println("matrix c:");
        printIntMatrix(exec(matrix, matrix_));
    }

    public int[][] exec(int[][] matrix, int[][] matrix_) {
        int[][] c = new int[Math.max(matrix.length, matrix_.length)][Math.max(matrix[0].length, matrix_[0].length)];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (i > matrix_.length - 1 || j > matrix_[0].length - 1) {
                    c[i][j] = matrix[i][j];
                } else if (i > matrix.length - 1 || j > matrix[0].length - 1) {
                    c[i][j] = matrix_[i][j];
                } else {
                    c[i][j] = matrix[i][j] - matrix_[i][j];
                }
            }
        }

        return c;
    }
}