
package Lab01;
import java.util.Scanner;


public class Lab01 {
    int nr;


    public static long factorial(int num){
        long result = 1;
        for (int i = 2; i <= num; i++){
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) {

//        System.out.println("Count: ");
//        Scanner input = new Scanner(System.in);
//        int n = Integer.parseInt(input.nextLine());
//
//        float[] arr = new float[n];
//
//
//        for(int i = 0; i < n; i++){
//            float tmp1;
//            int where = i+1;
//            System.out.println("Number " + where  + ": ");
//            Scanner dfinput = new Scanner(System.in);
//            tmp1 = Float.parseFloat(dfinput.nextLine());
//            arr[i] = tmp1;
//        }

        int n = 4;
        double[] arr = {1.52, 23.4, 123.533, 353.123};
        //a
        float a = 0;
        for (int i = 0; i < n; i++) {
            a += arr[i];
        }
        System.out.println("a) " + a);


        //b
        float b = 1;
        for (int i = 0; i < n; i++) {
            b *= arr[i];
        }
        System.out.println("b) " + b);

        //c
        float c = 0;
        for (int i = 0; i < n; i++) {
            c += Math.abs(arr[i]);
        }
        System.out.println("c) " + c);

        //d
        float d = 0;
        for (int i = 0; i < n; i++) {
            d += Math.sqrt(Math.abs(arr[i]));
        }
        System.out.println("d) " + d);

        //e
        float e = 1;
        for (int i = 0; i < n; i++) {
            e *= Math.abs(arr[i]);
        }
        System.out.println("e) " + e);


        //f
        float f = 0;
        for (int i = 0; i < n; i++) {
            f += arr[i]*arr[i];
        }
        System.out.println("f) " + f);


        //g
        System.out.println("g) " + a + " ; " + b);


        //h
        float h = 0;
        for(int i = 0; i < n; i++) {
            h += arr[i] * Math.pow(-1, i+2);
        }
        System.out.println("h) " + h);

        //i
        float exi = 0;
        for(int i = 0; i < n; i++){
            exi += (arr[i] * Math.pow(-1, i+1))/factorial(i+1);
        }
        System.out.println("i) " + exi);

        //ex 2
        System.out.print("\n");
        for(int i = 0; i<n;i++){
            System.out.print(arr[i] + ", ");
        }


        //
        //Część 2
        System.out.println("\n\nPart 2\n");

        //        System.out.println("Count: ");
//        Scanner input = new Scanner(System.in);
//        int n = Integer.parseInt(input.nextLine());
//
//        int[] arr = new int[n];
//
//
//        for(int i = 0; i < n; i++){
//            int tmp1;
//            int where = i+1;
//            System.out.println("Number " + where  + ": ");
//            Scanner dfinput = new Scanner(System.in);
//            tmp1 = Int.parseInt(dfinput.nextLine());
//            arr[i] = tmp1;
//        }
        
        int n2 = 6;
        int[] arr2 = {3, 4, 5, 17, 19, 15};
        
        //Zad1
        //a
        
        int a2 = 0;
        for (int i: arr2) {
            if(i % 2 == 0)
                a2++;
        }
        System.out.println("a) "+a2);


        //b

        int b2 = 0;
        for (int i: arr2) {
            if(i % 3 == 0 && i  % 5 != 0)
                b2++;
        }
        System.out.println("b) "+b2);


        //c

        int c2 = 0;
        for (int i: arr2) {
            if(Math.sqrt(i) % 2 == 0)
                c2++;
        }
        System.out.println("c) "+c2);

        //d

        int d2 = 0;
        for (int i = 1; i < n2-1; i++) {
            int tmp =(arr2[i+1] + arr2[i-1]);
            if( tmp/2 < arr2[i] ){
                d2++;
            }

        }
        System.out.println("d) " + d2);

        //e
        int e2 = 0;
        for(int i = 0; i < n2; i++){
            if(Math.pow(2,i+1) < arr2[i] && arr2[i] < factorial(i+1))
                e2++;
        }
        System.out.println("e) "+ e2);
        
        
        //f

        int f2 = 0;
        for (int i = 0; i< n2; i++) {
            if(Math.sqrt(i) % 2 == 0)
                f2++;
        }
        System.out.println("f) "+f2);
    }
}
