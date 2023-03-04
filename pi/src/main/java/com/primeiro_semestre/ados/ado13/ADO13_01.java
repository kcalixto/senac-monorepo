package pi.ado13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ADO13_01 {

    public final String spacing = " ";
    public final String CANT_MOVE_PRINT = "Parece que não é possível mover aí.";

    public final int FREE_SPACE = 0;

    public static final int UP = 8;
    public static final int LEFT = 4;
    public static final int DOWN = 5;
    public static final int RIGHT = 6;

    public static final Map<String, Integer> INPUT = new HashMap<String, Integer>();
    static {
        INPUT.put("s", UP);
        INPUT.put("d", LEFT);
        INPUT.put("w", DOWN);
        INPUT.put("a", RIGHT);
    }

    public int attempt = 0;
    public int[][] board = new int[3][3];

    public final int[][] wonBoard = {
            { 0, 1, 2 },
            { 3, 4, 5 },
            { 6, 7, 8 },
    };
    public final int[][] wonBoard2 = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 0 },
    };

    public void init() {
        print("JOGO DO QUINZE");
        print("REGRAS");
        System.out.println(
                "1) Utilize W(cima), A (esquerda), S(baixo) e D(direita) para declarar seu movimento. ENTER para confirmar");
        System.out
                .println("2) Só será aceito 1 movimento por vez. Independente da quantidade de caracteres declarados.");
        System.out.println();
        try (Scanner input = new Scanner(System.in)) {
            loadBoard();
            while (running()) {
                print("JOGO DO QUINZE");
                System.out.println();
                showBoard();
                // Action input
                updateBoard(ask(input));
                System.out.println("\n\n");
            }

        } catch (Exception e) {
            System.out.println("Algo deu errado... Tente novamente!");
            System.out.println("ERR: " + e);
        }

    }

    public int ask(Scanner input) {
        System.out.print("Movimento: ");
        try {
            int value = INPUT.get(String.valueOf(input.nextLine().charAt(0)).toLowerCase());
            return value;
        } catch (Exception e) {
            return ask(input);
        }
    }

    public void loadBoard() {
        ArrayList<Integer> available = new ArrayList<Integer>();
        for (int i = 0; i <= 8; i++) {
            available.add(i);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int random = (int) (Math.random() * available.size());
                board[i][j] = available.get(random);
                available.remove(random);
            }
        }
    }

    public boolean running() {
        attempt++;

        if (checkBoard()) {
            endGame(true);
            return false;
        } else {
            return true;
        }

    }

    public void updateBoard(int action) {
        int[] spot = getFreeSpot();
        int x = 1;
        int y = 0;
        int target = 0;

        switch (action) {
            case UP:
                if (canMove(UP)) {
                    target = board[spot[y] - 1][spot[x]];
                    board[spot[y]][spot[x]] = target;
                    board[spot[y] - 1][spot[x]] = 0;
                    System.out.println("Cima");
                } else {
                    print(CANT_MOVE_PRINT);
                }
                break;
            case DOWN:
                if (canMove(DOWN)) {
                    target = board[spot[y] + 1][spot[x]];
                    board[spot[y]][spot[x]] = target;
                    board[spot[y] + 1][spot[x]] = 0;
                    System.out.println("Baixo");
                } else {
                    print(CANT_MOVE_PRINT);
                }
                break;
            case LEFT:
                if (canMove(LEFT)) {
                    target = board[spot[y]][spot[x] - 1];
                    board[spot[y]][spot[x]] = target;
                    board[spot[y]][spot[x] - 1] = 0;
                    System.out.println("Esquerda");
                } else {
                    print(CANT_MOVE_PRINT);
                }
                break;
            case RIGHT:
                if (canMove(RIGHT)) {
                    target = board[spot[y]][spot[x] + 1];
                    board[spot[y]][spot[x]] = target;
                    board[spot[y]][spot[x] + 1] = 0;
                    System.out.println("Direita");
                } else {
                    print(CANT_MOVE_PRINT);
                }
                break;
        }
    }

    public boolean canMove(int action) {
        boolean up = true, down = true, left = true, right = true;

        int[] spot = getFreeSpot();
        int x = 1;
        int y = 0;
        int size = 3 - 1;

        int w = spot[x];
        int h = spot[y];

        if (w == size) {
            right = false;
        }
        if (w == 0) {
            left = false;
        }
        if (h == 0) {
            up = false;
        }
        if (h == size) {
            down = false;
        }

        switch (action) {
            case UP:
                return up;
            case DOWN:
                return down;
            case LEFT:
                return left;
            case RIGHT:
                return right;

            default:
                System.out.println("error!");
                return false;
        }
    }

    public int[] getFreeSpot() {
        int[] spot = new int[2];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == FREE_SPACE) {
                    spot[0] = i;
                    spot[1] = j;
                    break;
                }
            }
        }
        return spot;
    }

    public void showBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + spacing);
            }
            System.out.println();
        }
    }

    public boolean checkBoard() {
        boolean flag = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != wonBoard[i][j] && board[i][j] != wonBoard2[i][j]) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;

        // if (board == wonBoard || board == wonBoard2) {
        // return true;
        // } else {
        // return false;
        // }
    }

    public void endGame(boolean win) {
        System.out.println();
        if (win) {
            System.out.println("****PARABÉNS, VOCÊ GANHOU*****");
        } else {
            System.out.println("*********FIM DE JOGO**********");
        }
        System.out.println("*****SUA PONTUAÇÂO: " + attempt + " *****");
        showBoard();
        System.exit(0);
    }

    public void print(String arg) {
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

    public static void main(String[] args) {
        ADO13_01 ado = new ADO13_01();
        ado.init();
    }
}
