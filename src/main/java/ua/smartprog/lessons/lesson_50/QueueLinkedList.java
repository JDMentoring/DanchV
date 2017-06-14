package ua.smartprog.lessons.lesson_50;

public class QueueLinkedList<T> implements Queue<T>{

    private class Node{
        public T item;
        public Node next;
    }
    private Node first;
    private Node last;
    private int size;



    @Override
    public void add(T item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty())first = last;
        else oldLast.next = last;
        size++;
    }

    @Override
    public T get() {
        T item = first.item;
        first = first.next;
        if(isEmpty())last = null;
        size--;
        return item;
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean isEmpty(){
        return first == null;
    }
}
