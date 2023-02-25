package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {


    private static int size;
    private static int winSize;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '○';

    public static final String HEADER_FIRST_SYMBOL = "☺";
    public static final String SPASE_MAP_SYMBOL = "  ";

    private static char[][] MAP = new char[size][size];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount = 0;

    public static void main(String[] args) {
        start();

    }

    private static void start() {
        do {
            System.out.println("\n\nИгра начинается.");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y\\n");
        return switch (in.next()) {
            case "y", "н", "+", "-", "да", "нет" -> true;
            default -> false;
        };
    }

    private static void init() {
        turnsCount = 0;
//        получить размер игрового поля
        size = getSizeFromUser();
//        подобрать победную серию для выбранного размера
        winSize = getWinSize();

        initMap();
    }

    private static int getWinSize() {
        if (size >= 3 && size <= 6) {
            return 3;
        } else if (size > 6 && size <= 10) {
            return 4;
        }
        return 5;
    }

    private static int getSizeFromUser() {
        System.out.println("Введите размер игрового поля: ");
        return in.nextInt();
    }

    private static void initMap() {

        MAP = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }



    private static boolean checkDraw() {

//        for (char[] chars : MAP) {
//            for (char symbol : chars) {
//                if (symbol == DOT_EMPTY) {
//                    return false;
//                }

//            }
//        }
//        return true;
        return turnsCount >= size * size;
    }

    private static boolean checkWin(char symbol) {

        /*Проверка на выигрыш для 2-х диагоналей*/

        for (int n = 0; n < size; n++) {
            boolean toRight = true;
            boolean toLeft = true;
            for (int i = 0; i < size; i++) {

                toRight = toRight & (MAP[i][i] == symbol);
                toLeft = toLeft & (MAP[size - i - 1][i] == symbol);
            }
            return toRight || toLeft;
        }


        //Проверка на выигрыш по горизонтали и вертикали

        for (int i = 0; i < size; i++) {
            boolean cols = true;
            boolean rows = true;
            for (int col = 0; col < size; col++) {
                for (int row = 0; row < size; row++) {
                    cols = cols & (MAP[col][row] == symbol);
                    rows = rows & (MAP[row][col] == symbol);
                }
                if (cols || rows) return true;
            }
            return false;

        }
        return false;
    }

    private static boolean checkEnd(char symbol) {
//        победа
        if (checkWin(symbol)){
            if (symbol == DOT_HUMAN){
                System.out.println("Победил человек!");
            } else {
                System.out.println("Победил компьютер");
            }
            return true;
        }
//        ничья
        if (checkDraw()) {
            System.out.println("НИЧЬЯ");
            return true;
        }
        return false;
    }
//        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol)
//            return true;
//        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol)
//            return true;
//        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol)
//            return true;
//        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol)
//            return true;
//        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol)
//            return true;
//        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol)
//            return true;
//        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol)
//            return true;
//        if (MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol)
//            return true;
//        return false;


    private static void aiTurn() {
        System.out.println("\nХОД КОМПЬЮТЕРА");
        int rowNumber;
        int colNumber;

        do {
            rowNumber = random.nextInt(size);
            colNumber = random.nextInt(size);
        } while (!isCellFree(rowNumber, colNumber));

        MAP[rowNumber][colNumber] = DOT_AI;
        turnsCount++;
    }

    public static void humanTurn() {
        System.out.println("\nХОД ЧЕЛОВЕКА");
        int rowNumber;
        int colNumber;

        while (true) {
            System.out.println("Введиде координаты строки: ");
            rowNumber = getValidNumberMapLineFromScaner();


            System.out.println("Введиде координаты столбца: ");
            colNumber = getValidNumberMapLineFromScaner();

            if (isCellFree(rowNumber, colNumber)) {
                break;
            }
            System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется%n",
                    rowNumber + 1, colNumber + 1);
        }

        MAP[rowNumber][colNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static int getValidNumberMapLineFromScaner() {
        return getValidNumberFromScaner(size) - 1;
    }

    private static int getValidNumberFromScaner(int max) {
        while (true) {
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n, 1, max)) {
                    return n;
                }
                System.out.printf("Ошибка! Проверьте значение координаты. Должно быть от %s до %s. Введено: %s%n", 1, max, n);
            } else {
                System.out.printf("Вводить можно только целые числа!! %s - не число!%n", in.next());
            }
        }

    }

    private static boolean isNumberValid(int n, int min, int max) {
        return n >= min && n <= max;
    }

    private static boolean isCellFree(int rowNumber, int colNumber) {
        return MAP[rowNumber][colNumber] == DOT_EMPTY;
    }


    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printBodyMap() {
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
            for (int j = 0; j < size; j++) {
                System.out.print(MAP[i][j] + SPASE_MAP_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPASE_MAP_SYMBOL);
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPASE_MAP_SYMBOL);
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

}
