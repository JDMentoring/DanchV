package ua.smartprog.lesson_34.Games;

public class Games {
    public static void playGame(GameFactory gf){
        Game g = gf.getGame();
        while(g.move());
    }
}
