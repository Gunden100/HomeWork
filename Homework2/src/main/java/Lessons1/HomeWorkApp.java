package Lessons1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        if (a + b > 0) {
            System.out.println("Sum positive");
        } else {
            System.out.println("Sum negative");
        }
    }
    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }
    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.print(a >= b);
        } else {
            System.out.print("a < b");
        }
    }
    }








