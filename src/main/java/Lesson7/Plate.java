package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
            food -= foodToDecrease;
            return true;
        }
        return false;
    }

    // метод увеличивает количество еды в тарелке
    public void increaseFood(int food) {
        this.food += food;
    }


    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
