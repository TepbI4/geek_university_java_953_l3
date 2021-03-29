package ru.geekbrains.alekseiterentev.task01;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Monkey(), new Dog()};
        System.out.println(Arrays.toString(animals));
        System.out.println(Arrays.toString(swapElements(animals, 0, 2)));
    }

    static <T> T[] swapElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}
