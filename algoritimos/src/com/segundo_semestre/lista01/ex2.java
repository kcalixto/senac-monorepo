package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // 2) Preenche um array de tamanho 10 com números lidos pelo teclado e mostre os
        // valores lidos

        System.out.println(
                " 2) Preenche um array de tamanho 10 com números lidos pelo teclado e mostre os valores lidos ");

        int MAX = 10;

        Scanner input = new Scanner(System.in);
        int[] nums = new int[MAX];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ask(input);
        }

        System.out.println("\nNúmeros:");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static int ask(Scanner input) {
        try {
            System.out.print("Digite um número: ");
            return Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            return ask(input);
        }
    }
}