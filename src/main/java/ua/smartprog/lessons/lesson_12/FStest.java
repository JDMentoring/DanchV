package ua.smartprog.lessons.lesson_12;


public class FStest {
    public static void main(String[] args) {
        IntStack stck0 = new FixedStack(7);
        FixedStack stck1 = new FixedStack(6);
        FixedStack stck2 = new FixedStack(10);

        for (int i = 0; i < 6; i++) stck1.push(i);
        for (int i = 0; i < 10; i++) stck2.push(i);

        System.out.println("Стек 1");
        for (int i = 0; i < 6; i++) System.out.println(stck1.pop());
        System.out.println("Стек 2");
        for (int i = 0; i < 10; i++) System.out.println(stck2.pop());

        stck1.push(5);
        stck1.getSize();

        stck0.push(5);


    }
}
