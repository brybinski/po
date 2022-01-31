//package pl.uwm.rybinski.Lab08.Zad3;
//
//import java.time.LocalDate;
//import java.util.Objects;
//
//public class Fortepian extends Instrument {
//    public Fortepian(String producent, LocalDate rok_produkcji){
//        super(producent, rok_produkcji);
//    }
//    @Override
//    public void dzwiek() {
//        System.out.println("tu tu  tu  tu tu ");
//    }
//    @Override
//    public String toString() {
//        return String.join(delimiter, "Fortepian", super.toString());
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Fortepian)) return false;
//        Fortepian that = (Fortepian) o;
//        return getProducent().equals(that.getProducent()) && getRokProdukcji().equals(that.getRokProdukcji());
//
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(31, getProducent(), getRokProdukcji());
//    }
//}
