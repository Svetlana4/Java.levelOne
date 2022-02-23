/**
 * Java 1. Home work №5
 *
 * @author Svetlana Sushentceva
 * @version 23.02.2022
 */
package ru.geekbrainns.home_work_5;

class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
       return fullName + ", " + position + ", " + email + ", " + salary + ", " + age;
    }

    public void PrintToConsole() {
        System.out.println(this);
    }

}
