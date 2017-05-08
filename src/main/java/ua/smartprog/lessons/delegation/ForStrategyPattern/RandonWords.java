package ua.smartprog.lessons.delegation.ForStrategyPattern;

import java.nio.CharBuffer;
import java.util.Random;

public class RandonWords implements Readable {
    private static Random rand = new Random(50);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiouy".toCharArray();
    private int count;

    public  RandonWords(int count){
        this.count = count;
    }
    public int read(CharBuffer cb){
        if (count--== 0){
            return -1;
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);

        for (int i = 0; i < 4 ; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }
}
