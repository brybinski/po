package Lab01;
import java.util.Scanner;

public class Zadanie1 {
    int nr;

    public static void main(String[] args) {

        System.out.println("Count: ");
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        float[] arr = new float[n];


        for(int i = 0; i<n; i++){
            float tmp1;
            int where = i+1;
            System.out.println("Number " + where  + ": ");
            Scanner dfinput = new Scanner(System.in);
            tmp1 = Float.parseFloat(dfinput.nextLine());
            arr[i] = tmp1;
        }

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
    }

}
