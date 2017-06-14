package ua.smartprog.lessons.lesson_50;

public interface Queue <T>{
    public void add(T item);
    public T get();
    public int size();
}