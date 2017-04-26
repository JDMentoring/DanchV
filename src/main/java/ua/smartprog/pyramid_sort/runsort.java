package ua.smartprog.pyramid_sort;

import java.util.DoubleSummaryStatistics;

/**
 * Created by Тарас on 26.04.2017.
 */
public class runsort {
    public static void main(String[] args) {
        Double temp = 60.3;
        Double[] dArray = new Double[20];
        for (int i = 0; i < dArray.length; i++){
            dArray[i] = temp + 40;
            temp--;
        }
        for (int i = 0; i < dArray.length; i++){
            System.out.println(dArray[i]);
        }        heap_sort<Double> sortArray= new heap_sort<Double>();
        sortArray.sort(dArray);
        for (int i = 0; i < dArray.length; i++){
            if (i == 0){
                System.out.printf("\n");
            }
            System.out.println(dArray[i]);
        }
    }
}
