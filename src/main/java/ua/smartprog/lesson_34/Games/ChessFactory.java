package ua.smartprog.lesson_34.Games;

public class ChessFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Chess();
    }
}
