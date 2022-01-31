//package pl.uwm.rybinski.Lab11.Zad1.Lab08.Zad3;
//
//import java.time.LocalDate;
//import java.util.Objects;
//
//public class Flet extends Instrument {
//
//    public Flet(String producent, LocalDate rok_produkcji){
//        super(producent, rok_produkcji);
//    }
//
//    @Override
//    public void dzwiek() {
//        System.out.println("pisk pisk pisk");
//    }
//    @Override
//    public String toString() {
//        return String.join(delimiter, "Flet", super.toString());
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Flet)) return false;
//        Flet that = (Flet) o;
//        return getProducent().equals(that.getProducent()) && getRokProdukcji().equals(that.getRokProdukcji());
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(11, getProducent(), getRokProdukcji());
//    }
//}
