package Lesson2;
//    1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//        в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//
//        2. Написать метод, которому в качестве параметра передается целое число, метод должен
//        напечатать в консоль, положительное ли число передали или отрицательное.
//        Замечание: ноль считаем положительным числом.
//        3. Написать метод, которому в качестве параметра передается целое число.
//        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

//
public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(within10and20(10,5));
        isPositiveOrNegative(-1);
        System.out.println(isNegative(-5));
        printWordNTimes("Kapishen", 5);
        isLeapYear(2024);
    }
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <= 20;
    }

    public static void isPositiveOrNegative(int a) {
        if(a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        return a < 0;
    }
    //        4. Написать метод, которому в качестве аргументов передается строка и число,
//        метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printWordNTimes(String word, int times){
        for (int i = 1; i <= times; i++){
            System.out.println("[" + i + "]" + word);
        }
    }
//    5. * Написать метод, который определяет, является ли год високосным,
//        и возвращает boolean (високосный - true, не високосный - false).
//        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
        
        return false;
    }
}
