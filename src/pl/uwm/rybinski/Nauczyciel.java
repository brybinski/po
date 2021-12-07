package pl.uwm.rybinski;

import com.sun.istack.internal.NotNull;
import java.time.Year;
import java.util.stream.Stream;

public class Nauczyciel extends Osoba {
    private double pensja;

                                //to future me: primitives in java cannot be Null
    public Nauczyciel(@NotNull String nazwisko, @NotNull Year rok_urodzenia, double pensja) {
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
