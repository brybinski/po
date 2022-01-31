//package pl.uwm.rybinski;
//import com.sun.istack.internal.NotNull;
//
//import java.time.Year;
//import java.util.stream.Stream;
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
