package ua.smartprog.lessons.lesson_52;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class lesson_52_1 {
    public static void main(String[] args) {
        List<String> lines = new LinkedList<>();
        lines.add("First");
        lines.add("Third");
        ListIterator<String> iterator = lines.listIterator();
        iterator.next();
        lines.set(1,"Second");
        System.out.println(lines);
    }
}
