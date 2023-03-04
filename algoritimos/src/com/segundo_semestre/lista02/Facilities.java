package com.segundo_semestre.lista02;

import java.util.Scanner;

public abstract class Facilities {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public int askInt(Scanner input, int index, int total) {
        try {
            System.out.println("Digite um número(" + index + "/" + total + "): ");
            String str = input.nextLine();
            return Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("Algo deu errado! Tente novamente.");
            return askInt(input, index, total);
        }
    }

    public String getIntArrayString(int[] arr) {
        String str = "";

        for (int i : arr) {
            str += i + " ";
        }

        return str;
    }

    public int[][] buildIntMatrix(int n, int m) {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        return matrix;
    }

    public void printIntMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void printIntMatrixEnhanced(int[][] matrix, int[][] enhance) {
        int enhanced = 0;
        // 0 = j
        // 1 = i
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (enhanced < enhance[0].length) {
                    if (j == (enhance[0][enhanced] - 1) && i == (enhance[1][enhanced] - 1)) {
                        enhanced++;
                        System.out.print(ANSI_RED + " " + matrix[i][j] + ANSI_RESET);
                    } else {
                        System.out.print(" " + matrix[i][j]);
                    }
                } else {
                    System.out.print(" " + matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    public int random() {
        return (int) (Math.random() * 10) + 1;
    }

    public int getRandom(int n) {
        return (int) (Math.random() * n) + 1;
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
}
