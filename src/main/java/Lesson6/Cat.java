package Lesson6;

public class Cat extends Animals{

    private final String nickNameAnimals;
    static int countCat = 0;

    Cat(String nickNameAnimals){
        super();
        countCat++;
        this.nickNameAnimals = nickNameAnimals;
    }

    public void run(int range){
        if (range > 200){
            System.out.println(nickNameAnimals + " не может пробежать больше 200 м");
        } else {
            System.out.println(nickNameAnimals + " пробежал " + range + " м");
        }
    }

    public void sweem(int range){
        System.out.println(nickNameAnimals + " не умеет плавать.");
    }

    public static int getCountCat(){
        return countCat;
    }

}
