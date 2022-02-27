/**
 * Java 1. Home work №6
 *
 * @author Svetlana Sushentceva
 * @version .02.2022
 */

package ru.geekbrainns.home_work_6;

abstract class Animal implements IAnimal {
    protected String type;
    protected int maxRunLength;
    protected int maxSwimLength;

    Animal(int maxRunLength, int maxSwimLength) {
//        this.type = type;
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
    }
    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= maxRunLength)) {
            System.out.println("ran");
        } else {
            System.out.println("did not run");
        }
    }
    @Override
    public void swim(int length) {
        if ((length >= 0) && (length <= maxRunLength)) {
            System.out.println("swam");
        } else {
            System.out.println("did not swim");
        }
    }

    @Override
    public String toString() {
            return "run "  + maxRunLength + ", " + "swim " + maxSwimLength;
    }
}
