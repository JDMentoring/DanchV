package ua.smartprog.lessons.lesson_34.Games;

public class Chess implements Game {
    private int moves = 0;
    public static final int MAXMOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MAXMOVES;
    }
}
