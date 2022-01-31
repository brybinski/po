//package pl.uwm.rybinski.Lab10;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.text.Collator;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Locale;
//import java.util.stream.Stream;
//import com.sun.istack.internal.NotNull;
//import java.time.LocalDate;
//import java.util.Objects;
//import java.util.Comparator;
//
//public class Global {
//    public static String delimiter = " ";
//
//    public static void setDelimiter(@NotNull String delimit){
//        Global.delimiter = delimit;
//    }
//}
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
//
//public class Student extends Osoba implements Comparable<Osoba>, Cloneable {
//    private double sredniaOcen;
//
//
//    public Student(@NotNull String nazwisko, @NotNull LocalDate dataUrodzenia, double sredniaOcen) {
//        super(nazwisko, dataUrodzenia);
//        this.sredniaOcen = sredniaOcen;
//    }
//
//    public double getSredniaOcen() {
//        return sredniaOcen;
//    }
//
//    @Override
//    public Student clone() {
//        return new Student(super.getNazwisko(), super.getDataUrodzenia(), this.sredniaOcen);
//    }
//
//    @Override
//    public int compareTo(Osoba o) {
//        int x = super.compareTo(o);
//        if(x != 0)
//            return x;
//        if(!(o instanceof Student))
//            return 1;
//        Student stu = (Student) o;
//        if(this.sredniaOcen == stu.getSredniaOcen())
//            return 0;
//        if(this.sredniaOcen < stu.getSredniaOcen())
//            return -1;
//        if(this.sredniaOcen > stu.getSredniaOcen())
//            return 1;
//
//        // code does not compile without this unnecessary return
//        // just java things
//        return 2137420911;
//    }
//
//    @Override
//    public String toString(){
//        return "Student" + String.join(delimiter,
//                super.toString().substring(5, super.toString().length()-1),
//                String.valueOf(sredniaOcen)) + "]";
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student)) return false;
//        if (!super.equals(o)) return false;
//        Student student = (Student) o;
//        return Double.compare(student.getSredniaOcen(), this.getSredniaOcen()) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), this.getSredniaOcen());
//    }
//}
//
//public class Zad3 {
//    public static void main(String[] args)  {
//
//        ArrayList<String> result = new ArrayList();
//        try (Stream<String> stream = Files.lines(Paths.get(args[0]))) {
//            stream.forEach(result::add);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        result.sort(Collator.getInstance(new Locale("pl", "PL")));
//        result.forEach(System.out::println);
//    }
//}
//
//
////just to make things easier I combined all of tests
//public class Lab10_test {
//    public static void main(String[] args){
//
//        ArrayList<Osoba> grupa = new ArrayList();
//
//        grupa.add(new Osoba("Rybiński", LocalDate.of(2000, 4, 14)));
//        grupa.add(new Osoba("Maruszewszki", LocalDate.of(2000, 4, 14)));
//        grupa.add(new Osoba("Rybiński", LocalDate.of(2001, 4, 14)));
//        grupa.add(new Osoba("Klaus", LocalDate.of(1995, 7, 15)));
//        grupa.add(new Osoba("Analfabeta", LocalDate.of(2499, 4, 14)));
//        grupa.add(new Student("Kowalski", LocalDate.of(2499, 4, 14), 2.9));
//        grupa.add(new Student("Kowalski", LocalDate.of(2499, 4, 14), 4.0));
//        grupa.add(new Student("Zygmunt", LocalDate.of(2001, 4, 14), 4.0));
//        grupa.add(new Student("Dzban", LocalDate.of(2005, 4, 2), 2.137));
//
//
//        grupa.sort(Comparator.naturalOrder());
//        grupa.forEach(System.out::println);
//
//        Zad3.main(new String[]{"D:\\test.txt"});
//    }
//}
