package com.segundo_semestre.lista03;

import java.util.Scanner;

public class ex6 extends Facilities {
    public static void main(String[] args) {
        // 6) Dada uma matriz de tamanho N x M de números inteiros, fazer um programa
        // que verifica se um dado número inteiro faz parte dos elementos dessa matriz.

        // Caso faça, imprimir a posição (linha e coluna) em que esse número se encontra
        // dentro da matriz e o número de vezes em que ele aparece na matriz.

        // Regras: a.
        // Crie uma função para popular a matriz com os números inteiros. Essa função
        // deve retornar uma matriz. Não se esqueça de pedir para o usuário qual a
        // altura e largura da matriz.

        // b. Crie uma função que recebe a matriz e o número
        // a ser procurado e retorna o número de vezes em que o elemento aparece na
        // matriz.

        // c. Se número não for encontrado, informar “Número não encontrado” e
        // finalizar o programa.

        // d. Caso encontre pelo menos um número, crie uma função
        // que recebe a matriz, o número a ser procurado, e a quantidade de vezes que
        // este número foi encontrado.

        // A função retorna as posições de linha e coluna do
        // elemento em uma matriz. (Considerando a coluna 0 da matriz como a linha e a
        // coluna 1 da matriz como a coluna onde o número foi encontrado na matriz).

        // e.
        // Imprimir o resultado, informando a quantidade de vezes que o número foi
        // encontrado na matriz depois a posição da linha, coluna onde o número foi
        // encontrado.

        // f. Não utilizar variáveis globais para as funções especificadas
        // acima.

        System.out.println(
                " 6) Dada uma matriz de tamanho N x M de números inteiros, fazer um programa que verifica   se um dado número inteiro faz parte dos elementos dessa matriz. Caso faça, imprimir a   posição (linha e coluna) em que esse número se encontra dentro da matriz e o número   de vezes em que ele aparece na matriz. Regras:   a. Crie uma função para popular a matriz com os números inteiros. Essa função deve   retornar uma matriz. Não se esqueça de pedir para o usuário qual a altura e largura da   matriz.   b. Crie uma função que recebe a matriz e o número a ser procurado e retorna o número de   vezes em que o elemento aparece na matriz.   c. Se número não encontrado, informar “Número não encontrado” e finalizar o programa.   d. Caso encontre pelo menos um número, crie uma função que recebe a matriz, o número   a ser procurado, e a quantidade de vezes que este número foi encontrado. A função   retorna as posições de linha e coluna do elemento em uma matriz. (Considerando a   coluna 0 da matriz como a linha e a coluna 1 da matriz como a coluna onde o número foi   encontrado na matriz).   e. Imprimir o resultado, informando a quantidade de vezes que o número foi encontrado   na matriz depois a posição da linha, coluna onde o número foi encontrado.   f. Não utilizar variáveis globais para as funções especificadas acima. ");
        new ex6();
    }

    public ex6() {
        Scanner input = new Scanner(System.in);
        int n = askInt(input, 1, 2);
        int m = askInt(input, 2, 2);
        System.out.printf("%d lines, %d columns\n", n, m);

        int x = (int) (Math.random() * 10);

        int[][] matrix = buildMatrix(n, m);
        System.out.println("matrix");
        printIntMatrix(matrix);

        int repeated = findX(matrix, x);
        System.out.printf("%d repeated %d times\n", x, repeated);

        int[][] positions = findPositions(matrix, x, repeated);
        exec(matrix, positions, repeated, x);

        printIntMatrixEnhanced(matrix, positions);
    }

    public int[][] buildMatrix(int n, int m) {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        return matrix;
    }

    public int findX(int[][] matrix, int x) {
        int repeated = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    repeated++;
                }
            }
        }
        if (repeated == 0) {
            System.out.println("Número não encontrado");
            System.exit(0);
        }
        return repeated;
    }

    public int[][] findPositions(int[][] matrix, int x, int repeated) {
        int _repeated = 0;
        int[][] positions = new int[2][repeated];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    positions[0][_repeated] = j + 1;
                    positions[1][_repeated] = i + 1;
                    _repeated++;
                }
            }
        }
        return positions;
    }

    public void exec(int[][] matrix, int[][] positions, int repeated, int x) {
        int total = repeated;
        int current = 0;

        for (int i = 0; i < repeated; i++) {
            current++;
            System.out
                    .println(ANSI_RED + "(" + current + "/" + total + ") x found at " + positions[0][i] + ", "
                            + positions[1][i] + ANSI_RESET);
        }
    }
}