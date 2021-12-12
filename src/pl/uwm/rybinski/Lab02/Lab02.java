package pl.uwm.rybinski.Lab02;

import java.util.Random;
import java.util.Scanner;


public class Lab02 {

    public static int consoleLoadInt(int rangeLeft, int rangeRight){
        if(rangeLeft > rangeRight)
            throw new IllegalArgumentException("Left value is greater than right value");
        System.out.println("Input number between "+ rangeLeft + " and " + rangeRight);
        int result = 0;
        {
            Scanner input = new Scanner(System.in);
            boolean done = false;

            while (!done) {

                try {
                    result = Integer.parseInt(input.nextLine());
                    if (!(result < rangeLeft || result > rangeRight))
                        done = true;
                    else
                        System.out.println("Invalid number");
                } catch (NumberFormatException E) {
                    System.out.println("This is not integer, try again ;)");
                }
            }
        }
        return result;
    }
    //a
    public static int ileNieparzystych(int[] tab){
        int result = 0;
             for (int i : tab) {
                 if (i % 2 != 0)
                     result++;
             }

        return result;
    }
    public static int ileParzystych(int[] tab){
        int result = 0;
        for (int i : tab) {
            if (i % 2 == 0)
                result++;
        }

        return result;
    }

    //b
    public static int ileDodatnich(int[] tab){
             int positive = 0;
             for (int i : tab) {
                 if (i > 0)
                     positive++;
             }
             return positive;
    }
    public static int ileUjemnych(int[] tab){
        int negative = 0;
        for (int i : tab) {
            if (i < 0)
                negative++;
        }
        return negative;
    }
    public static int ileZerowych(int[] tab){
        int zeroes = 0;
        for (int i : tab) {
            if (i < 0)
                zeroes++;
        }
        return zeroes;
    }
    //c
    public static int ileMaksymalnych(int[] tab){
        int max = Integer.MIN_VALUE;
        int max_count = 1;
        for (int i : tab) {
            if (i >= max) {
                if (i == max)
                    max_count++;
                else {
                    max = i;
                    max_count = 1;
                }
            }
        }
        return max_count;
    }
    //d
    public static int sumaDodatnich(int[] tab){
        int positive = 0;
        for (int i : tab) {

            if (i > 0)
                positive += i;
        }
        return positive;
    }
    public static int sumaUjemnych(int[] tab){
        int negative = 0;
        for (int i : tab) {
            if (i < 0)
                negative += i;
        }
        return negative;
    }
    //e
    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab){
        int result = 0;
        int tmp = 0;
        for (int i : tab) {
            if (i > 0)
                tmp++;
            if (tmp > result)
                result = tmp;
            if (i < 1)
                tmp = 0;
        }
        return result;
    }
    //f
    public static void signum(int[] tab){
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] > 0)
                    tab[i] = 1;
                if (tab[i] < 0)
                    tab[i] = -1;
            }
    }
    //g
    public static void odwrocFragment(int[] tab, int lewy, int prawy){
        if(lewy > prawy){
            int tmp = lewy;
            lewy = prawy;
            prawy = tmp;
        }
        if(prawy >= tab.length)
            throw new IllegalArgumentException("Right is out of bounds");

        //noinspection IntegerDivisionInFloatingPointContext
        for(int i = 0; i < Math.floor((prawy-lewy+1)/2); i++)
        {
            int val = tab[lewy+i];
            tab[lewy+i] = tab[prawy-i];
            tab[prawy-i] = val;
        }
    }

    //zamiast przekazywać pustą tablicę generuję ją poprzez funkcję i zwracam
    public static int[] generuj (int n, int min, int max) {
        if(min > max)
            throw new IllegalArgumentException("min is greater than max");
        int[] tab = new int[n];
        Random r = new Random();
        for (int j = 0; j < tab.length; ++j) {
            int range = max - min;
            tab[j] = min + Math.abs(r.nextInt() % range + 1);
        }
        return tab;
    }

    public static void printArray(int[] arr){
        System.out.print("{");
        for(int i = 0; i < arr.length-1; i++)
            System.out.print(arr[i]+ ", ");
        System.out.print(arr[arr.length-1]+"}\n");
    }

    public static int[][] generateIntMatrix(int m, int n, int min, int max){
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++){
            matrix[i] = generuj(n, min, max);
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        System.out.print("\n{");
        for (int i = 0; i < matrix.length-1; i++) {
            System.out.print("{");
            for (int j = 0; j < matrix[0].length-1; j++)
                System.out.print(matrix[i][j] + ", ");
            System.out.print(matrix[i][matrix[i].length-1] + "},\n");
        }
        System.out.print("{");
        for (int j = 0; j < matrix[matrix.length-1].length-1; j++)
            System.out.print(matrix[matrix.length-1][j] + ", ");
        System.out.print(matrix[matrix.length-1][matrix[0].length-1]);
        System.out.print("}}\n");
    }
    
    public static int dotProduct(int[] a, int[] b){
        if(a.length != b.length)
            throw new IllegalArgumentException("vectors are different size");
        int result = 0;
        for(int i =0; i < a.length; i++)
        {
            result += (a[i] * b[i]);
        }
        
        return result;
    }
    public static int[][] transposeMatrix(int[][] matrix){
        int[][] result = new int[matrix[0].length][matrix.length];
        int[] tmp = new int [matrix.length];
        for(int i =0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix.length; j++){
                tmp[j] = matrix[j][i];
            }
            System.arraycopy(tmp, 0, result[i], 0, result[i].length);
        }
        return result;
    }
    public static int[][] multiplyMatrices(int[][] a, int[][] b){
        if(a[0].length != b.length)
            throw new IllegalArgumentException("cannot multiply matricies of this size");
        int[][] c = new int[a.length][b[0].length];
        int[][] tmp = transposeMatrix(b);
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b[0].length; j++)
                c[i][j] = dotProduct(a[i], tmp[j]);
        }
        return c;
    }
    static public void main(String[] args) {
        Tests.test();

        System.out.println("\nZadanie 1");
        {
            System.out.println("Input number between 1 and 100");
            int n = 0;
            {
                Scanner input = new Scanner(System.in);
                boolean done = false;

                while (!done) {

                    try {
                        n = Integer.parseInt(input.nextLine());
                        if (!(n > 100 || n < 1))
                            done = true;
                        else
                            System.out.println("Invalid number");
                    } catch (NumberFormatException E) {
                        System.out.println("This is not integer, try again ;)");
                    }
                }
            }

            Random generator = new Random(System.currentTimeMillis());
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = generator.nextInt() % 10;
            }

            // a
            {
                int result = 0;
                for (int i : arr) {
                    if (i % 2 == 0)
                        result++;
                }
                System.out.println("Evens: " + result);
                System.out.println("Odds: " + (n - result));
                assert result == ileDodatnich(arr);

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

                System.out.println("Zeroes: " + zero);
                System.out.println("Negatives: " + negative);
                System.out.println("Positives: " + positive);
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

                System.out.println("Max: " + max);
                System.out.println("Min: " + min);
                System.out.println("Max count: " + max_count);
                System.out.println("Min: " + min_count);

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


                System.out.println("Negatives sum: " + negative);
                System.out.println("Positives sum: " + positive);
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
                System.out.println("Longest positive combo: " + result);
            }

            //f
            {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0)
                        arr[i] = 1;
                    if (arr[i] < 0)
                        arr[i] = -1;
                }
                for (int i : arr) {
                    System.out.print(i + ", ");
                }
                System.out.print("\n");
            }

            //g
            int lewy = 0;
            int prawy = 0;
            {
                System.out.println("Input left");
                Scanner input = new Scanner(System.in);
                boolean done = false;

                while (!done) {

                    try {
                        lewy = Integer.parseInt(input.nextLine());
                        if (lewy >= 0 && lewy < n)
                            done = true;
                        else
                            System.out.println("Invalid number");
                    } catch (NumberFormatException E) {
                        System.out.println("This is not integer, try again ;)");
                    }
                }
            }
            {
                System.out.println("Input right");
                Scanner input = new Scanner(System.in);
                boolean done = false;

                while (!done) {

                    try {
                        prawy = Integer.parseInt(input.nextLine());
                        if (prawy >= lewy && prawy < arr.length)
                            done = true;
                        else
                            System.out.println("Invalid number");
                    } catch (NumberFormatException E) {
                        System.out.println("This is not integer, try again ;)");
                    }
                }

            }

            //noinspection IntegerDivisionInFloatingPointContext
            for (int i = 0; i < Math.floor((prawy - lewy + 1) / 2); i++) {
                int val = arr[lewy + i];
                arr[lewy + i] = arr[prawy - i];
                arr[prawy - i] = val;
            }
            for (int i : arr)
                System.out.print(i + ", ");
        }

        System.out.println("\nZadanie 2");
        {
            int[] arr = generuj(consoleLoadInt(1, 100), -999, 999);
            printArray(arr);

            {
                System.out.println("Odds: " + ileNieparzystych(arr));
                System.out.println("Even: " + ileParzystych(arr));
                System.out.println("Positives: " + ileDodatnich(arr));
                System.out.println("Negatives: " + ileUjemnych(arr));
                System.out.println("Zeroes: " + ileZerowych(arr));
                System.out.println("Max values: " + ileMaksymalnych(arr));
                System.out.println("Sum of positives: " + sumaDodatnich(arr));
                System.out.println("Sum of negatives: " + sumaUjemnych(arr));
                System.out.println("Max positives in a row: " + dlugoscMaksymalnegoCiaguDodatnich(arr));
                signum(arr);
                printArray(arr);
                int tmp = consoleLoadInt(0, arr.length - 1);
                odwrocFragment(arr, tmp, consoleLoadInt(tmp, arr.length - 1));
                printArray(arr);
            }
        }

        System.out.println("\nZadanie 3");
        {
            int m = consoleLoadInt(1, 10);
            int n = consoleLoadInt(1, 10);
            int k = consoleLoadInt(1, 10);

            int[][] a = generateIntMatrix(m, n, -1000, 10);
            int[][] b = generateIntMatrix(n, k, -10, 1000);

            printMatrix(a);
            printMatrix(b);

            int[][] c = multiplyMatrices(a, b);

            printMatrix(c);
        }
    }
}
