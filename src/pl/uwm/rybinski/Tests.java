package pl.uwm.rybinski;
import java.time.Year;
import java.util.ArrayList;


public class Tests {
    public static void main(String[] args){
        ArrayList<Object> arr = new ArrayList<Object>();
        Osoba os = new Osoba("Rybiński", Year.of(2000));
        arr.add(os);
        Student robak = new Student("Robak", Year.of(2137), "Kulturoznawstwo");
        arr.add(robak);
        arr.forEach((n) -> {System.out.println(n);});

    }
}
