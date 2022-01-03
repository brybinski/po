package pl.uwm.rybinski.Lab08.Zad1;
import com.sun.istack.internal.NotNull;
import java.time.LocalDate;

public class Student extends Osoba {
    private String kierunek;
    private double sredniaOcen;
    public Student(@NotNull String nazwisko, @NotNull Osoba.gender plec,
                   @NotNull LocalDate dataUrodzenia, String[] imiona, @NotNull String kierunek,
                   double sredniaOcen) {
        super(nazwisko, plec, dataUrodzenia, imiona);
        if(kierunek == null)
            throw new NullPointerException("null was passed to Student constructor");

        if(sredniaOcen > 5 || sredniaOcen < 2) {
            throw new IllegalArgumentException("sredniaOcen with invalid value was passed to constructor");
        }

        this.sredniaOcen = sredniaOcen;
        this.kierunek = kierunek;
    }


    public String toString(){
        return String.join(delimiter,
                super.toString(), this.kierunek, String.valueOf(this.sredniaOcen));
    }
    public void setSredniaOcen(double srednia) {
        if(srednia > 5 || srednia < 2) {
            throw new IllegalArgumentException("sredniaOcen with invalid value was passed to setSredniaOcen()");}
        this.sredniaOcen = srednia;
    }
    public double getSredniaOcen() { return this.sredniaOcen; }
    public String getKierunek(){
        return this.kierunek;
    }
}

