//package pl.uwm.rybinski.Lab11.Zad1.Lab07;
//import com.sun.istack.internal.NotNull;
//
//import java.util.ArrayList;
//import java.util.Objects;
//import java.util.Scanner;
//import java.util.stream.Stream;
//
//public class Adres {
//    private String ulica, miasto, kod_pocztowy, numer_domu, numer_mieszkania;
//    private static ArrayList<Adres> storage = new ArrayList<Adres>();
//
//    public Adres(@NotNull String ulica, @NotNull String miasto,
//                 @NotNull String kod_pocztowy, @NotNull String numer_domu,
//                 @NotNull String numer_mieszkania){
//
//        if(Stream.of(ulica, miasto, kod_pocztowy, numer_domu, numer_mieszkania).anyMatch(n -> n == null))
//            throw new NullPointerException("null was given to Adres constructor");
//
//        this.ulica = ulica;
//        this.kod_pocztowy = kod_pocztowy;
//        this.numer_domu = numer_domu;
//        this.numer_mieszkania = numer_mieszkania;
//        this.miasto = miasto;
//        storage.add(this);
//    }
//
//    public Adres(@NotNull String ulica, @NotNull String miasto,
//                 @NotNull String kod_pocztowy, @NotNull String numer_domu){
//
//        if(Stream.of(ulica, miasto, kod_pocztowy, numer_domu).anyMatch(n -> n == null))
//            throw new NullPointerException("null was given to Adres constructor");
//
//        this.ulica = ulica;
//        this.kod_pocztowy = kod_pocztowy;
//        this.numer_domu = numer_domu;
//        this.miasto = miasto;
//        storage.add(this);
//    }
//
//    public boolean publicboolean(){
//        for (Adres i:
//             storage) {
//            if(i != this && (Objects.equals(this.kod_pocztowy, i.kod_pocztowy)))
//                return true;
//        }
//        return false;
//    }
//
//    private static String console_load(){
//        String res;
//        Scanner input = new Scanner(System.in);
//        res = input.nextLine();
//        return res;
//    }
//
//
//    public void pokaz(){
//        String sep = " ";
//        System.out.println(this.miasto + sep + this.kod_pocztowy);
//        if(this.numer_mieszkania == null){
//            System.out.println(ulica + sep + numer_domu);
//        }
//        else{
//            System.out.println(ulica + sep + numer_domu + "/" + numer_mieszkania);
//        }
//    }
//
//    public static void main(String[] Args){
//
//    }
//}
