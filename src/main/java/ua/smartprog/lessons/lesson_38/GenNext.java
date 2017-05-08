package ua.smartprog.lessons.lesson_38;

public class GenNext<T, R> {
    private T tType;
    private R rType;

    public GenNext(T tType, R rType) {
        this.tType = tType;
        this.rType = rType;
    }

    public T gettType() {
        return tType;
    }

    public R getrType() {
        return rType;
    }

    @Override
    public String toString() {
        return "Gen{ " +
                tType.getClass().getName() + "\n"
                + rType.getClass().getName() +
                " }";
    }
}
