package pl.uwm.rybinski.Lab11.Zad1.Lab06;
import java.math.BigDecimal;
import java.math.MathContext;

public class RachunekBankowy {

    //TODO: write this as BigInteger floating point number representation
    public static BigDecimal rocznaStopaProcentowa = new BigDecimal("0.04");
    private BigDecimal saldo;

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
        RachunekBankowy zero = new RachunekBankowy();

        System.out.println(saver1.obliczMiesieczneOdsetki().toString());
        System.out.println(saver2.obliczMiesieczneOdsetki().toString());

        Lab06.RachunekBankowy.setRocznaStopaProcentowa(0.05);
        if(!RachunekBankowy.rocznaStopaProcentowa.equals(BigDecimal.valueOf(0.05)))
            throw new AssertionError("setRocznaStopaProcentowa() does not change rocznaStopaProcentowa");

        System.out.println(saver1.obliczMiesieczneOdsetki().toString());
        System.out.println(saver2.obliczMiesieczneOdsetki().toString());
    }
}

public class IntegerSet {
    private boolean[] storage;

    public static void verifyArgument(int k){
        if(k < 1)
            throw new IllegalArgumentException("Value is less than 1");
        if(k > 100)
            throw new IllegalArgumentException("Value is more than 100");
    }

    public IntegerSet(){
        this.storage = new boolean[100];
    }

    public void insertElement(int k){
        verifyArgument(k);
        this.storage[k-1] = true;
    }

    public void deleteElement(int k){
        verifyArgument(k);
        this.storage[k-1] = false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        boolean empty = true;
        for (int i = 0; i < this.storage.length; i++) {
            if(this.storage[i]) {
                sb.append(i + 1);
                sb.append(" ");
                empty = false;
            }
        }
        if(empty)
            sb.append("Empty");
        return sb.toString();
    }

    @Override
    public boolean equals(IntegerSet check) {
        for (int i = 0; i < this.storage.length; i++) {
            if(this.storage[i] != check.storage[i])
                return false;
        }
        return true;
    }

    public IntegerSet union(IntegerSet set){
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < this.storage.length; i++) {
            if(this.storage[i] || set.storage[i])
                result.storage[i] = true;
        }
        return result;
    }

    public IntegerSet intersection(IntegerSet set){
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < this.storage.length; i++) {
            if(this.storage[i] && set.storage[i])
                result.storage[i] = true;
        }
        return result;
    }

    public static void main(String[] args){
        IntegerSet x = new IntegerSet();
        x.insertElement(2);
        x.insertElement(45);
        IntegerSet y = new IntegerSet();
        if(x.equals(y))
            throw new AssertionError("equals() return invalid value");

        y.insertElement(45);
        y.insertElement(2);

        if(!x.equals(y))
            throw new AssertionError("equals() return invalid value");

        x.insertElement(1);
        if(x.equals(y))
            throw new AssertionError("insert() doesnt change right values");

        x.deleteElement(1);
        if(!x.equals(y))
            throw new AssertionError("delete() doesnt change right values");
        y.insertElement(3);
        x.insertElement(4);

        if(x.toString().hashCode() != ("2 4 45 ").hashCode())
            throw new AssertionError("toString() return invalid values");

        if(x.union(y).toString().hashCode() != ("2 3 4 45 ").hashCode())
            throw new AssertionError("union() return invalid values");

        if(x.intersection(y).toString().hashCode() != ("2 45 ").hashCode())
            throw new AssertionError("intersection() return invalid values");
    }
}
