//package pl.uwm.rybinski;
//import com.sun.istack.internal.NotNull;
//import java.awt.*;
//import java.time.Year;
//import java.util.ArrayList;
//import java.util.Objects;
//import java.util.Scanner;
//
//import java.util.stream.Stream;
////I used Stream.of().anyMatch() just becouse I am lazy
////and I don't like repetitive clauses
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
//        String res = "";
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
//
//
//
//public class Osoba {
//    private String nazwisko;
//    private Year rok_urodzenia;
//
//    public Osoba(@NotNull String nazwisko, @NotNull Year rok_urodzenia){
//        if(Stream.of(nazwisko, rok_urodzenia).anyMatch(n -> n == null))
//            throw new NullPointerException("null passed to Osoba constructor");
//
//        this.nazwisko = nazwisko;
//        this.rok_urodzenia = rok_urodzenia;
//    }
//
//
//    public String toString(){
//        return (this.nazwisko + " " + this.rok_urodzenia);
//    }
//
//    public String getNazwisko(){
//        return this.nazwisko;
//    }
//    public Year getRok_urodzenia(){
//        return this.rok_urodzenia;
//    }
//}
//
//
//
//
//public class Student extends pl.uwm.rybinski.Osoba {
//    private String kierunek;
//
//    public Student(@NotNull String nazwisko, @NotNull Year rok_urodzenia, @NotNull String kierunek) {
//        super(nazwisko, rok_urodzenia);
//        if(kierunek == null)
//            throw new NullPointerException("null was passed to Student constructor");
//
//        this.kierunek = kierunek;
//    }
//
//    public String toString(){
//        return super.toString() + " " + this.kierunek;
//    }
//
//    public String getKierunek(){
//        return this.kierunek;
//    }
//}
//
//public class Nauczyciel extends Osoba {
//    private double pensja;
//
//    public Nauczyciel(@NotNull String nazwisko, @NotNull Year rok_urodzenia, double pensja) {
//        super(nazwisko, rok_urodzenia);
//        this.pensja = pensja;
//    }
//
//    public String toString() {
//        return (super.toString() + " " + this.pensja);
//    }
//
//    public double getPensja(){
//        return this.pensja;
//    }
//
//}
//
//public class BetterRectangle extends Rectangle{
//
//    //I couldn't find better way to pass superclass constructors to subclass
//    //I know I did not have to write all constructors, but I did them just 4fun
//    public BetterRectangle(){
//        super();
//    }
//    public BetterRectangle(int width, int height ){
//        super(width, height);
//    }
//    public BetterRectangle(int x, int y, int width, int height){
//        super(x, y, width, height);
//    }
//    public BetterRectangle(@NotNull Point p){
//        super(p);
//    }
//    public BetterRectangle(@NotNull Dimension d) {
//        super(d);
//    }
//    public BetterRectangle(@NotNull Point p, @NotNull Dimension d){
//        super(p, d);
//    }
//    public BetterRectangle(@NotNull Rectangle r){
//        super(r);
//    }
//
//    public double getPerimeter(){
//        return 2*this.getHeight()+2*this.getWidth();
//    }
//
//    public double getArea(){
//        return this.getHeight()*this.getWidth();
//    }
//}
//
//
//public class Tests {
//
//
//    public static void main(String[] args){
//        ArrayList<Object> arr = new ArrayList<Object>();
//        pl.uwm.rybinski.Osoba os = new pl.uwm.rybinski.Osoba("Rybiński", Year.of(2000));
//        arr.add(os);
//        pl.uwm.rybinski.Student robak = new pl.uwm.rybinski.Student("Robak", Year.of(2001), "Inżynieria korozji");
//        arr.add(robak);
//        pl.uwm.rybinski.Nauczyciel teacher = new pl.uwm.rybinski.Nauczyciel("Kowalski", Year.of(1989), 4000.00);
//        arr.add(teacher);
//        pl.uwm.rybinski.BetterRectangle r = new pl.uwm.rybinski.BetterRectangle(4, 7);
//        arr.add(r.getArea());
//        arr.add(r.getPerimeter());
//        pl.uwm.rybinski.Adres x = new pl.uwm.rybinski.Adres("Dom", "Olsztyn", "10-691", "3534");
//        x.pokaz();
//        pl.uwm.rybinski.Adres y = new pl.uwm.rybinski.Adres("Słoneczna", "Olsztyn", "10-691", "54");
//        System.out.println(y.publicboolean());
//
//        arr.forEach(n -> {System.out.println(n);});
//        // I thought about asserts but didn't have time to write them,
//        // so in case of Null arguments my classes throw exceptions simply to avoid werid errors
//    }
//}
//
