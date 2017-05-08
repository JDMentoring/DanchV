package ua.smartprog.lessons.lesson_11;

public class Protection {
    int n = 10;
    private int n_pri = 11;
    protected int n_pro = 12;
    public int n_pub = 13;

    public Protection(){
        System.out.println("Base class");
        System.out.println("n ="+n);
        System.out.println("n_pri ="+n_pri);
        System.out.println("n_pro ="+n_pro);
        System.out.println("n_pub ="+n_pub);
    }


}
