//
//        1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
//        2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова:
//        Orange, Banana, Apple.
//        Orange
//        Banana
//        Apple
//
//        3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
//        и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать
//        эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
//        в противном случае - “Сумма отрицательная”;
//        4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте
//        ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести
//        сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
//        то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
//        5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
//        и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
//        то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;


public class Lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign(){
        int varA = 5;
        int varB = -10;
        int result = varA + varB;

        if (result >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor(){
        int varValue = -20;

        if (varValue <= 0){
            System.out.println("Красный");
        } else if (varValue > 0 & varValue <=100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers(){
        int varA = 30;
        int varB = 20;
        if (varA > varB){
            System.out.println("a > b");
        } else if (varA < varB){
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }


}
