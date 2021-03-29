package ru.geekbrains.alekseiterentev.task02;

import ru.geekbrains.alekseiterentev.task01.Animal;
import ru.geekbrains.alekseiterentev.task01.Cat;
import ru.geekbrains.alekseiterentev.task01.Dog;
import ru.geekbrains.alekseiterentev.task01.Monkey;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Monkey(), new Dog()};
        List<Animal> animalList = toList(animals);
        System.out.println(animalList);
    }

    static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
