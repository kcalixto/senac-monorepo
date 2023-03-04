package com.segundo_semestre.ado06;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        new BinarySearch();
    }

    public BinarySearch() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        Scanner input = new Scanner(System.in);
        int n = askInt(input);
        Arrays.sort(arr);

        System.out.println(getIntArrayString(arr) + "\n");
        System.out.println(n + " found at: " + search(arr, n, 0, arr.length));
    }

    public String getIntArrayString(int[] arr) {
        String str = "";

        for (int i : arr) {
            str += i + " ";
        }

        return str;
    }

    public int search(int[] arr, int key, int min, int max) {
        int middle = min + ((max - min) / 2);

        if (max >= min) {
            System.out.println(key + " not found");
            return -1;
        }

        if (key == arr[middle]) {
            return middle;
        } else if (key < arr[middle]) {
            return search(arr, key, min, middle - 1);
        } else {
            return search(arr, key, middle + 1, max);
        }
    }

    public int askInt(Scanner input) {
        try {
            System.out.println("Digite um número: ");
            String str = input.nextLine();
            return Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("Algo deu errado! Tente novamente.");
            return askInt(input);
        }
    }

}
