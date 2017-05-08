package ua.smartprog.lessons.lesson_38;

public class GEnNextRunner {
    public static void main(String[] args) {
        GenNext<Integer, String> qwerty= new GenNext<Integer, String>(20, "rastgg");
        System.out.println(qwerty.toString());
    }

}
