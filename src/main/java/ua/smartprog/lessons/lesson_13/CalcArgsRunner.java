package ua.smartprog.lessons.lesson_13;

public class CalcArgsRunner {
    public static void main(String[] args) {
        System.out.println("Calculation...");
        Calculate calc = new Calculate();
        int sum = calc.addition("5+6+8");
        System.out.println("Summ = " + sum);
    }
}
