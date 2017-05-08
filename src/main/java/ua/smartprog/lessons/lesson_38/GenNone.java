package ua.smartprog.lessons.lesson_38;

public class GenNone {
    private  Object obj;

    public GenNone(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Gen{ " +
                obj.getClass().getName()+
                " }";
    }
}
