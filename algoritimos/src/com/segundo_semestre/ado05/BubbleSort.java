package com.segundo_semestre.ado05;

public class BubbleSort {
    public static void main(String[] args) {
        new BubbleSort();
    }

    public BubbleSort() {
        int[] arr = newArray(15);
        System.out.println("\nOriginal Array: ");
        System.out.println(getIntArrayString(arr));

        bubbleSort(arr);
        System.out.println("\nSorted Array: ");
        System.out.println(getCustomArr(arr));
    }

    public String getIntArrayString(int[] arr) {
        String str = "";

        for (int i : arr) {
            str += i + " ";
        }

        return str;
    }

    public String getCustomArr(int[] arr) {
        String str = "";

        boolean addedBar = false;
        for (int i : arr) {
            if (i % 2 == 0 && !addedBar) {
                str += "| ";
                addedBar = true;
            }
            str += i + " ";
        }

        return str;
    }

    public static void bubbleSort(int[] arr) {
        int aux = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                boolean isEvenNumber = arr[j] % 2 == 0;

                if (isEvenNumber) {
                    boolean haveMinimumSpaceToChanges = (j + 1) <= arr.length;
                    if (haveMinimumSpaceToChanges) {
                        aux = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = aux;
                    }
                } else {
                    boolean haveMinimumSpaceToChanges = (j - 1) > 0;
                    if (haveMinimumSpaceToChanges) {
                        aux = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = aux;
                    }
                }
            }
        }
    }

    public int[] newArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        return arr;
    }
}
