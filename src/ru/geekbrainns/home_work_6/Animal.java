/**
 * Java 1. Home work №6
 *
 * @author Svetlana Sushentceva
 * @version 27.02.2022
 */

package ru.geekbrainns.home_work_6;

abstract class Animal implements IAnimal {
    protected String type;
    protected int maxRunLength;
    protected int maxSwimLength;

    Animal(int maxRunLength, int maxSwimLength) {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
    }

//    @Override
    public void run(int length) {
        if (length > maxRunLength) {
            System.out.println(type + " couldn't run " + length);
        } else {
            System.out.println(type + " successfully ran " + length + " m.");
        }
    }
//    @Override
    public void swim(int length) {
        if (length > maxRunLength) {
            System.out.println(type + " couldn't swim " + length);
        } else {
            System.out.println(type + " successfully swam " + length + " m.");
        }
    }

    @Override
    public String toString() {
            return type + " (max):" + " run "  + maxRunLength + ", " + "swim " + maxSwimLength;
    }
}
