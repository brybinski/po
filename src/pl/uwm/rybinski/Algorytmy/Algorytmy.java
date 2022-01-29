package pl.uwm.rybinski.Algorytmy;

import java.util.Collection;
import java.util.List;

public class Algorytmy {



    public static <T extends Comparable<T>> void quickSort(T[] arr, int begin, int end) {
        if (begin < end) {

            int cut = partition(arr, begin, end);
            quickSort(arr, begin, cut-1);
            quickSort(arr, cut+1, end);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int begin, int end) {

        T somePick = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(somePick) <= 0) {
                i++;
                T tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        T tmp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = tmp;

        return i+1;
    }

}
