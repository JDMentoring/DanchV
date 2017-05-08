package ua.smartprog.lessons.lesson_34;

public class Factory {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
}
