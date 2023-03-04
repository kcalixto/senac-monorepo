package com.segundo_semestre.lista03;

public class ex2 extends Facilities {
    public static void main(String[] args) {
        // 2) Função que recebe um vetor de inteiro x e inteiro n ( 0< n <=100) e
        // devolve a quantidade de vezes que este valor foi encontrado no vetor ou o se
        // não for encontrado.

        System.out.println(
                " 2) Função que recebe um vetor de inteiro x e inteiro n ( 0< n <=100) e devolve a quantidade de   vezes que este valor foi encontrado no vetor ou o se não for encontrado. ");
        new ex2();
    }

    public ex2() {
        int n = (int) (Math.random() * 100);

        int[] x = new int[50];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 100);
        }

        int repeated = exec(x, n);

        System.out.printf("%d repeated %d times in this array:\n%s", n, repeated, getIntArrayString(x));
    }

    public int exec(int[] x, int n) {
        int repeated = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == n) {
                repeated++;
            }
        }

        return repeated;
    }

}