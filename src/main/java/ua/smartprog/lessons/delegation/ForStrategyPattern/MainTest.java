package ua.smartprog.lessons.delegation.ForStrategyPattern;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(new RandonWords(20));

        while (input.hasNext())
            System.out.println(input.next());
    }
}
