package pl.uwm.rybinski.Lab08.Zad1;
import com.sun.istack.internal.NotNull;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

public class Osoba {
    public static String delimiter = " ";


    public enum gender{

        // politically correct enum instead of boolean
        // *repo root is master tho xD*
        O("inna/woliniepodawać"),
        M("Mężczyzna"),
        F("Kobieta");
        public final String label;
        private gender(String label){
            this.label = label;
        }

    }
    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private gender plec;

    public Osoba(@NotNull String nazwisko, @NotNull Osoba.gender plec,
                 @NotNull LocalDate dataUrodzenia, @NotNull String[] imiona){

        if(Stream.of(nazwisko, plec, dataUrodzenia, imiona).anyMatch(n -> n == null)) throw new NullPointerException("null passed to Osoba constructor");

        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
        this.nazwisko = nazwisko;
    }


    public String toString(){
        //this was fun
        return String.join(delimiter, Stream.concat(Arrays.stream(this.imiona), Arrays.stream(new String[]{nazwisko, this.plec.label, String.valueOf(this.dataUrodzenia)})).toArray(size -> (String[]) Array.newInstance(this.imiona.getClass().getComponentType(), size)));
    }

    public String[] getImiona(){return this.imiona;}
    public String getNazwisko(){
        return this.nazwisko;
    }
    public gender getPlec() {return this.plec;}
    public LocalDate getDataUrodzenia(){
        return this.dataUrodzenia;
    }
    public static void setDelimiter(String delimiter_set){
        delimiter = delimiter_set;
    }
}
