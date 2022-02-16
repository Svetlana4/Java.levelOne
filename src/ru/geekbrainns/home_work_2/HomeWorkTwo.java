/**
 * Java 1. Home work №2
 *
 * @author Svetlana Sushentceva
 * @version 12.02.2022
 */

package ru.geekbrainns.home_work_2;

public class HomeWorkTwo {

    public static void main(String[] args) {
        System.out.println(checkSumSign(5, 8));
        printText(56);
        System.out.println(checkNumber(-35));
        printString("строчка", 5);
        System.out.println(determineLeapYear(2000)); // true
//        System.out.println(determineLeapYear(400)); // true
//        System.out.println(determineLeapYear(600)); // false
//        System.out.println(determineLeapYear(900)); // false
    }

    static boolean checkSumSign(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }


    static void printText(int a) {
        System.out.println(a >= 0 ? "Positive number" : "Negative number");
    }


    static boolean checkNumber(int c) {
        return c < 0;
    }


    static void printString(String text, int m) {
        for (int n = 0; n < m; n++) {
            System.out.println(text);
        }
    }


    static boolean determineLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

}



