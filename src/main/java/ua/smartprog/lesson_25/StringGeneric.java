package ua.smartprog.lesson_25;

public class StringGeneric {
    public static Pair<String> findMinMax(String[] str) {
        if (str == null || str.length == 0) return null;
        String min = str[0];
        String max = str[0];
        for (int i = 0; i < str.length; i++) {
            if (min.compareTo(str[i]) < 0) min = str[i];
            if (max.compareTo(str[i]) > 0) max = str[i];
        }
        return new Pair<String>(min, max);
    }

    public static <T> T getMiddle(T... array){
        return array[array.length/2];
    }
}
