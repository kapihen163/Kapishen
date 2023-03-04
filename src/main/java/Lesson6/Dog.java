package Lesson6;

public class Dog extends Animals{

    private final String nickNameAnimals;

    static int countDog = 0;

    Dog(String nickNameAnimals){
        super();
        countDog++;
        this.nickNameAnimals = nickNameAnimals;
    }

    @Override
    public void run(int range) {
        if (range > 500){
            System.out.println(nickNameAnimals + " не может бегать на такое расстояние.");
        } else {
            System.out.println(nickNameAnimals + " пробежал " + range + " метров");
        }
    }

    @Override
    public void sweem(int range) {
        if (range > 10){
            System.out.println(nickNameAnimals + " не может плавать на такое расстояние.");
        } else {
            System.out.println(nickNameAnimals + " пробежал " + range + " метров");
        }
    }

    public static int getCountDog(){
        return countDog;
    }

}
