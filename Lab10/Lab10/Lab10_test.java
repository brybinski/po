package pl.uwm.rybinski.Lab10;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

//just to make things easier I combined all of tests


public class Lab10_test {
    public static void main(String[] args){

        ArrayList<Osoba> grupa = new ArrayList();

        grupa.add(new Osoba("Rybiński", LocalDate.of(2000, 4, 14)));
        grupa.add(new Osoba("Maruszewszki", LocalDate.of(2000, 4, 14)));
        grupa.add(new Osoba("Rybiński", LocalDate.of(2001, 4, 14)));
        grupa.add(new Osoba("Klaus", LocalDate.of(1995, 7, 15)));
        grupa.add(new Osoba("Analfabeta", LocalDate.of(2499, 4, 14)));
        grupa.add(new Student("Kowalski", LocalDate.of(2499, 4, 14), 2.9));
        grupa.add(new Student("Kowalski", LocalDate.of(2499, 4, 14), 4.0));
        grupa.add(new Student("Zygmunt", LocalDate.of(2001, 4, 14), 4.0));
        grupa.add(new Student("Dzban", LocalDate.of(2005, 4, 2), 2.137));


        grupa.sort(Comparator.naturalOrder());
        grupa.forEach(System.out::println);

        Zad3.main(new String[]{"D:\\test.txt"});
    }
}
