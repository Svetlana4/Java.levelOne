/**
 * Java 1. Home work №5
 *
 * @author Svetlana Sushentceva
 * @version 23.02.2022
 */
package ru.geekbrainns.home_work_5;

class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
//
//    String person() {
//        return " vau"
//    }

    @Override
    public String toString() {
       return fullName + ", " + position + ", " + email + ", " + salary + ", " + age;
    }

    void printToConsole() {
        System.out.println(this);
    }
}
