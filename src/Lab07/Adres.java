package Lab07;
import java.util.List;
import java.util.Scanner;

public class Adres {
    private String ulica, miasto, kod_pocztowy, numer_domu, numer_mieszkania;
    private List<String> storage;

    public Adres(String ulica, String miasto, String kod_pocztowy, String numer_domu, String numer_mieszkania){
        this.ulica = ulica;
        this.kod_pocztowy = kod_pocztowy;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        storage.add(kod_pocztowy);
    }

    public Adres(String ulica, String miasto, String kod_pocztowy, String numer_domu){
        this.ulica = ulica;
        this.kod_pocztowy = kod_pocztowy;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
    }

    //TODO: this
    public boolean publicboolean(){
        return true;
    }

    private static String console_load(){
        String res = "";
        Scanner input = new Scanner(System.in);
        res = input.nextLine();
        return res;
    }

    //TODO: Format check
    private static Adres inputAdres(){
        String ulica = console_load();
        String miasto = console_load();
        String kod_pocztowy = console_load();
        String numer_domu = console_load();
        String numer_mieszkania = console_load();

        Adres res = new Adres(ulica, miasto, kod_pocztowy, numer_domu, numer_mieszkania);
        return res;
    }

    public void Pokaz(){
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
//        Adres y = inputAdres();
//        Adres z = inputAdres();
        x.Pokaz();
//        y.Pokaz();
//        z.Pokaz();
    }
}
