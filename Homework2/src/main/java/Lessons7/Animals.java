package Lessons7;

    class Animal {
        static int count = 0;
        private String name;

        public Animal() {
            ++count;
            name = null;
        }

        public Animal(String name) {
            ++count;
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
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
