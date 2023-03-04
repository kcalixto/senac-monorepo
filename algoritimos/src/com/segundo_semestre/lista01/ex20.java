package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        // 20) Leia dois vetores de inteiros x e y, cada um com 5 elementos (assuma que
        // o usuário não informa elementos repetidos). Calcule e mostre os vetores
        // resultantes em cada caso abaixo:
        // • Soma entre x e y: soma de cada elemento de x com o elemento da mesma
        // posição em y.
        // • Produto entre x e y: multiplicação de cada elemento de x com o elemento da
        // mesma posição em y.
        // • Diferença entre x e y: todos os elementos de x que não ex20istam em y.
        // • Interseção entre x e y: apenas os elementos que aparecem nos dois vetores.
        // • União entre x e y: todos os elementos de x, e todos os elementos de y que
        // não estão em x.

        System.out.println(
                " 20) Leia dois vetores de inteiros x e y, cada um com 5 elementos (assuma que o usuário não informa   elementos repetidos). Calcule e mostre os vetores resultantes em cada caso abaixo:   • Soma entre x e y: soma de cada elemento de x com o elemento da mesma posição em y.   • Produto entre x e y: multiplicação de cada elemento de x com o elemento da mesma   posição em y.   • Diferença entre x e y: todos os elementos de x que não ex20istam em y.   • Interseção entre x e y: apenas os elementos que aparecem nos dois vetores.   • União entre x e y: todos os elementos de x, e todos os elementos de y que não estão em   x. ");
        new ex20();
    }

    public ex20() {
        int MAX = 5;
        Double[] vet1 = new Double[MAX];
        Double[] vet2 = new Double[MAX];
        Scanner input = new Scanner(System.in);

        System.out.println("Informe os valores do vet1: ");
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = ask(input, i + 1, vet1.length, vet1);
        }

        System.out.println("Informe os valores do vet2: ");
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = ask(input, i + 1, vet2.length, vet2);
        }

        System.out.println("\nSoma entre x e y:");
        for (int i = 0; i < vet1.length; i++) {
            System.out.print(vet1[i] + " + " + vet2[i] + " = " + (vet1[i] + vet2[i]) + "   ");
        }

        System.out.println("\nProduto entre x e y:");
        for (int i = 0; i < vet1.length; i++) {
            System.out.print(vet1[i] + " * " + vet2[i] + " = " + (vet1[i] * vet2[i]) + "   ");
        }

        System.out.println("\nDiferença entre x e y:");
        print(findDifference(vet1, vet2));

        System.out.println("\nTodos os elementos de x que não estão em y:");
        print(findUnion(vet1, vet2));

    }

    public Double[] findUnion(Double[] v1, Double[] v2) {
        int uncommomAmount = 0;
        Double[] tempArr = new Double[v1.length + v2.length];
        for (Double d1 : v1) {
            boolean doesValuesExists = false;
            for (Double d2 : v2) {
                if (d1.equals(d2)) {
                    doesValuesExists = true;
                }
            }
            if (!doesValuesExists) {
                if (isValidNumber(d1, tempArr)) {
                    tempArr[uncommomAmount] = d1;
                    uncommomAmount++;
                }
            }
        }

        Double[] finalArr = new Double[uncommomAmount];

        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = tempArr[i];
        }

        return finalArr;
    }

    public Double[] findDifference(Double[] v1, Double[] v2) {
        int uncommomAmount = 0;
        Double[] tempArr = new Double[v1.length + v2.length];
        for (Double d1 : v1) {
            boolean doesValuesExists = false;
            for (Double d2 : v2) {
                if (d1.equals(d2)) {
                    doesValuesExists = true;
                }
            }
            if (!doesValuesExists) {
                if (isValidNumber(d1, tempArr)) {
                    tempArr[uncommomAmount] = d1;
                    uncommomAmount++;
                }
            }
        }

        for (Double d2 : v2) {
            boolean doesValuesExists = false;
            for (Double d1 : v1) {
                if (d2.equals(d1)) {
                    doesValuesExists = true;
                }
            }
            if (!doesValuesExists) {
                if (isValidNumber(d2, tempArr)) {
                    tempArr[uncommomAmount] = d2;
                    uncommomAmount++;
                }
            }
        }

        Double[] finalArr = new Double[uncommomAmount];

        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = tempArr[i];
        }

        return finalArr;
    }

    public void print(Double[] arr) {
        for (Double i : arr) {
            System.out.print(i + " ");
        }
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

}