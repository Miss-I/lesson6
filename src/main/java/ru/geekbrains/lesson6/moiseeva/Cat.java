package ru.geekbrains.lesson6.moiseeva;

public class Cat extends Animals {
    protected int maxRunDistance = 200;
    static int catCount = 0;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        catCount++;


    }

    @Override
    public void run(int distance) {
        if (distance < maxRunDistance) {
            System.out.println(name + " Пробежал " + distance + "метров.");
        } else if (distance > maxRunDistance) {
            System.out.println(name + " пробежал 200 метров и устал");
        }

    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать, он остался сидеть возле берега.");
    }
}
