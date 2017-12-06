package pl.sdacademy.animals.bear;

import pl.sdacademy.animals.Animal;


public abstract class Bear implements Animal {

    private int weight;
    private boolean isAlive;

    public Bear(int weight) {
        this.weight = weight;
        this.isAlive = true;
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }

    public void eat() {
    }

    @Override
    public int getWeight() {
        return weight;
    }

}
