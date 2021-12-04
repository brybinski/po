package pl.uwm.rybinski;
import java.util.ArrayList;
import java.util.Scanner;

public class Adres {
    private String ulica, miasto, kod_pocztowy, numer_domu, numer_mieszkania;
    private ArrayList<Adres> storage = new ArrayList<Adres>();

    public Adres(String ulica, String miasto, String kod_pocztowy, String numer_domu, String numer_mieszkania){
        this.ulica = ulica;
        this.kod_pocztowy = kod_pocztowy;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        storage.add(this);
    }

    public Adres(String ulica, String miasto, String kod_pocztowy, String numer_domu){
        this.ulica = ulica;
        this.kod_pocztowy = kod_pocztowy;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        storage.add(this);
    }

    public boolean publicboolean(){
        for (Adres i:
             storage) {
            if(i != this && this.kod_pocztowy == i.kod_pocztowy)
            return true;
        }
        return false;
    }

    private static String console_load(){
        String res = "";
        Scanner input = new Scanner(System.in);
        res = input.nextLine();
        return res;
    }


    public void pokaz(){
        String sep = " ";
        System.out.println(this.miasto + sep + this.kod_pocztowy);
        if(this.numer_mieszkania == null){
            System.out.println(ulica + sep + numer_domu);
        }
        else{
            System.out.println(ulica + sep + numer_domu + "/" + numer_mieszkania);
        }
    }

    public static void main(String[] Args){
        Adres x = new Adres("Słoneczna", "Olsztyn", "10-691", "54");
        x.pokaz();
        Adres y = new Adres("Słoneczna", "Olsztyn", "10-691", "54");
        System.out.println(y.publicboolean());
    }
}
