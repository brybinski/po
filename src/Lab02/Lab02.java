package Lab02;
import java.util.Random;
import java.util.Scanner;


public class Lab02 {
    //a
    public static int ileNieparzystych(int[] tab){
        int result = 0;
             for (int i : tab) {
                 if (i % 2 != 0)
                     result++;
             }

        return result + 1;
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

        //noinspection IntegerDivisionInFloatingPointContext
        for(int i = 0; i < Math.floor((prawy-lewy+1)/2); i++)
        {
            int val = tab[lewy+i];
            tab[lewy+i] = tab[prawy-i];
            tab[prawy-i] = val;
        }
    }



    static public void main(String[] args) {

        Tests.testFunctions();

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
                         System.out.println("Wrong number");
                 } catch (Exception E) {
                     System.out.println("Something went wrong try again ;)");
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
                System.out.print(String.valueOf(i) + ", ");
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
                         System.out.println("Wrong number");
                 } catch (Exception E) {
                     System.out.println("Something went wrong try again ;)");
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
                         System.out.println("Wrong number");
                 } catch (Exception E) {
                     System.out.println("Something went wrong try again ;)");
                 }
             }

         }

        //noinspection IntegerDivisionInFloatingPointContext
        for(int i = 0; i < Math.floor((prawy-lewy+1)/2); i++)
         {
             int val = arr[lewy+i];
             arr[lewy+i] = arr[prawy-i];
             arr[prawy - i] = val;
         }
         for(int i: arr)
             System.out.print(i+ ", ");


    }
}
