package Lessons6;

class Lessons6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Dog dog = new Dog();
        cat.swimm(5);
        cat2.run(150);
        dog.swimm(7);

//        int a = Animal.getCount();

        System.out.print("животных создано: " + Animal.getCount());

    }
}
public class Animal {
    static int count = 0;
    private final String name;

    public Animal() {
        ++count;
        name = null;
    }

    public Animal(String name) {
        ++count;
        this.name = name;
    }

    void run(int meters) {
        System.out.println("Животное бежит" + meters + ".");
    }

    void swimm(int meters) {
        System.out.println("Животное плывет" + meters + ".");
    }

    public static int getCount(){
        return count;
    }



}

