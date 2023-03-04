package com.segundo_semestre.lista02;

import java.util.Scanner;

public class ex10 extends Facilities {
    public static void main(String[] args) {
        // 10) Faça um programa que solicite o tamanho da matriz (MxM), e monte as
        // seguintes matrizes abaixo (considerando aqui no exemplo uma matriz 4 x 4).
        // Imprima cada matriz no formato informado abaixo (obs – encontrar a condição
        // para popular o valor e não carregar os valores na posição)

        System.out.println(
                " 10) Faça um programa que solicite o tamanho da matriz (MxM), e monte as seguintes matrizes   abaixo (considerando aqui no ex10emplo uma matriz 4 x 4). Imprima cada matriz no formato   informado abaixo (obs – encontrar a condição para popular o valor e não carregar os valores na   posição) ");
        new ex10();
    }

    public ex10() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz.");
        // int size = askInt(input, 1, 1);
        int size = 4;

        exec(size, input);
    }

    public void exec(int size, Scanner input) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        printIntMatrix(matrix);
        System.out.println("------------------------------------");
        A(matrix);
        System.out.println("------------------------------------");
        B(matrix);
        System.out.println("------------------------------------");
        C(matrix);
        System.out.println("------------------------------------");
        D(matrix);
        System.out.println("------------------------------------");
        E(matrix);
    }

    public void A(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print("\t" + matrix[i][j]);
                } else {
                    System.out.print("\t ");
                }
            }
            System.out.println();
        }
    }

    public void B(int[][] matrix) {
        int limit = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == limit) {
                    System.out.print("\t" + matrix[i][j]);
                    limit--;
                } else {
                    System.out.print("\t ");
                }
            }
            System.out.println();
        }
    }

    public void C(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == matrix.length - 1 || j == matrix[i].length - 1) {
                    System.out.print("\t" + matrix[i][j]);
                } else if (i == 0 || j == 0) {
                    System.out.print("\t" + matrix[i][j]);
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public void D(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j <= i) {
                    System.out.print("\t" + matrix[i][j]);
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public void E(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j >= i) {
                    System.out.print("\t" + 0);
                } else {
                    System.out.print("\t" + matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}