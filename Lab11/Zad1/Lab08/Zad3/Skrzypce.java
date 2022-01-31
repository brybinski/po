//package pl.uwm.rybinski.Lab11.Zad1.Lab08.Zad3;
//
//import java.time.LocalDate;
//import java.util.Objects;
//
//public class Skrzypce extends Instrument {
//    public Skrzypce(String producent, LocalDate rok_produkcji) {
//        super(producent, rok_produkcji);
//    }
//
//    @Override
//    public void dzwiek() {
//        System.out.println("skrzyp skrzyp");
//    }
//
//    @Override
//    public String toString() {
//        return String.join(delimiter, "Skrzypce", super.toString());
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Skrzypce)) return false;
//        Skrzypce that = (Skrzypce) o;
//        return getProducent().equals(that.getProducent()) && getRokProdukcji().equals(that.getRokProdukcji());
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(2137 ,getProducent(), getRokProdukcji());
//    }
//}