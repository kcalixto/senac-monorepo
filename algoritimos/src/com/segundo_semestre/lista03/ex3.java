package com.segundo_semestre.lista03;

public class ex3 extends Facilities {
    public static void main(String[] args) {
        // 3) Função que recebe um vetor de inteiro x e devolva a quantidade de números
        // impares encontrado no vetor x

        System.out.println(
                " 3) Função que recebe um vetor de inteiro x e devolva a quantidade de números impares   encontrado no vetor x ");

        new ex3();
    }

    public ex3() {
        int[] x = new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 100);
        }

        int odds = exec(x);

        System.out.printf("found %d odd numbers in this array:\n%s", odds, getIntArrayString(x));
    }

    public int exec(int[] x) {
        int odds = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 1) {
                odds++;
            }
        }

        return odds;
    }
}