package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // 1) Preenche um array de tamanho 10 com números lidos pelo teclado

        System.out.println("1) Preenche um array de tamanho 10 com números lidos pelo teclado ");

        int MAX = 10;

        Scanner input = new Scanner(System.in);
        int[] nums = new int[MAX];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ask(input);
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