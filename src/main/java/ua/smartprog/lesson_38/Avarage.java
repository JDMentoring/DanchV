package ua.smartprog.lesson_38;

import java.io.Serializable;

public class Avarage<T extends Number> {
    private  T[] numbers;

    public Avarage(T[] numbers) {
        this.numbers = numbers;
    }

    public double getAvarage(){
        double sum = 0;

        for (int i = 0; i <numbers.length ; i++) {
            sum+= numbers[i].doubleValue();
        }

        return sum/numbers.length;

    }

    boolean sameAvg(Avarage<?> obj){
        if (getAvarage() == obj.getAvarage()){
            return  true;
        }else  return false;
    }
}
