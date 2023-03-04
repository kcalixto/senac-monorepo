package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex15 {

    private static double MINIMUM_SALARY = 1000.00;
    private static double MINIMUM_SALARY_INCREMENT = 1.10;

    public static void main(String[] args) {
        // 15) Armazene num vetor de 5 posições o salário de 5 pessoas. Se o salário for
        // menor q 1000 reais, forneça um aumento de 10% e sobrescreva o valor antigo.
        // Ao final, mostre a lista de salários atualizada.

        System.out.println(
                " 15) Armazene num vetor de 5 posições o salário de 5 pessoas. Se o salário for menor q 1000 reais,   forneça um aumento de 10% e sobrescreva o valor antigo. Ao final, mostre a lista de salários   atualizada. ");

        new ex15();
    }

    public ex15() {
        int MAX = 5;
        double[] salaries = new double[MAX];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = ask(input, i + 1, salaries.length);
        }

        System.out.println("\nSalários:");
        print(salaries);

        System.out.println("\nSalários Atualizados:");
        print(parseSalaries(salaries));
    }

    public double[] parseSalaries(double[] salaries) {
        double[] parsedSalaries = new double[salaries.length];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] < MINIMUM_SALARY) {
                parsedSalaries[i] = salaries[i] * MINIMUM_SALARY_INCREMENT;
            } else {
                parsedSalaries[i] = salaries[i];
            }
        }

        return parsedSalaries;
    }

    public double ask(Scanner input, int index, int total) {
        try {
            System.out.print("Digite o salário (" + index + "/" + total + "): ");
            return Double.parseDouble(input.nextLine());
        } catch (Exception e) {
            return ask(input, index, total);
        }
    }

    public void print(double[] arr) {
        for (double i : arr) {
            System.out.print(i + " ");
        }
    }
}