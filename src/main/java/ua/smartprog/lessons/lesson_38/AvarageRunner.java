package ua.smartprog.lessons.lesson_38;

public class AvarageRunner {
    public static void main(String[] args) {
        Integer inumb[] = {1,6,9,8,7};
        Double dnumb[] = {2.3,8.6,7.6};

        Avarage<Integer> iObj = new Avarage<Integer>(inumb);
        Avarage<Double> dObj = new Avarage<Double>(dnumb);


        System.out.println(iObj.getAvarage());
        System.out.println(dObj.getAvarage());


        System.out.println(iObj.sameAvg(dObj));


    }
}
