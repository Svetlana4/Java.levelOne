/**
 * Java 1. Home work №5
 *
 * @author Svetlana Sushentceva
 * @version 23.02.2022
 */
package ru.geekbrainns.home_work_5;

public class HomeWorkFive {

    public static void main(String[] args) {

        Employee[] array = new Employee[5] ;
        array[0] = new Employee("Petrova Anna Ivanovna", "manager",
                "kllk@mail.ru", "8 344 534 10 57", 48000, 45);
        array[1] = new Employee("Sidorov Ivan Petrovich", "manager",
                "khhg-54@mail.ru", "8 344 567 80 67", 45000, 50);
        array[2] = new Employee("Sidorov Oleg Petrovich", "manager",
                "kug-2@mail.ru", "8 344 211 80 31", 28000, 30);
        array[3] = new Employee("Ivanov Nicolay Ivanovich", "manager",
                "bhg4@mail.ru", "8 323567 84 67", 35000, 39);
        array[4] = new Employee("Semenov Ivan Ivavich", "manager",
                "ssd@mail.ru", "8 344 567 23 56", 55000, 56);

        for (Employee employee : array) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
