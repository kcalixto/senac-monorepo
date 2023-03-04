package pi.ado15;

import java.util.Scanner;

public class ADO15_01 {
    public static int vetorDeSudokus[][][] = {
            {
                    { 1, 2, 3, 4 },
                    { 4, 3, 2, 1 },
                    { 3, 4, 1, 2 },
                    { 2, 1, 4, 3 }
            },
            {
                    { 2, 1, 4, 3 },
                    { 3, 4, 1, 2 },
                    { 1, 2, 3, 4 },
                    { 4, 3, 2, 1 }
            },
            {
                    { 3, 4, 1, 2 },
                    { 2, 1, 4, 3 },
                    { 4, 3, 2, 1 },
                    { 1, 2, 3, 4 }
            },
            {
                    { 4, 3, 1, 2 },
                    { 1, 2, 4, 3 },
                    { 3, 4, 2, 1 },
                    { 2, 1, 3, 4 }
            }
    };

    public static void main(String[] args) {
        int matrizDoSudoku[][] = new int[4][4];
        jogarSudoku(matrizDoSudoku);
    }

    public static void sorteiaSudoku(int matriz[][], int vetorDeMatrizes[][][]) {
        int t = (int) Math.random() * vetorDeMatrizes.length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = vetorDeMatrizes[t][i][j];
            }
        }
    }

    public static void imprimeSudoku(int matriz[][]) {
        System.out.println("|---|---|---|---|");
        for (int i = 0; i < 4; i++) {
            System.out.print("|");
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == 0) {
                    System.out.print("   |");
                } else
                    System.out.print(" " + matriz[i][j] + " |");
            }
            System.out.println("\n|---|---|---|---|");
        }
    }

    public static void setaNivelDoSukoku(int n, int matriz[][]) {
        int i, j, contador = 0;
        switch (n) {
            case 1: // Nível fácil
                do {
                    i = (int) (Math.random() * 4);
                    j = (int) (Math.random() * 4);
                    if (matriz[i][j] != 0) {
                        matriz[i][j] = 0;
                        contador++;
                    }
                } while (contador < 4);
                break;
            case 2: // Nível médio
                do {
                    i = (int) (Math.random() * 4);
                    j = (int) (Math.random() * 4);
                    if (matriz[i][j] != 0) {
                        matriz[i][j] = 0;
                        contador++;
                    }
                } while (contador < 8);
                break;
            case 3: // Nível difícil
                do {
                    i = (int) (Math.random() * 4);
                    j = (int) (Math.random() * 4);
                    if (matriz[i][j] != 0) {
                        matriz[i][j] = 0;
                        contador++;
                    }
                } while (contador < 12);
                break;
            default:
                System.out.println("Opções válidas: 1 (fácil), 2 (médio) e 3 (difícil)");
        }
    }

    public static boolean verificaSudoku(int matriz[][]) {
        // Verifica linhas
        for (int i = 0; i < 4; i++)
            if ((matriz[i][0] + matriz[i][1] + matriz[i][2] + matriz[i][3]) != 10)
                return false;
        // Verifica colunas
        for (int j = 0; j < 4; j++)
            if ((matriz[0][j] + matriz[1][j] + matriz[2][j] + matriz[3][j]) != 10)
                return false;
        // Verifica submatriz
        if ((matriz[0][0] + matriz[0][1] + matriz[1][0] + matriz[1][1]) != 10)
            return false;
        // Verifica submatriz
        if ((matriz[0][2] + matriz[0][3] + matriz[1][2] + matriz[1][3]) != 10)
            return false;
        // Verifica submatriz
        if ((matriz[2][0] + matriz[2][1] + matriz[3][0] + matriz[3][1]) != 10)
            return false;
        // Verifica submatriz
        if ((matriz[2][2] + matriz[2][3] + matriz[3][2] + matriz[3][3]) != 10)
            return false;

        return true;
    }

    public static boolean endGame(int matriz[][]) {
        for (int[] rows : matriz) {
            for (int i : rows) {
                if (i == 0) {
                    return false;
                }
            }
        }

        if (verificaSudoku(matriz)) {
            print("YOU WON");
            System.out.println("Parabéns, a solução do Sudoku está correta!");
            imprimeSudoku(matriz);
        } else {
            print("Game Over");
            System.out.println("A solução está incorreta!");
        }
        return true;
    }

    public static void jogarSudoku(int matriz[][]) {
        try (Scanner input = new Scanner(System.in)) {
            sorteiaSudoku(matriz, vetorDeSudokus);
            print("SUDOKU");
            setaNivelDoSukoku(askDifucult(input), matriz);
            do {
                imprimeSudoku(matriz);
                action(ask(input, matriz), matriz);
            } while (!endGame(matriz));

        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }

    public static int askDifucult(Scanner input) {
        System.out.println("Escolha o nível de dificuldade: (1 - Fácil, 2 - Médio, 3 - Difícil)");
        try {
            int value = Integer.parseInt(String.valueOf(input.nextLine().charAt(0)));
            if (value > 0 && value < 4) {
                return value;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("Número inválido. Tente novamente!");
            return askDifucult(input);
        }
    }

    public static int[] ask(Scanner input, int matriz[][]) {
        try {
            System.out.print("Linha: ");
            int line = Integer.parseInt(String.valueOf(input.nextLine().charAt(0)));
            System.out.print("Coluna: ");
            int col = Integer.parseInt(String.valueOf(input.nextLine().charAt(0)));
            System.out.print("Valor: ");
            int value = Integer.parseInt(String.valueOf(input.nextLine().charAt(0)));
            int[] data = new int[] { line - 1, col - 1, value };

            if (isValid(data, matriz)) {
                return data;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("Posição inválida. Tente novamente!\n");
            return ask(input, matriz);
        }
    }

    public static boolean isValid(int[] data, int matriz[][]) {
        for (int i : data) {
            if (i > 4) {
                return false;
            }
        }

        if (matriz[data[0]][data[1]] != 0) {
            return false;
        }

        return true;
    }

    public static void action(int[] data, int matriz[][]) {
        matriz[data[0]][data[1]] = data[2];
    }

    public static void print(String arg) {
        String newString = arg;
        int amount = 30 - arg.length();
        for (int i = 0; i < amount; i++) {
            if (i % 2 == 0) {
                newString += "*";
            } else {
                newString = "*" + newString;
            }
        }
        System.out.println(newString);
    }

}
