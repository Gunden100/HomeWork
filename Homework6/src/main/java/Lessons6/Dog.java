package Lessons6;

public class Dog extends Animal {
    static int dogCount;
    Dog() {
        int dogCount = 0;
        ++dogCount;
    }
    @Override
    void run(int meters){
        if(meters > 200 || meters < 0){
            System.out.println("Собака не может пробежать " + meters + " метров.");
        } else {
            System.out.println("Собака пробежала " + meters + " метров.");
        }

    }
    @Override
    void swimm(int meters){
        if(meters > 10 || meters < 0){
            System.out.println("Собака не может проплыть " + meters + " метров.");
        } else {
            System.out.println("Собака проплыла " + meters + " метров.");
        }
    }
}
