package com.segundo_semestre.ado03;

public class functions {
    public static void main(String args[]) {
        new functions();
    }

    public functions() {
        // Crie uma função com dois parâmetros numéricos capaz de verificar qual número
        // é o maior e retorná-lo
        System.out.println("\nex 01:");
        int someRandom = (int) (Math.random() * 10);
        int otherRandom = (int) (Math.random() * 10);
        System.out.printf("Maior valor entre %d e %d: %d", someRandom, otherRandom, getBigger(someRandom, otherRandom));
        // Crie uma função com parâmetro capaz de verificar se um número é par ou ímpar
        System.out.println("\n\nex 02:");
        System.out.printf("%d é par? %b", someRandom, isOdd(someRandom));
        // Crie uma função capaz de calcular o resultado para a função matemática abaixo
        // (a função deve receber “x” e retornar a resposta)
        System.out.println("\n\nex 03:");
        System.out.println(""
                + "        {|x + 2|, se x < -1\n"
                + "f(x) =  {x² - 4, se -1 <= x <= 2\n"
                + "        {2x - 1, se x > 2\n");
        int x = (int) ((Math.random() * 10) - 5);
        System.out.printf("x = %d \n", x);
        calcX(x);
    }

    public int getBigger(int a, int b) {
        return Math.max(a, b);
    }

    public boolean isOdd(int a) {
        return (a % 2 == 0);
    }

    public int calcX(int x) {
        int response = 0;
        if (x < -1) {
            response = x + 2;
            System.out.printf("%d + 2 = %d", x, response);
        } else if (x > 2) {
            response = (x * 2) - 1;
            System.out.printf("2x%d - 1 = %d", x, response);
        } else {
            response = (x * x) - 4;
            System.out.printf("%d² - 4 = %d", x, response);
        }
        return response;
    }
}
