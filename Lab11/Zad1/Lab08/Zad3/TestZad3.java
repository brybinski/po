package pl.uwm.rybinski.Lab11.Zad1.Lab08.Zad3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

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
