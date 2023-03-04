package com.segundo_semestre.lista02;

public class ex7 extends Facilities {
    public static void main(String[] args) {
        // 7) Dada uma matriz A de ordem N por M, encontrar o maior elemento da matriz e
        // informar o valor e a posição (linha e coluna) onde o valor foi encontrado

        System.out.println(
                " 7) Dada uma matriz A de ordem N por M, encontrar o maior elemento da matriz e informar   o valor e a posição (linha e coluna) onde o valor foi encontrado ");
        new ex7();
    }

    public ex7() {
        int[][] matrix = buildIntMatrix(3, 3);

        int[] res = exec(matrix);

        System.out.println("highest num in matrix is " + res[0] + " at (" + res[1] + "," + res[2] + ")");
        printIntMatrixEnhanced(matrix, new int[][] {
                { res[2] },
                { res[1] },
        });
    }

    public int[] exec(int[][] matrix) {
        int x = 0;
        int y = 0;
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        return new int[] { max, x, y };
    }
}