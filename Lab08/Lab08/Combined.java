package pl.uwm.rybinski.Lab08
import com.sun.istack.internal.NotNull;
import java.lang.reflect.Array;
import java.util.stream.Stream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

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



public class Pracownik extends Osoba {
    private double pensja;
    private LocalDate dataZatrudnienia;

    public Pracownik(@NotNull String nazwisko, @NotNull Osoba.gender plec,
                     @NotNull LocalDate dataUrodzenia, String[] imiona,
                     @NotNull LocalDate dataZatrudnienia, double pensja) {
        super(nazwisko, plec, dataUrodzenia, imiona);
        if(dataZatrudnienia == null)
            throw new NullPointerException("Null was passed to Pracownik constructor");

        this.dataZatrudnienia = dataZatrudnienia;
        this.pensja = pensja;
    }

    public String toString() {
        return String.join(delimiter, super.toString(),
                String.valueOf(this.pensja), dataZatrudnienia.toString());
    }
    public LocalDate getDataZatrudnienia(){ return this.dataZatrudnienia; }
    public double getPensja(){
        return this.pensja;
    }


}

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

public class TestZad1 {
    public static void main(String[] Args){

        Osoba os = new Osoba("Kowalski", Osoba.gender.M,
                LocalDate.of(2000, 4, 14),
                new String[]{"Bartosz"});
        Student stu = new Student("up", Osoba.gender.F, LocalDate.of(2005, 4, 5),
                new String[]{"Never", "gonna", "give", "you"}, "Suicydologia", 4.4);
        ArrayList<Object> arr = new ArrayList<Object>(Arrays.asList(os, stu));
        Osoba.setDelimiter(" ");

        ArrayList<Object> test_osoba_1 = new ArrayList<Object>(Arrays.asList(stu.getNazwisko(),
                stu.getPlec(), stu.getDataUrodzenia(), String.join("", stu.getImiona()),
                stu.getKierunek(), stu.getSredniaOcen()));
        ArrayList<Object> test_osoba_2 = new ArrayList<Object>(Arrays.asList("up", Osoba.gender.F,
                LocalDate.of(2005, 4, 5),
                "Nevergonnagiveyou", "Suicydologia", 4.4));




        //This was quite easy code, so I did something unprofessional and tested multiple things at the same time
        Pracownik prac = new Pracownik("up", Osoba.gender.F, LocalDate.of(2005, 4, 5),
                new String[]{"Never", "gonna", "give", "you"}, LocalDate.of(2006, 4, 6), 4.4);

        for(int i = 0; i < test_osoba_1.size(); i++){
            if(!test_osoba_1.get(i).equals(test_osoba_2.get(i)))
                throw new AssertionError("idk how much stuff is broken but glhf debugging that");
        }

        stu.setSredniaOcen(2.0);
        if(stu.getSredniaOcen() != 2.0)
            throw new AssertionError("You had to fail...");

        ArrayList<Object> test_pracownik_1 = new ArrayList<Object>(Arrays.asList(prac.getNazwisko(),
                prac.getPlec(), prac.getDataUrodzenia(), String.join("", prac.getImiona()), prac.getDataZatrudnienia(), prac.getPensja()
        ));
        ArrayList<Object> test_pracownik_2 = new ArrayList<Object>(Arrays.asList("up", Osoba.gender.F,
                LocalDate.of(2005, 4, 5),
                "Nevergonnagiveyou", LocalDate.of(2006, 4, 6), 4.4 ));

        for(int i = 0; i < test_pracownik_1.size(); i++){
            if(!test_pracownik_1.get(i).equals(test_pracownik_2.get(i)))
                throw new AssertionError("now at least I can tell that something is wrong with Pracownik");
        }

        //win+R -> intl.cpl -> administrative -> region settings -> beta utf-8
        arr.forEach(n -> {System.out.println(n);});
    }
}


public abstract class Instrument {
    public static String delimiter = " ";
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji){
        if(Stream.of(producent, rokProdukcji).anyMatch(n -> n == null))
            throw new NullPointerException();

        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }
    public abstract void dzwiek();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Instrument)) return false;
        Instrument that = (Instrument) o;
        return getProducent().equals(that.getProducent()) && getRokProdukcji().equals(that.getRokProdukcji());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducent(), getRokProdukcji());
    }

    public String toString() {
        return String.join(delimiter, this.producent, this.rokProdukcji.toString());
    }
    public String getProducent(){return producent;}
    public LocalDate getRokProdukcji(){return rokProdukcji;}
}


public class Flet extends Instrument {

    public Flet(String producent, LocalDate rok_produkcji){
        super(producent, rok_produkcji);
    }

    @Override
    public void dzwiek() {
        System.out.println("pisk pisk pisk");
    }
    @Override
    public String toString() {
        return String.join(delimiter, "Flet", super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flet)) return false;
        Flet that = (Flet) o;
        return getProducent().equals(that.getProducent()) && getRokProdukcji().equals(that.getRokProdukcji());

    }

    @Override
    public int hashCode() {
        return Objects.hash(11, getProducent(), getRokProdukcji());
    }
}

public class Fortepian extends Instrument {
    public Fortepian(String producent, LocalDate rok_produkcji){
        super(producent, rok_produkcji);
    }
    @Override
    public void dzwiek() {
        System.out.println("tu tu  tu  tu tu ");
    }
    @Override
    public String toString() {
        return String.join(delimiter, "Fortepian", super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fortepian)) return false;
        Fortepian that = (Fortepian) o;
        return getProducent().equals(that.getProducent()) && getRokProdukcji().equals(that.getRokProdukcji());

    }
    @Override
    public int hashCode() {
        return Objects.hash(31, getProducent(), getRokProdukcji());
    }
}

public class Skrzypce extends Instrument {
    public Skrzypce(String producent, LocalDate rok_produkcji) {
        super(producent, rok_produkcji);
    }

    @Override
    public void dzwiek() {
        System.out.println("skrzyp skrzyp");
    }

    @Override
    public String toString() {
        return String.join(delimiter, "Skrzypce", super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Skrzypce)) return false;
        Skrzypce that = (Skrzypce) o;
        return getProducent().equals(that.getProducent()) && getRokProdukcji().equals(that.getRokProdukcji());

    }

    @Override
    public int hashCode() {
        return Objects.hash(2137 ,getProducent(), getRokProdukcji());
    }
}


public class TestZad3 {
    public static void main(String[] args){

        //I couldn't find this list array class, so I used ArrayList
        ArrayList<Instrument> orkiestra = new ArrayList<>(Arrays.asList(
                new Flet("ktoś", LocalDate.of(2001, 9, 11)),
                new Skrzypce("coś", LocalDate.of(2677, 2, 5)),
                new Skrzypce("coś", LocalDate.of(2677, 2, 5)),
                new Fortepian("coś", LocalDate.of(2677, 2, 5)),
                new Fortepian("coś", LocalDate.of(2677, 2, 5))
        ));

        orkiestra.forEach(Instrument::dzwiek);

        if(orkiestra.get(2).equals(orkiestra.get(4)) || !orkiestra.get(2).equals(orkiestra.get(1)))
            throw new AssertionError();

    }
}
