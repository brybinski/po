package Lab00;

public class Zadanie4 {
    public static double CountInterest(int a, double b, int c, int d){
        int initBal = a; //gr
        double interest = b;
        int time = c; //years
        int period = d; //count of capitalizations in single year

        double result = (initBal * Math.pow((1+ (interest / (100*period))), period*time));
        return result;
    }

    public static void main(String[] args){
        System.out.println(CountInterest(1000, 0.06, 1, 1));
        System.out.println(CountInterest(1000, 0.06, 2, 1));
        System.out.println(CountInterest(1000, 0.06, 3, 1));

    }
}
