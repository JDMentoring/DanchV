package ua.smartprog.pyramid_sort;

/**
 * Created by Тарас on 26.04.2017.
 */
public class heap_sort<T extends Number> {
    public void sort(T[] array) {
        int len = array.length;
        makeHeap(array);
        while (len > 0) {
            swap(array, 0, len - 1);
            len--;
            makeSubHeap(array, len, 0);
        }
    }

    public void makeSubHeap(T[] arrayToSubHeap, int length, int place) {
        while (2 * place + 1 < length) {
            int temp = 2 * place + 1;

            if (2 * place + 2 < length && arrayToSubHeap[2 * place + 1] < arrayToSubHeap[2 * place + 2]) {
                temp = 2 * place + 2;
            }

            if (arrayToSubHeap[place] < arrayToSubHeap[temp]) {
                swap(arrayToSubHeap, temp, place);
            } else {
                break;
            }
        }
        ;
    }

    public T[] makeHeap(T[] arrayToHeap) {
        int len = arrayToHeap.length;
        for (int i = len - 1; i >= 0; i--) {
            makeSubHeap(arrayToHeap, len, i);
        }
        return arrayToHeap;
    }

    public void swap(T[] array, int pos1, int pos2) {
        T temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }


}
