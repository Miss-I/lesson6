package ru.geekbrains.lesson6.moiseeva;

public class MainApp {
    public static void main(String[] args) {

        Animals cat1 = new Cat("Barsic", "black", 3);
        cat1.run(150);
        cat1.info();
    }
}
