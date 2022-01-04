package pl.uwm.rybinski.Lab11.ArrayUtil;


import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtil {

    public static <T extends Comparable<T>> boolean isSorted(T[] table){
        for(int i = 0; i < table.length-1; i++){
            if(table[i].compareTo((T) table[i+1]) > 0)
                return false;
        }
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] table, T obj){
        if(!isSorted(table))
            throw new IllegalArgumentException("Binary search on unsorted table");

        int L = 0;
        int R = table.length-1;
        while(L != R){
            int m = (int) Math.ceil((L + R ) /2);
            int tmp = table[m].compareTo(obj);
            if(tmp == 0)
                return m;
            else if(tmp < 0)
                L = m+1;
            else
                R = m;
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] table){
        for (int i = 0; i < table.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < table.length; j++) {

                if (table[j].compareTo(table[min]) < 0) {
                    min = j;
                }
            }

            if (min != i) {
                T tmp = table[i];
                table[i] = table[min];
                table[min] = tmp;
            }
        }
    }



    private static <T extends Comparable<T>> void merge(T[] tab, int l, int m, int p, T[] t)
    {
        int i, j;

        for(i = m + 1; i > l; i--)
            t[i-1] = tab[i-1];
        for(j = m; j < p; j++)
            t[p+m-j] = tab[j+1];


        for(int k = l; k <= p; k++)
            if(t[j].compareTo(t[i]) < 0)
                tab[k] = t[j--];
            else
                tab[k] = t[i++];

    }

    private static <T extends Comparable<T>> void mergeSortLogic(T[] tab, int l, int r, T[] t){
        if(r > l){
            int m = (l + r)/2;
            mergeSortLogic(tab, l, m, t);
            mergeSortLogic(tab,m+1, l, t);
            merge(tab, l, m, r, t);

        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] table){
        T[] t = Arrays.copyOf(table, table.length);

        mergeSortLogic(table, 0, table.length-1, t);
    }


    public static void main(String[] args){

        Integer[] tab1 = {3, 1, 6, 5, 6, 8, 7};
        LocalDate[] tab2 = {LocalDate.of(1999, 11, 3),
                            LocalDate.of(1999, 11, 6),
                            LocalDate.of(2000, 11, 3),
                            LocalDate.of(2011, 11, 8),
                            LocalDate.of(2005, 11, 8)};
        System.out.println(isSorted(tab1));
        mergeSort(tab1);
        selectionSort(tab2);
        System.out.println(isSorted(tab1));
        System.out.println(isSorted(tab2));
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));
        //System.out.println(binSearch(tab1, 7));
        System.out.println(binSearch(tab2, LocalDate.of(2000,11,3)));




    }
}
