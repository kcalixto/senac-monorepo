package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // 5) Modifique o ex5ercício 3 de forma que o conteúdo de vet1 seja copiado para
        // vet2 de forma invertida. Veja o ex5emplo: Detalhe: o programa deve ser
        // genérico de forma que independente do tamanho do vetor, a inversão será
        // realizada corretamente.

        System.out.println(
                " 5) Modifique o ex5ercício 3 de forma que o conteúdo de vet1 seja copiado para vet2 de forma   invertida. Veja o ex5emplo:   Detalhe: o programa deve ser genérico de forma que independente do tamanho do vetor, a   inversão será realizada corretamente. ");

        int MAX = 6;
        int[] vet1 = new int[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = ask(input);
        }

        System.out.println("\nVet1:");
        print(vet1);
        System.out.println("\nVet2:");
        int[] vet2 = clone(vet1);
        print(vet2);
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] clone(int[] vet1) {
        int[] vet2 = new int[vet1.length];

        for (int i = vet1.length - 1, j = 0; i >= 0; i--, j++) {
            vet2[j] = vet1[i];
        }

        return vet2;
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