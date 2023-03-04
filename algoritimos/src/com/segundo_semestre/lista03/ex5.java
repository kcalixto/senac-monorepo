package com.segundo_semestre.lista03;

public class ex5 extends Facilities {
    public static void main(String[] args) {
        // 5) Desenvolva uma função que recebe um caráter, um número de linhas e colunas
        // como argumento, e devolve uma matriz do tamanho dado pelo número de linhas e
        // colunas, preenchida com o caracter recebido.

        System.out.println(
                " 5) Desenvolva uma função que recebe um caráter, um número de linhas e colunas como   argumento, e devolve uma matriz do tamanho dado pelo número de linhas e colunas,   preenchida com o caracter recebido. ");
        new ex5();
    }

    public ex5() {
        char c = 'a';
        int line = (int) (Math.random() * 10);
        int col = (int) (Math.random() * 10);

        char[][] matrix = exec(c, line, col);

        System.out.printf("%d lines, %d columns\n", line, col);
        printCharMatrix(matrix);
    }

    public char[][] exec(char c, int line, int col) {
        char[][] matrix = new char[line][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = c;
            }
        }

        return matrix;
    }
}