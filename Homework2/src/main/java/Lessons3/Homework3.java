package Lessons3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        System.out.println(Arrays.toString(task5(10, 7)));
        task6();
        int[] Array = {0, 1, 3, 1, 1, 4, 0, 1, 0, 1};
        boolean answer = task7(Array);
        System.out.println(answer);
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] Array = {0, 1, 1, 1, 1, 0, 0, 1, 0, 1};
        System.out.println(Arrays.toString(Array));
        for (int i = 0; i < Array.length; ++i) {
            if (Array[i] == 1) {
                Array[i] = 0;
            } else {
                Array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(Array));
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] array = new int[100];
        for (int i = 0; i < array.length; ++i) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task4() {
        System.out.println("Задание 4");
        int[][] array = new int[15][15];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (i == j) {
                    array[i][j] = 1;
                }
                if (j == array[i].length - (i + 1)) {
                    array[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static int[] task5(int len, int initialValue) {
        System.out.println("Задание 5");
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void task6() {
        System.out.println("Задание 6");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int result;
        result = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        System.out.println("Минимальное значение " + result);
        for (int i = 0; i < array.length; ++i) {
            if (result < array[i]) {
                result = array[i];
            }
        }
        System.out.println("Максимальное значение " + result);
    }

    public static boolean task7(int[] array) {
        System.out.println("Задание 7");
        int summLeft = 0;
        int summRight = 0;
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                summLeft += array[j];
            }
            for (int j = i + 1; j < array.length; ++j) {
                summRight += array[j];
            }
            if (summLeft == summRight) {
                return true;
            }
            summLeft = summRight = 0;
        }
        return false;
    }

}


