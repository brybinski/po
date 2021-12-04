package pl.uwm.rybinski;

import java.time.Year;

public class Nauczyciel extends Osoba {
    private double pensja;

    public Nauczyciel(String nazwisko, Year rok_urodzenia, double pensja) {
        super(nazwisko, rok_urodzenia);
        this.pensja = pensja;
    }

    public String toString() {
        return (super.toString() + " " + this.pensja);
    }

    public double getPensja(){
        return this.pensja;
    }

}
