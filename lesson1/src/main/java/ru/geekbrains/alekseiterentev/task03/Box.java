package ru.geekbrains.alekseiterentev.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> storage = new ArrayList<>();

    public void addFruit(T fruit) {
        storage.add(fruit);
    }

    public void addFruits(T... fruits) {
        storage.addAll(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : storage) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    void shiftTo(Box<T> box) {

        for (T fruit : storage) {
            box.addFruit(fruit);
        }
        storage.clear();
    }
}
