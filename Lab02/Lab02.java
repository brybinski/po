package Lab02;
import java.util.Random;
import java.util.Scanner;


public class Lab02 {


     static public void main(String[] args) {

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
         for (int i = 0; i < n; i++) {
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
             System.out.println("Longest even combo: " + result);
         }

         //f
         {
             for (int i = 0; i < n; i++) {
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
                     if (lewy >= 1 && lewy <= n)
                         done = true;
                     else
                         System.out.println("Wrong number");
                 } catch (Exception E) {
                     System.out.println("Something went wrong try again ;)");
                 }
             }
         }

         System.out.println("Input right");
         {
             Scanner input = new Scanner(System.in);
             boolean done = false;

             while (!done) {

                 try {
                     prawy = Integer.parseInt(input.nextLine());
                     if (prawy >= lewy && prawy <= n)
                         done = true;
                     else
                         System.out.println("Wrong number");
                 } catch (Exception E) {
                     System.out.println("Something went wrong try again ;)");
                 }
             }
         }

         {

         }
    }
}
