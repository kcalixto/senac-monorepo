package com.segundo_semestre.lista03;

public class ex7 extends Facilities {
    public static void main(String[] args) {
        // 7) Crie um algoritmo em Java para montar a matriz A (4 x 3), composta de
        // números inteiros. Depois, crie uma função que recebe a matriz A como
        // parâmetro e calcula a sua transposta em uma matriz B usando laços.
        // A
        // transposta é quando o número da coluna de A passa a ser o número da linha de
        // B. Ao final, a função devolve a matriz B.

        System.out.println(
                " 7) Crie um algoritmo em Java para montar a matriz A (4 x 3), composta de números inteiros.   Depois, crie uma função que recebe a matriz A como parâmetro e calcula a sua transposta em   uma matriz B usando laços. A transposta é quando o número da coluna de A passa a ser o   número da linha de B. Ao final, a função devolve a matriz B. ");
        new ex7();
    }

    public ex7() {
        int[][] a = buildIntMatrix(4, 3);

        System.out.println("A: ");
        printIntMatrix(a);
        System.out.println("B: ");
        printIntMatrix(exec(a));
    }

    public int[][] exec(int[][] a) {
        int[][] b = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }

        return b;
    }
}