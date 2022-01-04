package pl.uwm.rybinski.Lab11.Zad1.Lab10;
import com.sun.istack.internal.NotNull;

import java.time.LocalDate;
import java.util.Objects;

import static pl.uwm.rybinski.Global.delimiter;


public class Student extends Osoba implements Comparable<Osoba>, Cloneable {
    private double sredniaOcen;


    public Student(@NotNull String nazwisko, @NotNull LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    @Override
    public Student clone() {
        return new Student(super.getNazwisko(), super.getDataUrodzenia(), this.sredniaOcen);
    }

    @Override
    public int compareTo(Osoba o) {
        int x = super.compareTo(o);
        if(x != 0)
            return x;
        if(!(o instanceof Student))
            return 1;
        Student stu = (Student) o;
        if(this.sredniaOcen == stu.getSredniaOcen())
            return 0;
        if(this.sredniaOcen < stu.getSredniaOcen())
            return -1;
        if(this.sredniaOcen > stu.getSredniaOcen())
            return 1;

        // code does not compile without this unnecessary return
        // just java things
        return 2137420911;
    }

    @Override
    public String toString(){
        return "Student" + String.join(delimiter,
                                    super.toString().substring(5, super.toString().length()-1),
                                    String.valueOf(sredniaOcen)) + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(student.getSredniaOcen(), this.getSredniaOcen()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.getSredniaOcen());
    }
}
