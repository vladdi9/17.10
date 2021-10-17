package org.itstep;

public class AnimalSchool {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.run(); duck.swin();
        Squirrel belka = new Squirrel();
        belka.climb(); belka.run(); belka.swin();
    }
}
    interface runnable{
        void run();
    }
    interface swinable{
        void swin();
    }
    interface climbable{
        void climb();
    }

class Duck implements swinable, runnable{

    @Override
    public void run() {
        System.out.println("Duck: I am very poor in running");
    }

    @Override
    public void swin() {
        System.out.println("Duck: I am excellent in swimming");
    }
}
class Squirrel implements runnable, climbable, swinable{

    @Override
    public void run() {
        System.out.println("Бегает потихоньку");
    }

    @Override
    public void swin() {
        System.out.println("Что-то делает");
    }

    @Override
    public void climb() {
        System.out.println("Тонет");
    }
}




