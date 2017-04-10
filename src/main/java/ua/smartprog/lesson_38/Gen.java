package ua.smartprog.lesson_38;

public class Gen<T> {
    private T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Gen{ " +
                obj.getClass().getName()+
                '}';
    }
}
