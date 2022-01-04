package pl.uwm.rybinski.Lab11.Zad1.Lab07;

import com.sun.istack.internal.NotNull;

import java.time.Year;

public class Student extends Osoba {
    private String kierunek;

    public Student(@NotNull String nazwisko, @NotNull Year rok_urodzenia, @NotNull String kierunek) {
        super(nazwisko, rok_urodzenia);
        if(kierunek == null)
            throw new NullPointerException("null was passed to Student constructor");

        this.kierunek = kierunek;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.kierunek;
    }

    public String getKierunek(){
        return this.kierunek;
    }
}
