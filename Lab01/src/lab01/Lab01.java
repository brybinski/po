/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;
import java.util.Scanner;

/**
 *
 * @author local
 */
public class Lab01 {
    int nr;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Count: ");
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        
        float[] arr = new float[n];
                
        
        for(int i = 0; i<n; i++){
            float tmp = 0;
            int where = i+1;
            System.out.println("Number " + where  + ": ");
            Scanner dfinput = new Scanner(System.in);
            tmp = Float.parseFloat(dfinput.nextLine());
            arr[i] = tmp;
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
        s
    }
    
}
