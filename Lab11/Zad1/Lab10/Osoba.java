//package pl.uwm.rybinski.Lab11.Zad1.Lab10;
//
//import com.sun.istack.internal.NotNull;
//import pl.uwm.rybinski.Global;
//
//import java.text.Collator;
//import java.time.LocalDate;
//import java.util.Locale;
//import java.util.Objects;
//import java.util.stream.Stream;
//
//
//public class Osoba implements Comparable<Osoba>, Cloneable{
//    private String nazwisko;
//    private LocalDate dataUrodzenia;
//
//    public Osoba(@NotNull String nazwisko, @NotNull LocalDate dataUrodzenia){
//        if(Stream.of(nazwisko, dataUrodzenia).anyMatch(Objects::isNull))
//            throw new IllegalArgumentException();
//
//        this.nazwisko = nazwisko;
//        this.dataUrodzenia = dataUrodzenia;
//    }
//
//    @Override
//    public int compareTo(Osoba o) {
//        if(this.equals(o))
//            return 0;
//        if(this.nazwisko.equals(o.getNazwisko()))
//            return this.dataUrodzenia.compareTo(o.getDataUrodzenia());
//        else{
//            Collator c = Collator.getInstance(new Locale("pl", "PL"));
//            return c.compare(this.nazwisko, o.getNazwisko());
//        }
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Osoba)) return false;
//        Osoba osoba = (Osoba) o;
//        return Objects.equals(nazwisko, osoba.getNazwisko()) && Objects.equals(dataUrodzenia, osoba.getDataUrodzenia());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nazwisko, dataUrodzenia);
//    }
//
//    @Override
//    public Osoba clone() {
//        return new Osoba(this.nazwisko, this.dataUrodzenia);
//    }
//
//    @Override
//    public String toString() {
//        return "Osoba[" + String.join(Global.delimiter, this.nazwisko, this.dataUrodzenia.toString()) + "]";
//    }
//
//    public String getNazwisko() {
//        return nazwisko;
//    }
//
//    public LocalDate getDataUrodzenia() {
//        return dataUrodzenia;
//    }
//
//}
