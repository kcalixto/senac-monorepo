package com.segundo_semestre.lista01;

public class ex13 {
    public static void main(String[] args) {
        // 13) Ler um conjunto de números reais, armazenando-o em vetor e calcular o
        // quadrado das componentes deste vetor, armazenando o resultado em outro vetor.
        // Os conjuntos tem 10 elementos cada. Imprimir todos os conjuntos.

        System.out.println(
                " 13) Ler um conjunto de números reais, armazenando-o em vetor e calcular o quadrado das   componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem 10   elementos cada. Imprimir todos os conjuntos. ");

        new ex13();

    }

    public ex13() {
        int MAX = 10;
        Double[] arr = new Double[MAX];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
        }

        System.out.println("\nValores:");
        print(arr);
        System.out.println("\nQuadrado: ");
        print(calc(arr));
    }

    public void print(Double[] arr) {
        for (Double i : arr) {
            System.out.print(i + " ");
        }
    }

    public Double[] calc(Double[] arr) {
        Double[] calc = new Double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            calc[i] = Math.pow(arr[i], 2);
        }
        return calc;
    }
}