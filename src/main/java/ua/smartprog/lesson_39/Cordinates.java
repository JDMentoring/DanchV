package ua.smartprog.lesson_39;

public class Cordinates<T extends TwoDimentions> {
    public T[] cordinates;

    public Cordinates(T[] cordinates) {
        this.cordinates = cordinates;
    }

    public static void showXY(Cordinates<?> cords) {
        for (int i = 0; i < cords.cordinates.length; i ++){
            System.out.println("x = " + cords.cordinates[i].x + "; y = " +  cords.cordinates[i].y);
        }
    }
    public static void showXYZ(Cordinates<? extends ThreeDimention> cords) {
        for (int i = 0; i < cords.cordinates.length; i ++){
            System.out.println("x = " + cords.cordinates[i].x + "; y = " +  cords.cordinates[i].y + "; z = " + cords.cordinates[i].z);
        }
    }

}
