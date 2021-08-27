package Lessons7;

public class Plate {
    private int eat;

    public void changeFood(int food) {
        eat = eat + food;
    }
    Plate(int food){
        eat = food;
    }

    public int getEat() {
        return eat;

    }
}
