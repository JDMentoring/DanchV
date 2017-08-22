package ua.smartprog.lessons.lesson_53;

import java.util.HashMap;
import java.util.Map;

public class mapTest {
    public static void main(String[] args) {
        Map<Integer, String> days =  new HashMap<>();
        days.put(1, "Monday");
        days.put(2, "Tu");
        days.put(3, "Wd");
        days.put(4, "Th");
        System.out.println(days);
        days.remove(2);
        System.out.println(days);
        System.out.println(days.get(3));
        for (Map.Entry<Integer,String> day: days.entrySet()) {
            System.out.println(day.toString());
        }

        days.containsKey(1);
    }
}
