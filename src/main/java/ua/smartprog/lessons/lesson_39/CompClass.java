package ua.smartprog.lessons.lesson_39;

public class CompClass<T extends Comparable<T>> implements MinMax<T> {
    public T[] values;

    public CompClass(T[] values) {
        this.values = values;
    }

    @Override
    public T min() {
        T v = values[0];

        for (int i = 0; i <values.length ; i++) {
            if (values[i].compareTo(v) < 0) v = values[i];
        }
        return v;
    }

    @Override
    public T max() {
        T v = values[0];

        for (int i = 0; i <values.length ; i++) {
            if (values[i].compareTo(v) > 0) v = values[i];
        }
        return v;
    }

    public static void main(String[] args) {
        Integer[] iNumbers = {3, 5, 8 ,20};
        Character[] chs = {'e', 'r', 'a' ,'d'};

        CompClass<Integer> iObj = new CompClass<Integer>(iNumbers);
        CompClass<Character> cObj = new CompClass<Character>(chs);

        System.out.println("Min for iobj = " + iObj.min() + " max = " + iObj.max());
        System.out.println("Min for cobj = " + cObj.min() + " max = " + cObj.max());
    }


}
