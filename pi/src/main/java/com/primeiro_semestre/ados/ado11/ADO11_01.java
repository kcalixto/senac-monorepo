package pi.ado11;

import java.util.Scanner;

public class ADO11_01 {

    public static final int BOMB = -1;
    public static final int FREE = 0;
    public static final int PATH = 1;
    public static final String BOMB_ROAD = "b";
    public static final String FREE_ROAD = "_";
    public static final String PATH_ROAD = "x";

    public static int size = 0, bombs = 0, score = 0, placeLeft = 0, points = 0;
    public static int[] map;
    public static String[] road, hack;

    public static void main(String[] args) {
        // 30 text-width
        System.out.println("********CAMINHO MINADO********");

        try (Scanner input = new Scanner(System.in)) {
            getNums(input);
            instanceMaps();
            placeBombs();

            placeLeft = size - bombs;
            points = 1000 / placeLeft;
            while (inGame(0)) {
                System.out.println();
                printMap(false);
                System.out.println();

                System.out.print("Escolha uma posição:");
                action(Integer.parseInt(input.nextLine()));
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("ERR: " + e.getMessage());
        }

    }

    public static void getNums(Scanner input) {
        int MINIMUM_MAP_SIZE = 1;
        int MINIMUM_BOMB_AMOUNT = 1;

        System.out.println(
                "************REGRAS:***********\n1) O caminho deve ter, pelo menos, 1 de tamanho\n2)O número de bombas deve ser maior que 0 e menor que o tamanho do caminho.");

        while (size <= MINIMUM_MAP_SIZE) {
            System.out.println("Qual o tamanho do caminho?");
            size = Integer.parseInt(input.nextLine());
        }
        while (bombs <= MINIMUM_BOMB_AMOUNT || bombs >= size) {
            System.out.println("Quantas bombas terão no caminho?");
            bombs = Integer.parseInt(input.nextLine());
        }
    }

    public static void placeBombs() {
        for (int i = 0; i < bombs; i++) {
            int random = getRandomInt();
            putBomb(random);
        }
    }

    public static boolean putBomb(int x) {
        if (map[x] == FREE) {
            map[x] = BOMB;
            hack[x] = BOMB_ROAD;
            return true;
        } else {
            return putBomb(getRandomInt());
        }
    }

    public static int getRandomInt() {
        return (int) (Math.random() * size);
    }

    public static void instanceMaps() {
        map = new int[size];
        road = new String[size];
        hack = new String[size];

        for (int i = 0; i < size; i++) {
            map[i] = FREE;
            road[i] = FREE_ROAD;
            hack[i] = FREE_ROAD;
        }
    }

    public static void endGame(boolean win) {
        System.out.println();
        if (win) {
            System.out.println("****PARABÉNS, VOCÊ GANHOU*****");
        } else {
            System.out.println("*********FIM DE JOGO**********");
        }
        System.out.println("*****SUA PONTUAÇÂO: " + score + " *****");
        printMap(true);
        System.exit(0);
    }

    public static void printMap(boolean viewAll) {
        if (viewAll) {
            for (int j = 0; j < road.length; j++) {
                System.out.print(hack[j] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < road.length; j++) {
                    if (i == 0) {
                        System.out.print(j + " ");
                    } else {
                        System.out.print(road[j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void action(int num) {
        System.out.println();
        switch (map[num]) {
            case FREE:
                map[num] = PATH;
                road[num] = PATH_ROAD;
                hack[num] = PATH_ROAD;
                inGame(1);
                break;
            case BOMB:
                road[num] = BOMB_ROAD;
                hack[num] = PATH_ROAD;
                inGame(2);
                break;
            case PATH:
                System.out.println("Este lugar já foi escolhido...");
                break;
        }

        if (num < map.length - 1 && num > 0) {
            if (map[num + 1] == BOMB || map[num - 1] == BOMB) {
                System.out.println("Cuidado: bomba próxima!");
            }
        } else if (num == 0) {
            if (map[num + 1] == BOMB) {
                System.out.println("Cuidado: bomba próxima!");
            }
        } else {
            if (map[num - 1] == BOMB) {
                System.out.println("Cuidado: bomba próxima!");
            }
        }

    }

    public static boolean inGame(int action) {
        switch (action) {
            case 0:
                // just checking
                break;

            case 1:
                // reducing
                placeLeft--;
                score += points;
                break;
            case 2:
                endGame(false);
                // bomb
                break;
        }
        if (placeLeft == 0) {
            endGame(true);
            return false;
        } else {
            return true;
        }
    }

}
