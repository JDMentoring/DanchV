package ua.smartprog.lesson_34.Games;

public class Runner {
    public static void main(String args[]){
        Games.playGame(new ChessFactory());
        Games.playGame(new CheckersFactory());
    }
}
