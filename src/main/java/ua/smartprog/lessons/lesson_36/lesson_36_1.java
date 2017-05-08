package ua.smartprog.lessons.lesson_36;

public class lesson_36_1 {
    public static void main(String[] args) {
        // try / catch  | try/catch/finally | throw | throws
        subProgram();
    }

    static void subProgram(){
        try {
            int d = 0;
            int a = 50 / d;
            System.out.println("Message inside try");
        } catch (ArithmeticException e) {
            System.out.println("Message inside catch");
            //e.printStackTrace();
        }

        System.out.println("Message outside try/catch");
    }

}
