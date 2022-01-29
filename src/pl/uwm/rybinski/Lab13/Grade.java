package pl.uwm.rybinski.Lab13;

public class Grade implements Comparable<Grade> {
    private String grade;
    private double value;

    public Grade(double value){
        if (value == 2.) {
            this.grade = "ndst";
            this.value = value;
        } else if (value == 2.5) {
            this.grade = "ndst+";
            this.value = value;
        } else if (value == 3.) {
            this.grade = "dst";
            this.value = value;
        } else if (value == 3.5) {
            this.grade = "dst+";
            this.value = value;
        } else if (value == 4.) {
            this.grade = "db";
            this.value = value;
        } else if (value == 4.5) {
            this.grade = "db+";
            this.value = value;
        } else if (value == 5.) {
            this.grade = "bdb";
            this.value = value;
        } else throw new IllegalArgumentException();
    }

    public String getGrade() {
        return grade;
    }

    public double getValue() {
        return value;
    }

    @Override
    public int compareTo(Grade o) {
        return 0;
    }
}
