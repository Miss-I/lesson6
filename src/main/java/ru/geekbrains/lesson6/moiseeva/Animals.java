package ru.geekbrains.lesson6.moiseeva;

public abstract class Animals {
    static int animalsCount = 0;
    protected String name;
    protected String color;
    protected int age;

    public Animals() {
        animalsCount++;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }
}
