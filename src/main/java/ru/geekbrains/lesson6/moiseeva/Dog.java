package ru.geekbrains.lesson6.moiseeva;

public class Dog extends Animals {
    static int dogCount = 0;
    protected int maxRunDistance = 500;
    protected int maxSwimDistance = 10;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance < maxRunDistance) {
            System.out.println(name + "Пробежал " + distance + "метров.");
        } else if (distance > maxRunDistance) {
            System.out.println(name + "пробежал 500 метров и устал");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance < maxSwimDistance) {
            System.out.println(name + " проплыл" + distance + " метров.");
        } else {
            System.out.println(name + " проплыл 10 метров и устал.");
        }
    }

}
