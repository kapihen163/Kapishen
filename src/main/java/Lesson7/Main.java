package Lesson7;

//        1. Создать массив котов и 1 тарелку
//        Коты из массива по очереди подходят к одной и той же тарелке
//        и едят из нее
//        2. Реализовать цикл, в котором:
//        Коты по очереди подходят к тарелке и едят.
//        После этого количество еды в тарелке увеличивается, коты становятся голодными
//        и цикл повторяется
//        Цикл должен работать до тех пор, пока в тарелке не останется еды
public class Main {
    public static void main(String[] args) {


        Plate plate = new Plate(50);

        Cat[] cat = {
                new Cat("Murzik", 17),
                new Cat("Barsik", 25),
                new Cat("Kay", 10),
                new Cat("Mila", 15)
        };


        System.out.println(plate);

        for (Cat cat1 : cat) {
            for (Cat cats : cat) {
                cats.eat(plate);
                cats.info();
                System.out.println(plate);
            }
            plate.increaseFood(50);
            System.out.println(plate);
        }
    }
}
