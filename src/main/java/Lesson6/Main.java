package Lesson6;


//        1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        3. У каждого животного есть ограничения на действия
//        (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//        4. * Добавить подсчет созданных котов, собак и животных.


public class Main {
    public static void main(String[] args) {
//
        Animals animals = new Animals();
        Animals animals1 = new Animals();
        Animals animals2 = new Animals();

        Cat Kay = new Cat("Кай");
        Cat Mila = new Cat("Мила");
        Dog Oskar = new Dog("Оскар");
        Dog Tuzick = new Dog("Тузик");

        Kay.run(201);
        Kay.run(150);
        Kay.sweem(100);

        Mila.run(199);
        Mila.run(100);
        Mila.sweem(2);

        Oskar.run(300);
        Oskar.run(501);
        Oskar.sweem(11);
        Oskar.sweem(9);

        Tuzick.sweem(4);
        Tuzick.sweem(12);
        Tuzick.run(400);
        Tuzick.run(520);

        System.out.println("Всего животных было: " + Animals.countAnimal);
        System.out.println("Кошек было: " + Cat.countCat);
        System.out.println("Собак было: " + Dog.countDog);
    }

}
