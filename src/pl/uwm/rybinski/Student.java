package pl.uwm.rybinski;

import java.time.Year;

public class Student extends Osoba{
    private String kierunek;

    public Student(String nazwisko, Year rok_urodzenia, String kierunek) {
        super(nazwisko, rok_urodzenia);
        this.kierunek = kierunek;
    }

    public String toString(){
        return super.toString() + " " + this.kierunek;
    }

    public String getKierunek(){
        return this.kierunek;
    }
}
