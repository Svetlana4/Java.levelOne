/**
 * Java 1. Home work №6
 *
 * @author Svetlana Sushentceva
 * @version 27.02.2022
 */
package ru.geekbrainns.home_work_6;

class Dog extends Animal{
    Dog (int maxRunLength, int maxSwimLength) {
        super (maxRunLength, maxSwimLength);
        this.type = "Dog";
    }

}
