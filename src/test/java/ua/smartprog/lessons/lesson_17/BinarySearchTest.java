package ua.smartprog.lessons.lesson_17;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class BinarySearchTest {
    private int[] numbers;
    private final static int SIZE = 100000;
    private final static int MAX = 65000;

    @Before
    public void setUp() throws Exception {
        Random arrayGener = new Random();
        numbers = new int[SIZE];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = arrayGener.nextInt(MAX);
        }
    }

    @Test
    public void sortTest() throws Exception {
        BinarySearch bs1 = new BinarySearch();
        numbers = bs1.selectionsort(numbers);
        assertTrue(numbers[0] < numbers[numbers.length - 2]);
    }

    @Test
    public void searchTest() throws Exception {
         BinarySearch bs2 = new BinarySearch();
         numbers = bs2.selectionsort(numbers);
         int searchValue = 25;
         numbers[numbers.length - 1] = searchValue;
         assertTrue(bs2.search(searchValue, numbers));
    }

    @Test
    public void searchBinaryTest() throws Exception {
        BinarySearch bs2 = new BinarySearch();
        numbers = bs2.selectionsort(numbers);
        int searchValue = 25;
        numbers[numbers.length - 2] = searchValue;
        assertTrue(bs2.searchBinary(searchValue, numbers));
    }
}