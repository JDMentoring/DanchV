package ua.smartprog.lessons.lesson_17;

public class BinarySearch {
    public int[] selectionsort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[j] < numbers[index]) //Finds smallest number
                    index = j;
            int smallerNumber = numbers[index];  //Swap
            numbers[index] = numbers[i];
            numbers[i] = smallerNumber;
        }
        return numbers;
    }

    public boolean search(int value, int[] array) {
        boolean check = false;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                check = true;

            } else {
                check = false;

            }
        }
        return check;
    }

    public boolean searchBinary(int value, int[] array) {
        boolean check = false;
        int lo = 0;
        int hi = array.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (value < array[mid]) hi = mid - 1;
            else if (value > array[mid]) lo = mid + 1;
            else check = true;
        }
        return check;
    }
}
