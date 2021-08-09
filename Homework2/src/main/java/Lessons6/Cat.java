package Lessons6;

    public class Cat extends Animal {
        static int catCount;

        public Cat() {
            ++catCount;
        }
        @Override
        void run(int meters){
            if(meters > 200 || meters < 0){
                System.out.println("Кот не может пробежать " + meters + ".");
            } else {
                System.out.println("Кот пробежал " + meters + " метров.");
            }

        }
        @Override
        void swimm(int meters){
            System.out.println("Кот не умеет плавать.");
        }
    }


