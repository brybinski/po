package Lab02;

import java.util.Random;
import java.util.Scanner;

public class Tests {



    public static void testFunctions() {
        int n = 6;
        int[] arr = {0, -1, 2, 5, 4, 5};

        // a
        {
            int result = 0;
            for (int i : arr) {
                if (i % 2 == 0)
                    result++;
            }
            assert result == 3: "Even/Odds is invalid";
            assert result == Lab02.ileParzystych(arr): "ileParzystych is invalid";
            assert (n-result) == Lab02.ileNieparzystych(arr): "ileNieparzystych is invalid";
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
            assert zero == 1: "Zeroes count is invalid";
            assert zero == Lab02.ileZerowych(arr): "ileZerowych() is invalid";
            assert negative == 1: "Negative count is invalid";
            assert negative == Lab02.ileUjemnych(arr): "ileUjemnych is invalid";
            assert positive == 4: "Positive count is invalid";
            assert positive == Lab02.ileDodatnich(arr): "ileDodatnich() is invalid";
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
                if (i <= min) {
                    if (i == min)
                        min_count++;
                    else {
                        min = i;
                        min_count = 1;
                    }
                }
            }
            assert max_count == 2;

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

            assert negative == -1: "Negative sum is invalid";
            assert negative == Lab02.sumaUjemnych(arr);
            assert positive == 16: "Positive sum is invalid";
            assert positive == Lab02.sumaDodatnich(arr);
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
            assert result == 4: "Max positive combo is invalid";
            assert result == Lab02.dlugoscMaksymalnegoCiaguDodatnich(arr): "dlugoscMaksymalnegoCiaguDodatniego() is invalid";
        }

//        //f
//        {
//            for (int i = 0; i < n; i++) {
//                if (arr[i] > 0)
//                    arr[i] = 1;
//                if (arr[i] < 0)
//                    arr[i] = -1;
//            }
//            for (int i : arr) {
//                System.out.print(String.valueOf(i) + ", ");
//            }
//            System.out.print("\n");
//        }

        //g
        int lewy = 1;
        int prawy = 3;

        //noinspection IntegerDivisionInFloatingPointContext
        for(int i = 0; i < Math.floor((prawy-lewy+1)/2); i++)
        {
            int val = arr[lewy+i];
            arr[lewy+i] = arr[prawy-i];
            arr[prawy - i] = val;
        }
        {
            int[] test1 = {0, 5, 2, -1, 4, 5};
            for(int i = 0; i < n; i++)
                assert arr[i] == test1[i]: "Flipping is invalid";
            
            int[] test2 = {5, 4, -1, 2, 5, 0};
            Lab02.odwrocFragment(arr, 0, 5);

            for(int i = 0; i < n; i++)
                assert arr[i] == test2[i]: "odwrocFragment() is invalid";
        }

    }
}
