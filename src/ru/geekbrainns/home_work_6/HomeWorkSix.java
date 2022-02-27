/**
 * Java 1. Home work №6
 *
 * @author Svetlana Sushentceva
 * @version .02.2022
 */

package ru.geekbrainns.home_work_6;

public class HomeWorkSix {
    public static void main(String[] args) {
        IAnimal[] animals = {
                new Cat(200),
                new Dog(500, 10)
        };

//        Animal dog = null;
//        dog.run(460);
//        dog.swim(8);
//        Animal cat = null;
//        cat.run(150);

        for (IAnimal animal : animals) {
            System.out.println(animal);
            animal.run(450);

        }
    }
}
