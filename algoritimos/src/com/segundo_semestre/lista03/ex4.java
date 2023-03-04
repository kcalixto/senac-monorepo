package com.segundo_semestre.lista03;

public class ex4 extends Facilities {
    public static void main(String[] args) {
        // 4) Função que recebe um vetor de inteiro x e devolva a somatória dos valores
        // do índice par do vetor x

        System.out.println(
                " 4) Função que recebe um vetor de inteiro x e devolva a somatória dos valores do índice par do   vetor x ");
        new ex4();
    }

    public ex4() {
        int[] x = new int[4];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 100);
        }

        int sum = exec(x);

        System.out.printf("sum of pair indexes: %d \nin this array:\n%s", sum, getIntArrayString(x));
    }

    public int exec(int[] x) {
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            if (i % 2 == 0) {
                sum += x[i];
            }
        }

        return sum;
    }
}