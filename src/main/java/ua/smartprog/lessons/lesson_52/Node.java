package ua.smartprog.lessons.lesson_52;

/**
 * Created by Тарас on 19.08.2017.
 */
public class Node<T> {
    private T object;
    private Node pointer;

    public void setPointer(Node pointer){
        this.pointer = pointer;
    }

    public T getObject(){
        return this.object;
    }
}
