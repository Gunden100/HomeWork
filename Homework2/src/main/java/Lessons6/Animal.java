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


