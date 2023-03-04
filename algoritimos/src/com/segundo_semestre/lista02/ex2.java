package com.segundo_semestre.lista02;

public class ex2 extends Facilities {
    public static void main(String[] args) {
        // 2) Dada uma matriz A (N X N), percorrer a matriz para verificar se a matriz
        // possui elementos repetidos. No final o programa deve imprimir se há ou não
        // elementos repetidos

        System.out.println(
                " 2) Dada uma matriz A (N X N), percorrer a matriz para verificar se a matriz possui   elementos repetidos. No final o programa deve imprimir se há ou não elementos   repetidos ");
        new ex2();
    }

    public ex2() {
        int line = random();
        int col = random();
        int[][] matrix = buildIntMatrix(line, col);

        int x = random();

        int amount = exec(matrix, x);

        System.out.printf("%d repeated %d times in this matrix(%d, %d)\n", x, amount, line, col);
        printIntMatrixEnhanced(matrix, findPositions(matrix, x, amount));
    }

    public int exec(int[][] matrix, int x) {
        int amount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    amount++;
                }
            }
        }
        return amount;
    }
}