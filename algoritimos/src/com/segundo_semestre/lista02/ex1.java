package com.segundo_semestre.lista02;

public class ex1 extends Facilities {
    public static void main(String[] args) {
        // 1) Escreva um programa Java que declara e constrói uma matriz de ordem M(2 x
        // 5) de 10 elementos do tipo int. Em seguida use laços for para inicializar os
        // elementos com os valores de 1 até 10. Para finalizar ex1iba os valores dos
        // elementos da matriz na vertical. Seu programa deverá ex1ibir a seguinte
        // saída.
        // 1, 2, 3, 4, 5
        // 6, 7, 8, 9, 10

        System.out.println(
                "1) Escreva um programa Java que declara e constrói uma matriz de ordem M(2 x 5) de 10   elementos do tipo int. Em seguida use laços for para inicializar os elementos com os   valores de 1 até 10. Para finalizar ex1iba os valores dos elementos da matriz na vertical.   Seu programa deverá ex1ibir a seguinte saída.   1, 2, 3, 4, 5   6, 7, 8, 9, 10 \n");

        new ex1();
    }

    public ex1() {
        int[][] matrix = new int[2][5];
        int num = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                num++;
                matrix[i][j] = num;
            }
        }

        printIntMatrix(matrix);
    }
}