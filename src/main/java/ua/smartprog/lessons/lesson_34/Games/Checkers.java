package ua.smartprog.lessons.lesson_34.Games;

public class Checkers implements Game {
    private int moves = 0;
    public static final int MAXMOVES = 3;
    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MAXMOVES;
    }
}
