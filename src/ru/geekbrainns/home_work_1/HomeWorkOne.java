package ru.geekbrainns.home_work_1;

public class HomeWorkOne {

    public static void main(String[] args) {
        printThreeWorlds();
        checkSumSign();
        printColor();
        comhareNumders();
    }
    public static void printThreeWorlds() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 5;
        int b = 8;
        int c = a + b;
//        if (c >= 0) {
//            System.out.println("Сумма положительная");
//        }else {
//            System.out.println("Сумма отрицательная");
//        }
        System.out.println(c >= 0? "Сумма положительная" : "Сумма отрицательная");
    }
    public static void printColor() {
        int value = 55;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void comhareNumders() {
        int a = 25;
        int b = 35;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
