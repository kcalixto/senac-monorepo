package pi.ado12;

import java.util.Scanner;

public class ADO12_01 {
    public static final int BOMB = -1;
    public static final int FREE = 0;
    public static final int PATH = 1;
    public static final String BOMB_ROAD = "b";
    public static final String FREE_ROAD = "_";
    public static final String PATH_ROAD = "x";
    public static final String CHOOSEN_BOMB = "o";

    public static String spacing = " ";
    public static int size = 0, bombs = 0, score = 0, placeLeft = 0, points = 0;
    public static int x, y;
    public static int[][] map;
    public static String[][] road, hack;

    public static void main(String[] args) {
        // 30 text-width
        System.out.println("*********CAMPO MINADO*********");

        // try (
            Scanner input = new Scanner(System.in)
            ;
            // ) {
            getNums(input);
            instanceMaps();
            placeBombs();

            placeLeft = (size * size) - bombs;
            points = 1000 / placeLeft;
            while (inGame(0)) {
                System.out.println("------------------------------");
                System.out.println();
                printMap(false);
                System.out.println();

                System.out.println("Escolha uma posição:");
                System.out.print("x: ");
                x = Integer.parseInt(input.nextLine());
                System.out.print("y: ");
                y = Integer.parseInt(input.nextLine());
                action(x, y);
                System.out.println();
            }

        // } catch (Exception e) {
        //     System.out.println("ERR: " + e);
        // }

    }

    public static void getNums(Scanner input) {
        int MINIMUM_MAP_SIZE = 1;
        int MINIMUM_BOMB_AMOUNT = 1;

        System.out.println(
                "************REGRAS:***********\n1) O campo deve ter, pelo menos, 2x2 de tamanho\n2)O número de bombas deve ser maior que 0 e menor que o tamanho do mapa.");

        while (size <= MINIMUM_MAP_SIZE) {
            System.out.println("Qual o tamanho do campo?");
            size = Integer.parseInt(input.nextLine());
        }
        while (bombs < MINIMUM_BOMB_AMOUNT || bombs > size) {
            System.out.println("Quantas bombas terão no campo?");
            bombs = Integer.parseInt(input.nextLine());
        }

        for (int i = 0; i < (int) (size / 10); i++) {
            spacing += " ";
        }
    }

    public static void placeBombs() {
        for (int i = 0; i < bombs; i++) {
            int random_w = getRandomInt();
            int random_h = getRandomInt();
            putBomb(random_w, random_h);
        }
    }

    public static boolean putBomb(int x, int y) {
        if (map[x][y] == FREE) {
            map[x][y] = BOMB;
            hack[x][y] = BOMB_ROAD;
            return true;
        } else {
            return putBomb(getRandomInt(), getRandomInt());
        }
    }

    public static int getRandomInt() {
        return (int) (Math.random() * size);
    }

    public static void instanceMaps() {
        map = new int[size][size];
        road = new String[size][size];
        hack = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = FREE;
                road[i][j] = FREE_ROAD;
                hack[i][j] = FREE_ROAD;
            }
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
        int EXTRA_SPACE_FOR_PRINTING = 2;
        int SPACE_FOR_LINE = size + 0;
        int SPACE_FOR_NUMBER = size + 1;

        if (viewAll) {
            for (int i = 0; i < size + EXTRA_SPACE_FOR_PRINTING; i++) {
                for (int j = 0; j < size + EXTRA_SPACE_FOR_PRINTING; j++) {
                    if (i == SPACE_FOR_LINE) {
                        if (j < 6) {
                            System.out.print("_" + spacing);
                        }
                    } else if (i == SPACE_FOR_NUMBER) {
                        if (j < size) {
                            System.out.print((j + 1) + spacing);
                        }
                    } else {
                        if (j == SPACE_FOR_LINE) {
                            System.out.print("|" + spacing);
                        } else if (j == SPACE_FOR_NUMBER) {
                            System.out.print(i + 1);
                        } else {
                            System.out.print(hack[i][j] + spacing);
                        }
                    }

                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < size + EXTRA_SPACE_FOR_PRINTING; i++) {
                for (int j = 0; j < size + EXTRA_SPACE_FOR_PRINTING; j++) {
                    if (i == SPACE_FOR_LINE) {
                        if (j <= size) {
                            System.out.print("_" + spacing);
                        }
                    } else if (i == SPACE_FOR_NUMBER) {
                        if (j < size) {
                            if (j + 1 >= 10) {
                                System.out.print((j + 1) + spacing.substring(0, spacing.length() - 1));
                            } else {
                                System.out.print((j + 1) + spacing);
                            }
                        }
                    } else {
                        if (j == SPACE_FOR_LINE) {
                            System.out.print("|" + spacing);
                        } else if (j == SPACE_FOR_NUMBER) {
                            System.out.print(i + 1);
                        } else {
                            System.out.print(road[i][j] + spacing);
                        }
                    }

                }
                System.out.println();
            }
        }
    }

    public static void action(int w, int h) {
        w -= 1;
        h -= 1;

        System.out.println();
        switch (map[h][w]) {
            case FREE:
                map[h][w] = PATH;
                road[h][w] = PATH_ROAD;
                hack[h][w] = PATH_ROAD;
                inGame(1);
                break;
            case BOMB:
                road[h][w] = BOMB_ROAD;
                hack[h][w] = CHOOSEN_BOMB;
                inGame(2);
                break;
            case PATH:
                System.out.println("Este lugar já foi escolhido...");
                break;
        }

        if (bombsClose(w, h)) {
            System.out.println("Cuidado: bomba próxima!");
        }

    }

    public static boolean bombsClose(int w, int h) {
        boolean up = true, down = true, left = true, right = true;

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

        if (up) {
            if (map[w][h - 1] == BOMB) {
                return true;
            }
        }
        if (down) {
            if (map[w][h + 1] == BOMB) {
                return true;
            }
        }
        if (left) {
            if (map[w - 1][h] == BOMB) {
                return true;
            }
        }
        if (right) {
            if (map[w + 1][h] == BOMB) {
                return true;
            }
        }
        if (up && left) {
            if (map[w - 1][h - 1] == BOMB) {
                return true;
            }
        }
        if (up && right) {
            if (map[w + 1][h - 1] == BOMB) {
                return true;
            }
        }
        if (down && left) {
            if (map[w - 1][h + 1] == BOMB) {
                return true;
            }
        }
        if (down && right) {
            if (map[w + 1][h + 1] == BOMB) {
                return true;
            }
        }

        System.out.println("top: " + up);
        System.out.println("left: " + left);
        System.out.println("right: " + right);
        System.out.println("down: " + down);
        up = true;
        down = true;
        left = true;
        right = true;
        return false;
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
