package pi.ado14;

import java.util.Scanner;

public class ADO14_01 {
    public static char matriz[][] = new char[3][3];

    public static final char EMPTY = ' ';

    public static void main(String[] args) {
        int numeroDeJogadas = 0;
        char resultado = ' ';
        inicializaMatriz();
        do {
            imprimeMatriz();
            jogadaDoUsuario(1, 'X');
            numeroDeJogadas++;
            resultado = verificaVencedor();
            // Verifica se o jogador 1 venceu ou se já foram 9 jogadas
            if (resultado == 'X' || numeroDeJogadas == 9)
                break;
            imprimeMatriz();
            jogadaDoUsuario(2, 'O');
            numeroDeJogadas++;
            resultado = verificaVencedor();
            // Verifica se o jogador 2 venceu
            if (resultado == 'O')
                break;
        } while ((resultado == ' ') && (numeroDeJogadas != 9));
        imprimeMatriz();
        if (resultado == 'X')
            System.out.println("Jogador 1 ganhou!");
        else if (resultado == 'O')
            System.out.println("Jogador 2 ganhou!");
        else
            System.out.println("O jogo empatou!!!");
    }

    public static void inicializaMatriz() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matriz[i][j] = ' ';
    }

    public static void imprimeMatriz() {
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %c | %c | %c ",
                    matriz[i][0], matriz[i][1], matriz[i][2]);
            if (i != 2)
                System.out.printf("\n---|---|---\n");
        }
        System.out.printf("\n");
    }

    public static void jogadaDoUsuario(int usuario, char simbolo) {
        System.out.println("jogador - " + usuario);
        System.out.print("Digite uma Posição: ");
        Scanner input = new Scanner(System.in);
        action(ask(input), simbolo);

        System.out.printf("\n\n");
    }

    public static void action(int place, char simbolo) {
        if (place <= 3) {
            matriz[0][place - 1] = simbolo;
            System.out.println((place - 1) + ", " + 0);
        } else if (place <= 6) {
            matriz[1][place - 4] = simbolo;
            System.out.println((place - 4) + ", " + 1);
        } else {
            matriz[2][place - 7] = simbolo;
            System.out.println((place - 6) + ", " + 2);
        }
    }

    public static int ask(Scanner input) {
        try {
            int value = Integer.parseInt(String.valueOf(input.nextLine().charAt(0)));
            if (isValid(value)) {
                return value;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("Posição inválida. Tente novamente!");
            return ask(input);
        }
    }

    public static boolean isValid(int place) {
        if (place <= 3) {
            if (matriz[0][place - 1] == EMPTY) {
                return true;
            }
        } else if (place <= 6) {
            if (matriz[1][place - 4] == EMPTY) {
                return true;
            }
        } else {
            if (matriz[2][place - 7] == EMPTY) {
                return true;
            }
        }
        return false;
    }

    public static char verificaVencedor() {
        // Verifica as linhas
        for (int i = 0; i < 3; i++)
            if (matriz[i][0] == matriz[i][1] && matriz[i][0] == matriz[i][2])
                return matriz[i][0];
        // Verifica as colunas
        for (int i = 0; i < 3; i++)
            if (matriz[0][i] == matriz[1][i] && matriz[0][i] == matriz[2][i])
                return matriz[0][i];
        // Verifica diagonais
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2])
            return matriz[0][0];
        if (matriz[2][0] == matriz[1][1] && matriz[1][1] == matriz[0][2])
            return matriz[0][2];
        // Se não encontrou vencedor, retorna "espaço"
        return ' ';
    }
}
