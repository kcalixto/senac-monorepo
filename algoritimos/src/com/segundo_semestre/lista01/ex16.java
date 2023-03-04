package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        // 16) Faca um programa q leia n valores reais. Armazene estes valores num
        // vetor. Ao final, imprima a média aritmética destes valores

        System.out.println(
                " 16) Faca um programa q leia n valores reais. Armazene estes valores num vetor. Ao final, imprima a   média aritmética destes valores ");

        Scanner input = new Scanner(System.in);

        int MAX = askTotal(input);

        double[] arr = new double[MAX];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ask(input, i + 1, arr.length);
        }

        System.out.println("\nMédia aritimética: " + calc(arr));
    }

    public static double calc(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (sum / arr.length);
    }

    public static int askTotal(Scanner input) {
        try {
            System.out.print("Quantos números você quer inserir? ");
            return Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            return askTotal(input);
        }
    }

    public static Double ask(Scanner input, int index, int total) {
        try {
            System.out.print("Digite um número (" + index + "/" + total + "): ");
            return Double.parseDouble(input.nextLine());
        } catch (Exception e) {
            return ask(input, index, total);
        }
    }
}