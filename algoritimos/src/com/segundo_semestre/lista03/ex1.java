package com.segundo_semestre.lista03;

public class ex1 extends Facilities {
    public static void main(String[] args) {
        // 1) Função que recebe um vetor de inteiro x e inteiro n ( 0< n <=100) e
        // devolve o índice onde este valor é encontrado no vetor ou -1 se não for
        // encontrado.

        System.out.println(
                "1) Função que recebe um vetor de inteiro x e inteiro n ( 0< n <=100) e devolve o índice onde este   valor é encontrado no vetor ou -1 se não for encontrado. ");

        new ex1();

    }

    public ex1() {
        int n = (int) (Math.random() * 100);

        int[] x = new int[25];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 100);
        }

        int index = exec(x, n);

        System.out.printf("%d found at %d in this array:\n%s", n, index, getIntArrayString(x));
    }

    public int exec(int[] x, int n) {
        int index = -1;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == n) {
                index = i - 1;
                break;
            }
        }

        return index;
    }
}