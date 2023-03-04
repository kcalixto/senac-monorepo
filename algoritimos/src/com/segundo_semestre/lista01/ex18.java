package com.segundo_semestre.lista01;

import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {
        // 18) Faca um programa q pergunte ao usuário o número de alunos a ser lido. O
        // tamanho dos vetores será o número informado pelo usuário. Armazene em um
        // vetor o nome do aluna, em outro vetor as notas Prova1 destes alunos; num
        // outro vetor, armazene as notas Prova2 destes alunos. Ambas notas, Prova1 e
        // Prova2, são informadas pelo usuário. Calcule a média aritmética destes alunos
        // e armazene num quarto vetor. Ao final, mostre o nome do aluno, a nota da
        // prova 1, a nota da prova 2 e a média, para todos do vetor.

        /*
         * Nome, Prova1, Prova2, Média
         */

        System.out.println(
                " 18) Faca um programa q pergunte ao usuário o número de alunos a ser lido. O tamanho dos vetores   será o número informado pelo usuário. Armazene em um vetor o nome do aluna, em outro   vetor as notas Prova1 destes alunos; num outro vetor, armazene as notas Prova2 destes alunos.   Ambas notas, Prova1 e Prova2, são informadas pelo usuário. Calcule a média aritmética destes   alunos e armazene num quarto vetor. Ao final, mostre o nome do aluno, a nota da prova 1, a   nota da prova 2 e a média, para todos do vetor. ");
        new ex18();
    }

    public ex18() {
        Scanner input = new Scanner(System.in);

        int MAX = askTotal(input);

        String[] names = new String[MAX];
        Double[] test_one = new Double[MAX];
        Double[] test_two = new Double[MAX];
        Double[] grades = new Double[MAX];

        for (int i = 0; i < MAX; i++) {
            names[i] = askName(input, i + 1, MAX);
            test_one[i] = askTestOne(input, i + 1, MAX, names[i]);
            test_two[i] = askTestTwo(input, i + 1, MAX, names[i]);
            grades[i] = calcGrade(names[i], test_one[i], test_two[i]);
        }

        for (int i = 0; i < MAX; i++) {
            System.out.println("\n" + names[i] + " tirou " + test_one[i] + " na prova1, " + test_two[i]
                    + " na prova2, logo ficou com " + grades[i] + " de média em 2022.");
        }

    }

    public static int askTotal(Scanner input) {
        try {
            System.out.print("Quantos alunos você quer inserir? ");
            return Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            return askTotal(input);
        }
    }

    public static String askName(Scanner input, int index, int total) {
        try {
            System.out.print("Digite o Nome de aluno(a) " + index + "/" + total + " : ");
            return input.nextLine();
        } catch (Exception e) {
            return askName(input, index, total);
        }
    }

    public static Double askTestOne(Scanner input, int index, int total, String name) {
        try {
            System.out.print("Digite a nota de " + name + " na prova1: ");
            return Double.parseDouble(input.nextLine());
        } catch (Exception e) {
            return askTestOne(input, index, total, name);
        }
    }

    public static Double askTestTwo(Scanner input, int index, int total, String name) {
        try {
            System.out.print("Digite a nota de " + name + " na prova2: ");
            return Double.parseDouble(input.nextLine());
        } catch (Exception e) {
            return askTestTwo(input, index, total, name);
        }
    }

    public static Double calcGrade(String name, Double prova1, Double prova2) {
        return (Double) ((prova1 + prova2) / 2);
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
