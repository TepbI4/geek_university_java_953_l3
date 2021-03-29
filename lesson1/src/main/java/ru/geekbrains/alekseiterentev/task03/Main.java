package ru.geekbrains.alekseiterentev.task03;

public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.addFruits(new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        orangeBox.addFruits(new Orange(), new Orange(), new Orange(), new Orange());

        // appleBox.addFruit(new Orange()); не даст сделать компилятор

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());

        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        System.out.println("Равны ли коробки по весу: " + appleBox.compare(orangeBox));

        appleBox.addFruit(new Apple());
        System.out.println("А теперь? : " + appleBox.compare(orangeBox));

        // orangeBox.shiftTo(appleBox); не даст сделать компилятор

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        System.out.println("Вес 2й коробки с апельсинами: " + orangeBox2.getWeight());

        orangeBox.shiftTo(orangeBox2);

        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вес 2й коробки с апельсинами: " + orangeBox2.getWeight());
    }
}
