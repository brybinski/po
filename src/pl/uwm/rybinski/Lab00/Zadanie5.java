package pl.uwm.rybinski.Lab00;

public class Zadanie5 {


    public static void wypisz(String text){
        int len = text.length();
        System.out.println();
        System.out.print("+");
        for (int i = 0; i < len; i++){
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
        System.out.println("|"  + text + "|");
        System.out.print("+");
        for (int i = 0; i < len; i++){
            System.out.print("-");
        }
        System.out.print("+");
    }

    public static void main(String[] args){
        wypisz("S Z C Z U R Y");
    }
}
