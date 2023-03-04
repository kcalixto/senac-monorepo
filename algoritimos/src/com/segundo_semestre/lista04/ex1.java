package com.segundo_semestre.lista04;

import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        // 1) Implementação do quick-sort em java

        System.out.println("1) Implementação do quick-sort em java ");
        new ex1();
    }

    public ex1() {
        int arrToProcess[] = new int[] { 5, 4, 9, 7, 1, 8, 3, 2, 6 };
        System.out.println("\nArray Inicial:");
        printArr(arrToProcess);

        int arrayProcessed[] = load(arrToProcess);

        System.out.println("\nArray Final:");
        printArr(arrayProcessed);
    }

    public int[] load(int[] arrToProcess) {
        int arrLength = arrToProcess.length;
        if (arrLength == 0)
            return new int[] {};

        int pivot = arrToProcess[0];
        if (arrLength == 1)
            return new int[] { pivot };

        int leftsIndex = 0;
        int rightsIndex = 0;
        int temp_lefts[] = new int[arrLength];
        int temp_rights[] = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            if (arrToProcess[i] > pivot)
                temp_rights[rightsIndex++] = arrToProcess[i];
            if (arrToProcess[i] < pivot)
                temp_lefts[leftsIndex++] = arrToProcess[i];
        }

        int[] lessThanPivot = copyArray(temp_lefts, leftsIndex);
        int[] greaterThanPivot = copyArray(temp_rights, rightsIndex);

        // System.out.println("---------------");
        // System.out.println("pivot: " + pivot);
        // printArr(arrToProcess);
        // System.out.println();
        // printArr(lessThanPivot);
        // System.out.println();
        // printArr(greaterThanPivot);
        // System.out.println();
        // System.out.println("---------------");

        int arr[] = bindArrays(load(lessThanPivot), pivot, load(greaterThanPivot));
        return arr;
    }

    public void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public int[] copyArray(int[] newArr, int size) {
        if (size == -1) {
            size = newArr.length;
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = newArr[i];
        }
        return arr;
    }

    public int[] bindArrays(int[] arr1, int pivot, int[] arr2) {
        ArrayList<Integer> newArr = new ArrayList<>();

        for (Integer i : arr1) {
            newArr.add(i);
        }
        newArr.add(pivot);
        for (Integer i : arr2) {
            newArr.add(i);
        }

        int[] arr = new int[newArr.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr.get(i);
        }
        return arr;
    }

}