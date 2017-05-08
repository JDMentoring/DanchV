package ua.smartprog.lessons.lesson_34.Games;

public class CheckersFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Checkers();
    }
}
