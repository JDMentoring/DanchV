package ua.smartprog.lesson_38;

import ua.smartprog.lesson_31.Sale;

public class GenRunner {
    public static void main(String[] args) {
        Gen<Integer> iObj;
        iObj = new Gen<Integer>(250);
        System.out.println(iObj.toString());

        int value0 = iObj.getObj();

        Gen<String> sObj;
        sObj = new Gen<String>("DAnylo");
        System.out.println(sObj.toString());

        GenNone iObj2;
        iObj2 = new GenNone(250);
        System.out.println(iObj2.toString());

        int value = (Integer) iObj2.getObj();
        System.out.println("value = "+value);

        GenNone sObj2 = new GenNone("Some line");
        System.out.println(sObj2.toString());
        String str = (String) sObj2.getObj();

    }
}
