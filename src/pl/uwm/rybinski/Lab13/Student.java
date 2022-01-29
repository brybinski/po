package pl.uwm.rybinski.Lab13;

public class Student implements Comparable<Student> {
    private static int last_id = 0;
    private String imie;
    private String nazwisko;
    private int id;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = last_id+1;
        Student.last_id++;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
