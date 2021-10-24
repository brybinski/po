package Lab02;

import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class Tests {
    public static boolean functionTests(){
        int n = 6;
        int[] arr = {0, -1, 2, 5, 4, 5};

        // a
        {
            int result = 0;
            for (int i : arr) {
                if (i % 2 == 0)
                    result++;
            }
            if (result != 3) throw new AssertionError(  "Even/Odds test is invalid");
            if(result != Lab02.ileParzystych(arr)) throw new AssertionError("ileParzystych() is invalid");
            if((n-result) != Lab02.ileNieparzystych(arr)) throw new AssertionError("ileNieparzystych() is invalid");
        }
        //b
        {
            int zero = 0;
            int negative = 0;
            int positive = 0;
            for (int i : arr) {
                if (i == 0)
                    zero++;
                else if (i > 0)
                    positive++;
                else
                    negative++;
            }
            if(zero != 1) throw new AssertionError("Zeroes count test is invalid");
            if(zero != Lab02.ileZerowych(arr)) throw new  AssertionError("ileZerowych() is invalid");
            if(negative != 1) throw new  AssertionError("Negative count test is invalid");
            if(negative != Lab02.ileUjemnych(arr)) throw new AssertionError( "ileUjemnych() is invalid");
            if(positive != 4) throw new AssertionError(  "Positive count test is invalid");
            if(positive != Lab02.ileDodatnich(arr)) throw new AssertionError(  "ileDodatnich() is invalid");
        }
        //c
        {
            int min = Integer.MAX_VALUE;
            int min_count = 1;
            int max = Integer.MIN_VALUE;
            int max_count = 1;
            for (int i : arr) {
                if (i >= max) {
                    if (i == max)
                        max_count++;
                    else {
                        max = i;
                        max_count = 1;
                    }
                }
            }
            if(max_count != 2) throw new AssertionError("Max count test is invalid");
            if(max_count != Lab02.ileMaksymalnych(arr)) throw new AssertionError("ileMaksymalnych() is invalid");

        }
        //d
        {
            int negative = 0;
            int positive = 0;
            for (int i : arr) {

                if (i > 0)
                    positive += i;
                if (i < 0)
                    negative += i;
            }

            if(negative != -1) throw new AssertionError("Negative sum test is invalid");
            if(negative != Lab02.sumaUjemnych(arr)) throw new AssertionError("sumaUjemnych() is invalid");
            if(positive != 16) throw new AssertionError("Positive sum test is invalid");
            if(positive != Lab02.sumaDodatnich(arr)) throw new AssertionError("sumaDodatnich() is invalid");
        }

        //e
        {
            int result = 0;
            int tmp = 0;
            for (int i : arr) {
                if (i > 0)
                    tmp++;
                if (tmp > result)
                    result = tmp;
                if (i < 1)
                    tmp = 0;
            }
            if(result != 4) throw new AssertionError("Max positive combo test is invalid");
            if(result != Lab02.dlugoscMaksymalnegoCiaguDodatnich(arr)) throw new AssertionError("dlugoscMaksymalnegoCiaguDodatniego() is invalid");
        }

        //g
        int lewy = 1;
        int prawy = 3;

        for(int i = 0; i < (prawy-lewy+1)/2; i++)
        {
            int val = arr[lewy+i];
            arr[lewy+i] = arr[prawy-i];
            arr[prawy - i] = val;
        }
        //int[] arr = {0, -1, 2, 5, 4, 5};
        {
            int[] test1 = {0, 5, 2, -1, 4, 5};
            for(int i = 0; i < arr.length; i ++)
                if(arr[i] != test1[i]) throw new AssertionError("reverse part test is invalid");

            int[] test2 = {5, 4, -1, 2, 5, 0};
            Lab02.odwrocFragment(arr, 0, 5);
            for(int i = 0; i < n; i++)
                if(arr[i] != test2[i]) throw new AssertionError("odwrocFragment() is invalid");
        }

        //f

        {

            int[] tmp = new int[arr.length];
            System.arraycopy(arr, 0, tmp, 0, arr.length);

            for (int i = 0; i < n; i++) {
                if (arr[i] > 0)
                    arr[i] = 1;
                if (arr[i] < 0)
                    arr[i] = -1;
            }
            int[] test = {1, 1, -1, 1, 1, 0};
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] != test[i]) throw new AssertionError("signum test is invalid");
            }

            Lab02.signum(tmp);

            for(int i = 0; i < arr.length; i++) {
                if (tmp[i] != test[i]) throw new AssertionError("signum() is invalid");
            }

        }
        return true;
    }

    public static boolean matrixTests(){

        return true;
    }
    public static void main(String[] args){

        functionTests();
        matrixTests();
    }
}
