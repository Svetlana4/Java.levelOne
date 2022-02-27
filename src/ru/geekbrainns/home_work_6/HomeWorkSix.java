/**
 * Java 1. Home work №6
 *
 * @author Svetlana Sushentceva
 * @version 27.02.2022
 */

package ru.geekbrainns.home_work_6;

//import com.sun.org.apache.xerces.internal.impl.dv.xs.DoubleDV;

public class HomeWorkSix {
    public static void main(String[] args) {
//        IAnimal[] animals = {
//                new Cat(200),
//                new Dog(500, 10)
//        };

        Animal cat = new Cat(200);
        Animal dog = new Dog(500, 10);
        dog.run(450);
        dog.swim(8);
        cat.run(150);
        cat.swim(1);
        System.out.println(cat);
        System.out.println(dog);
//        for (IAnimal animal : animals) {
//           System.out.println(animal);
//            animal.run(450);
//        }
    }
}
