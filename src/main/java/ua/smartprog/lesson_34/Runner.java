package ua.smartprog.lesson_34;

public class Runner {
    public static void main(String[] args) {
        Factory.serviceConsumer(new Implementation1Factory());
        Factory.serviceConsumer(new Implementation2Factory());
    }
}
