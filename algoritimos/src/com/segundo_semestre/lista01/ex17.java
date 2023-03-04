package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        // 17) Faça um programa para ler 10 números DIFERENTES a serem armazenados em um
        // vetor. Os dados deverão ser armazenados no vetor na ordem que forem sendo
        // lidos, sendo que caso o usuário digite um número que já foi digitado
        // anteriormente, o programa deverá pedir para ele digitar outro número. Note
        // que cada valor digitado pelo usuário deve ser pesquisado no vetor,
        // verificando se ele ex17iste entre os números que já foram fornecidos. Exibir
        // na tela o vetor final que foi digitado

        System.out.println(
                " 17) Faça um programa para ler 10 números DIFERENTES a serem armazenados em um vetor. Os   dados deverão ser armazenados no vetor na ordem que forem sendo lidos, sendo que caso o   usuário digite um número que já foi digitado anteriormente, o programa deverá pedir para ele   digitar outro número. Note que cada valor digitado pelo usuário deve ser pesquisado no vetor,   verificando se ele ex17iste entre os números que já foram fornecidos. Exibir na tela o vetor final   que foi digitado ");
        new ex17();
    }

    public ex17() {
        int MAX = 10;
        Double[] nums = new Double[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ask(input, i + 1, nums.length, nums);
        }

        System.out.println("\nSeu vetor:");
        print(nums);
    }

    public boolean isValidNumber(Double value, Double[] arr) {
        for (Double n : arr) {
            if (value.equals(n)) {
                return false;
            }
        }
        return true;
    }

    public double ask(Scanner input, int index, int total, Double[] arr) {
        try {
            System.out.print("Digite um número (" + index + "/" + total + "): ");
            Double value = Double.parseDouble(input.nextLine());

            if (isValidNumber(value, arr)) {
                return value;
            } else {
                System.out.println("Esse valor não é válido, por favor tente novamente.");
                return ask(input, index, total, arr);
            }
        } catch (Exception e) {
            return ask(input, index, total, arr);
        }
    }

    public void print(Double[] arr) {
        for (Double i : arr) {
            System.out.print(i + " ");
        }
    }
}