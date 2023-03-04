package com.segundo_semestre.lista02;

import java.util.Scanner;

public class ex9 extends Facilities {
    public static void main(String[] args) {
        // 9) Faça um programa que solicite o tamanho da matriz (MxN), solicite os
        // valores, e depois de entrar com os valores retorne:

        // a. Valor total da soma
        // dos elementos pares da matriz.

        // b. Valor da soma dos elementos dos índices
        // impares da matriz.

        // c. Valor do produto dos elementos impares da matriz .

        // d. Quantidade e posição (linha x coluna) de um determinado número (perguntar
        // esse número) encontrado na matriz. Apenas a primeira ocorrência.

        // e. Caso M=N
        // (matriz quadrada – MxM) calcular a somatória da diagonal principal e
        // secundária

        // f. Criar um vetor com a soma de todos os elementos de cada linha e
        // outro com a soma dos elementos de cada coluna

        System.out.println(
                " 9) Faça um programa que solicite o tamanho da matriz (MxN), solicite os valores, e depois de   entrar com os valores retorne:   a. Valor total da soma dos elementos pares da matriz.   b. Valor da soma dos elementos dos índices impares da matriz.   c. Valor do produto dos elementos impares da matriz .   d. Quantidade e posição (linha x coluna) de um determinado número (perguntar esse   número) encontrado na matriz. Apenas a primeira ocorrência.   e. Caso M=N (matriz quadrada – MxM) calcular a somatória da diagonal principal e   secundária   f. Criar um vetor com a soma de todos os elementos de cada linha e outro com a soma   dos elementos de cada coluna ");
        new ex9();
    }

    public ex9() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altura da matriz.");
        int line = askInt(input, 1, 2);
        System.out.println("Digite a largura da matriz.");
        int col = askInt(input, 1, 2);

        exec(line, col, input);
    }

    public void exec(int line, int col, Scanner input) {
        System.out.println("Digite os valores da matriz!");
        int[][] matrix = new int[line][col];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                index++;
                matrix[i][j] = askInt(input, index, line * col);
            }
        }
        printIntMatrix(matrix);

        System.out.println("a. sum of pairs: " + sumPairs(matrix));
        System.out.println("b. sum of odd indexes: " + sumOddIndexes(matrix));
        System.out.println("c. product of odd indexes: " + oddsProd(matrix));
        System.out.println("d. found num at: " + findNum(matrix));
        if (line == col) {
            System.out.println("e. diagonals sum: " + sumDiagonals(matrix));
        }
        System.out.printf("f. line sums %s \n col sums %s", getIntArrayString(sumLines(matrix)),
                getIntArrayString(sumCols(matrix)));
    }

    public int sumPairs(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    public int sumOddIndexes(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 == 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public int oddsProd(int[][] matrix) {
        int prd = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 1) {
                    prd *= matrix[i][j];
                }
            }
        }
        return prd;
    }

    public String findNum(int[][] matrix) {
        int[] index = new int[2];
        Scanner input = new Scanner(System.in);
        int n = askInt(input, 1, 1);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == n) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index[0] + ", " + index[1];
    }

    public int sumDiagonals(int[][] matrix) {
        int sum = 0;
        int sum_ = 0;

        for (int i = 0; i < matrix.length; i++) {
            // commom diagonal
            sum += matrix[i][i];
            // reverse diagonal
            sum_ += matrix[i][matrix.length - i - 1];
        }
        return sum + sum_;
    }

    public int[] sumLines(int[][] matrix) {
        int[] sum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum[i] += matrix[i][j];
            }
        }

        return sum;
    }

    public int[] sumCols(int[][] matrix) {
        int[] sum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum[i] += matrix[j][i];
            }
        }
        return sum;
    }
}