package pl.uwm.rybinski.Lab11.Zad1.Lab08.Zad1;
import com.sun.istack.internal.NotNull;

import java.time.LocalDate;


public class Pracownik extends Osoba {
    private double pensja;
    private LocalDate dataZatrudnienia;

    public Pracownik(@NotNull String nazwisko, @NotNull gender plec,
                     @NotNull LocalDate dataUrodzenia, String[] imiona,
                     @NotNull LocalDate dataZatrudnienia, double pensja) {
        super(nazwisko, plec, dataUrodzenia, imiona);
        if(dataZatrudnienia == null)
            throw new NullPointerException("Null was passed to Pracownik constructor");

        this.dataZatrudnienia = dataZatrudnienia;
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return String.join(delimiter, super.toString(),
                            String.valueOf(this.pensja), dataZatrudnienia.toString());
    }
    public LocalDate getDataZatrudnienia(){ return this.dataZatrudnienia; }
    public double getPensja(){
        return this.pensja;
    }


}
