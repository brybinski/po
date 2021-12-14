package pl.uwm.rybinski.Lab08.Zad1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


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
