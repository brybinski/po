package Lab06;
import java.math.BigDecimal;
import java.math.MathContext;

public class RachunekBankowy {
    public static BigDecimal rocznaStopaProcentowa = new BigDecimal("0.05");
    private BigDecimal saldo;

    //TODO: long implementation
    public RachunekBankowy(){
      this.saldo = new BigDecimal("0.") ;
    }
    public RachunekBankowy(BigDecimal saldo){
        this.saldo = saldo;
    }
    public RachunekBankowy(double saldo){
        //casting to string makes this more representation exact because of the way java treats doubles
        this.saldo = new BigDecimal(String.valueOf(saldo));
    }

    public BigDecimal obliczMiesieczneOdsetki(){
        //TODO: even more precision? xD
        BigDecimal capital = (saldo.multiply(rocznaStopaProcentowa)).divide(BigDecimal.valueOf(12), MathContext.DECIMAL128);
        this.saldo = saldo.add(capital);
        return saldo;
    }

    public static void setRocznaStopaProcentowa(double stopa){
        rocznaStopaProcentowa = new BigDecimal(String.valueOf(stopa));
    }
    public static void setRocznaStopaProcentowa(BigDecimal stopa){
        rocznaStopaProcentowa = stopa;
    }

    public static void main(String[] Args){
        RachunekBankowy saver1 = new RachunekBankowy(2000.);
        RachunekBankowy saver2 = new RachunekBankowy(BigDecimal.valueOf(3000.));
        setRocznaStopaProcentowa(0.05);
        System.out.println(saver1.obliczMiesieczneOdsetki().toString());
    }
}
