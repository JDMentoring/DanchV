package ua.smartprog.lessons.lesson_25;

import org.junit.Test;

public class StringGenericTest {
    @Test
    public void getMiddle() throws Exception {
        String[] someWords = {"Nazar", "Danylo", "Igor", "Mykhailiv", "Kolia", "Kristina"};
        String middle = StringGeneric.getMiddle(someWords);
        int midleInt = StringGeneric.getMiddle(1,9,8,7,5,6,7,8);
        System.out.println("Middle item is " + middle);

        System.out.println("Middle item for int " + midleInt);

    }

    @Test
    public void findMinMax() throws Exception {
        String[] someWords = {"Nazar", "Danylo", "Igor", "Mykhailiv"};
        Pair<String> MINMAX = StringGeneric.findMinMax(someWords);
        System.out.println("min = "+ MINMAX.getFirst());
        System.out.println("max = "+ MINMAX.getSecond());
    }

}