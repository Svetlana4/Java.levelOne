/**
 * Java 1. Home work №6
 *
 * @author Svetlana Sushentceva
 * @version 27.02.2022
 */
package ru.geekbrainns.home_work_6;

class Cat extends Animal{
   Cat (int maxRunLength) {
       super (maxRunLength, 0);
       this.type = "Cat";
    }

     @Override
     public void swim (int length) {
        System.out.println("cat can't swim");
    }

}