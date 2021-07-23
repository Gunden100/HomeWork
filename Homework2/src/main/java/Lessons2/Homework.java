package Lessons2;

import java.sql.SQLOutput;

public class Homework {
    public static void main(String[] args) {
        //summ(5, 10);
        System.out.println(summ(5, 5));
        pusornegat(5);
        //isNegativ(5);
        System.out.println(isNegativ(5));
        printText(5, "I love Java");
        //isLeap(4);
        System.out.println(isLeap(5600));
    }

    public static boolean summ(int a, int b) {
        return ((a + b) <= 20 && (a + b) >= 10);
    }

    public static void pusornegat(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegativ(int a) {
        return (a < 0);
    }

    public static void printText(int a, String str) {
        for (int i = 0; i < a; ++i) {
            System.out.println(str);
        }
    }
    public static boolean isLeap(int year) {
        if (year % 4 > 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }


}
