
package ru.geekbrainns.home_work_7;

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getFullness() {
        return fullness;
    }

    public boolean isFullness(){
        return fullness;
    }

    public void eat(Plate plate) {
        if (this.fullness) {
            return;
        }
        fullness = true;
        plate.decreaseFood(this.appetite);
    }

    @Override
    public String toString() {
        return "Cat: " + name + ", appetite: " + appetite + " , " + fullness + "\n";
    }
}
