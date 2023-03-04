package com.segundo_semestre.ado04;

import java.util.Scanner;

public class recursively {
    public static void main(String args[]) {
        new recursively();
    }

    public recursively() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Factorial calculator\nDigite um número: ");
            String str = input.nextLine();
            int n = Integer.parseInt(str);

            System.out.println("factorial of " + n + " = " + factorial(n));
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
            System.exit(0);
        }
    }

    public int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        }
        return n;
    }
}
