package pl.uwm.rybinski;


import java.time.Year;

public class Osoba {
    private String nazwisko;
    private Year rok_urodzenia;

    public Osoba(String nazwisko, Year rok_urodzenia){
        this.nazwisko = nazwisko;
        this.rok_urodzenia = rok_urodzenia;
    }


    public String toString(){
        return (this.nazwisko + " " + this.rok_urodzenia);
    }
    
    public String getNazwisko(){
        return this.nazwisko;
    }
    public Year getRok_urodzenia(){
        return this.rok_urodzenia;
    }
}
