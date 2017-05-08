package ua.smartprog.lessons.lesson_36;

import java.util.Random;

public class lesson36_2 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random rndNumber = new Random();
        int counter = 0;
        int arrp[] = new int[200];

        for (int i = 0; i < 500; i++) {
            try {
                b = rndNumber.nextInt(50);
                c = rndNumber.nextInt(50);
                a = 100500 / (b / c);
                arrp[i] = a;
                throw new NullPointerException("Test handler");
            } catch (ArithmeticException e) {
                System.out.println("Dividing zero!!!");
                counter++;
                a = 0;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Message inside  second catch");
            } catch (NullPointerException e) {
                e.getMessage();
            }
            System.out.println("a = " + a);
        }
        System.out.println("Counter = " + counter);
    }
}
