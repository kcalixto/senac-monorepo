package com.segundo_semestre.lista04;

public class ex2 {
    public static void main(String[] args) {
        // 2) Implementar o Insertion Sort em java

        System.out.println(" 2) Implementar o Insertion Sort em java ");

        new ex2();
    }

    public ex2() {
        int arr[] = new int[] { 5, 2, 4, 6, 1, 3 };

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            int x = arr[j];
            while (j > 0 && x < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = x;
        }

        printArr(arr);
    }

    public void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}