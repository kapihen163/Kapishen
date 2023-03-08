package Lesson7;

public class Cat {
    private final String name;
    private final int appetit;
    private boolean satiety;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(appetit);

    }

    public void info(){
        String isHungry = !satiety ? "голоден" : "сыт";
        System.out.println(name + ": " + isHungry);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetit=" + appetit +
                ", replete=" + satiety +
                '}';
    }
}
