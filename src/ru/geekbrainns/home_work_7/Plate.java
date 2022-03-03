
package ru.geekbrainns.home_work_7;

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food;
        }
    }

    public void addFood(int i) {
        this.food += i;
    }

        @Override
    public String toString() {
        return "Plate: " + food;
    }
}
