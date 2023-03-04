package com.segundo_semestre.lista02;

import java.util.Scanner;

public class ex8 extends Facilities {
    public static void main(String[] args) {
        // 8) Uma matriz quadrada é chamada de quadrado mágico se a soma dos elementos
        // de cada linha, a soma dos elementos de cada coluna e as somas das diagonais
        // principais e secundárias são todas iguais. Por ex8emplo, as matrizes abaixo
        // são quadrados mágicos Exemplo1 3 4 8 10 5 0 2 6 7 Exemplo2 1 1 1 1 1 1 1 1
        // 1 Faça um programa que solicite o tamanho da matriz, solicite os valores, e
        // depois de entrar com os valores retorne se a matriz é um quadrado mágico ou
        // não (segundo as regras acima).

        System.out.println(
                " 8) Uma matriz quadrada é chamada de quadrado mágico se a soma dos elementos de cada   linha, a soma dos elementos de cada coluna e as somas das diagonais principais e   secundárias são todas iguais. Por ex8emplo, as matrizes abaixo são quadrados mágicos   Exemplo 1   3 4 8   10 5 0   2 6 7   Exemplo 2   1 1 1   1 1 1   1 1 1   Faça um programa que solicite o tamanho da matriz, solicite os valores, e depois de entrar com   os valores retorne se a matriz é um quadrado mágico ou não (segundo as regras acima). ");
        new ex8();
    }

    public ex8() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz.");
        int size = askInt(input, 1, 1);

        boolean success;
        do {
            success = exec(size, input);
            System.out.println("is magic cube? " + success);
        } while (!success);
    }

    public boolean exec(int size, Scanner input) {
        System.out.println("Digite os valores da matriz!");
        int[][] matrix = new int[size][size];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                index++;
                matrix[i][j] = askInt(input, index, size * size);
                // matrix[i][j] = 1;
            }
        }
        printIntMatrix(matrix);

        int possible_sums = matrix.length * 2 + 2;
        int[] sums = new int[possible_sums];
        // diagonals
        for (int i = 0; i < matrix.length; i++) {
            // commom diagonal
            sums[0] += matrix[i][i];
            // reverse diagonal
            sums[1] += matrix[i][matrix.length - i - 1];
        }
        if (sums[0] != sums[1])
            return false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sums[2 + i] += matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sums[(matrix.length + 2) + i] += matrix[j][i];
            }
        }

        System.out.println(getIntArrayString(sums));
        return validate(sums);
    }

    public boolean validate(int[] sums) {
        for (int i = 1; i < sums.length; i++) {
            if (sums[i] != sums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}