package com.primeiro_semestre.lista01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        System.out.println("ex05 - Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.");

        int l;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de L: ");
        l = input.nextInt();

        System.out.println("A área de um quadrado de lado " + l + " é: " + (l * l));
    }
}
