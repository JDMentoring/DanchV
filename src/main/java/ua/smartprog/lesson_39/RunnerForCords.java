package ua.smartprog.lesson_39;

public class RunnerForCords {
    public static void main(String[] args) {
        TwoDimentions tda[] = {new TwoDimentions(12, 145), new TwoDimentions(13, 6), new TwoDimentions(123213, 46)};
        FourDimention fda[] = {new FourDimention(12, 145, 123123, 645),
                new FourDimention(13, 6, 6, 7),
                new FourDimention(123213, 46, 123123,1)};
        Cordinates<FourDimention> fdc = new Cordinates<FourDimention>(fda);
        Cordinates<TwoDimentions> tdc = new Cordinates<TwoDimentions>(tda);
        Cordinates.showXY(tdc);
        Cordinates.showXYZ(fdc);
    }
}
