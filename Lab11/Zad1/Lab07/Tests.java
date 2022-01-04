package pl.uwm.rybinski.Lab11.Zad1.Lab07;

import java.time.Year;
import java.util.ArrayList;


public class Tests {


    public static void main(String[] args){
        ArrayList<Object> arr = new ArrayList<Object>();
        Osoba os = new Osoba("Rybiński", Year.of(2000));
        arr.add(os);
        Student robak = new Student("Robak", Year.of(2001), "Inżynieria korozji");
        arr.add(robak);
        Nauczyciel teacher = new Nauczyciel("Kowalski", Year.of(1989), 4000.00);
        arr.add(teacher);
        BetterRectangle r = new BetterRectangle(4, 7);
        arr.add(r.getArea());
        arr.add(r.getPerimeter());
        Adres x = new Adres("Dom", "Olsztyn", "10-691", "3534");
        x.pokaz();
        Adres y = new Adres("Słoneczna", "Olsztyn", "10-691", "54");
        System.out.println(y.publicboolean());

        arr.forEach(n -> {System.out.println(n);});

    }
}
