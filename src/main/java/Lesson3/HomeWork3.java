package Lesson3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {

        invertArray();
        System.out.println();
        fillArr();
        System.out.println();
        changeArr();
        System.out.println();
        fillDiagonal();
        System.out.println();
        arrLenValue(5, 8);
        System.out.println();
        array();
        arraySumm();
    }

    //    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
//    значениями 1 2 3 4 5 6 7 8 … 100;
    static void fillArr() {
        int[] arr = new int[100];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
        System.out.println(Arrays.toString(arr));
    }

//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
//    умножить на 2;

    static void changeArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//            одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//            (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
//            диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
//            [1][1], [2][2], …, [n][n];

    static void fillDiagonal() {
        int[][] arrFill = new int[5][5];
        for (int i = 0; i < arrFill.length; i++) {
            for (int j = 0; j < arrFill.length; j++) {
                if (i == j) {
                    arrFill[i][j] = 1;
                } else {
                    arrFill[i][j] = 0;
                }
                System.out.print(arrFill[i][j] + " ");

            }
            System.out.println();
        }
    }
//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
//    одномерный массив типа int длиной len, каждая ячейка которого равна initialValue

    static void arrLenValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
    }

//    6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    static void array(){
        Integer[] array = {1, 5, 3, 2, -11, 4, 5, 2, -4, 8, 9, 1, 20, 50};
        List<Integer> ints = Arrays.asList(array);

        System.out.println("Максимальный элемент массива " + Collections.max(ints));
        System.out.println("Минимальный элемент массива " + Collections.min(ints));
    }

//    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.

    static boolean arraySumm(){
        int[] array = {20, 5, 6, 30, 1};

//        int[] array = new int[15];
//
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++){
//            int randomInteger = random.nextInt(20);
//            array[i] = randomInteger;
//        }
        System.out.println(Arrays.toString(array));
        int left = 0;
        int right = 0;

        for (int i = 0; i < array.length; i++){
            left += array[i];
            for (int j = i + 1; j < array.length; j++ ){
                right += array[j];
            }
            if ( left == right){
                return true;
            }
        } return false;
    }
}



