package ua.smartprog.lesson_13;

public class Calculate {
    public int addition(String expression) {
        int sum = 0;
        for (String args : expression.split("\\+"))
            sum += Integer.valueOf(args);
        return sum;
    }
}