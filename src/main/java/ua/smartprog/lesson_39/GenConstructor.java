package ua.smartprog.lesson_39;

public class GenConstructor {
    private double value;

    <T extends Number> GenConstructor(T args){
        value = args.doubleValue();
    }

    @Override
    public String toString() {
        return "GenConstructor{" +
                "value=" + value +
                '}';
    }


    public static void main(String[] args) {
        GenConstructor test1 =  new GenConstructor(1000);
        GenConstructor test2 = new GenConstructor(1.25566);

        System.out.println(test1.toString());
        System.out.println(test2.toString());


    }
}
