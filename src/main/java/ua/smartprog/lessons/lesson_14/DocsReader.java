package ua.smartprog.lessons.lesson_14;

public class DocsReader implements IRead{
    private String str;

    public DocsReader(String str) {
        this.str = str;
    }

    public String read(){
        return str;
    }

}
