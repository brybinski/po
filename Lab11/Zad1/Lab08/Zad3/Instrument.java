//package pl.uwm.rybinski.Lab11.Zad1.Lab08.Zad3;
//import java.time.LocalDate;
//import java.util.Objects;
//import java.util.stream.Stream;
//
//public abstract class Instrument {
//    public static String delimiter = " ";
//    private String producent;
//    private LocalDate rokProdukcji;
//
//    public Instrument(String producent, LocalDate rokProdukcji){
//        if(Stream.of(producent, rokProdukcji).anyMatch(n -> n == null))
//            throw new NullPointerException();
//
//        this.producent = producent;
//        this.rokProdukcji = rokProdukcji;
//    }
//    public abstract void dzwiek();
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Instrument)) return false;
//        Instrument that = (Instrument) o;
//        return getProducent().equals(that.getProducent()) && getRokProdukcji().equals(that.getRokProdukcji());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getProducent(), getRokProdukcji());
//    }
//
//    @Override
//    public String toString() {
//        return String.join(delimiter, this.producent, this.rokProdukcji.toString());
//    }
//    public String getProducent(){return producent;}
//    public LocalDate getRokProdukcji(){return rokProdukcji;}
//}
