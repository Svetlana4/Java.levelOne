/**
 * Java 1. Home work №7
 *
 * @author Svetlana Sushentceva
 * @version 03.2022
 */
package ru.geekbrainns.home_work_7;

import java.util.Arrays;

public class HomeWorkSeven {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Murzik", 6),
                new Cat("Tom", 10)
        };
        System.out.println(Arrays.toString(cats));
        Plate plate = new Plate(20);
        System.out.println(plate);

        for (Cat cat : cats) {
            if (cat.getAppetite() <= plate.getFood()) {
                cat.eat(plate);
                System.out.println("Cat: " + cat.getName() + " ate");
            } else {
                System.out.println("Cat: " + cat.getName() + " didn't eat");
            }

        }
        System.out.println(plate);
    }
}
