package com.segundo_semestre.lista01;

public class ex14 {
    public static void main(String[] args) {
        // 14) Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele
        // possui.

        System.out.println(" 14) Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui. ");

        new ex14();
    }

    public ex14() {
        int[] arr = { 1, 0, 5, -2, -5, 7, 55, 62, 64, 3 };
        System.out.print("Array original: ");
        printInt(arr);

        printIntMatrix(findPair(arr));
    }

    public int[][] findPair(int[] arr) {
        int[] clone = new int[arr.length];

        int pairCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                clone[pairCount] = arr[i];
                pairCount++;
            }
        }

        int[] finalArr = new int[pairCount];
        for (int i = 0; i < pairCount; i++) {
            finalArr[i] = clone[i];
        }

        return new int[][] { finalArr, new int[] { pairCount } };
    }

    public static void printIntMatrix(int[][] arr) {
        System.out.println("\n\nTotal de pares: " + arr[1][0] + "\n");
        for (int i : arr[0]) {
            System.out.print(i + " ");
        }
    }

    public static void printInt(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}