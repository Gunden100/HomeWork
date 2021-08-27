package Lessons7;

    public class Cat extends Animal {
        static int catCount;
        private boolean full;

        public Cat() {
            ++catCount;
            full = false;
        }

        public Cat(String nname) {
            setName(nname);
        }


        public boolean isFull() {
            return full;
        }

        void eating(int rybov, Plate plate) {
            if (plate.getEat() >= rybov){
                plate.changeFood( - rybov);
                full = true;
                System.out.println("Я сыт!");
            }
            else {
                System.out.println("Еды не хватает!");
            }
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


