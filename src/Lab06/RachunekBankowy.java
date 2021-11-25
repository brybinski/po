package Lab06;

public class RachunekBankowy {
    public static double rocznaStopaProcentowa = 0.04;

    private double saldo;

    public RachunekBankowy(double saldo){
        this.saldo = saldo;
    }

    public RachunekBankowy(){
        this.saldo = 0.;
    }

    //TODO: delete this after work
    public void print(){
        System.out.println(this.saldo);
    }
    public static void odsetki(){
        System.out.println(rocznaStopaProcentowa);
    }

    public static void setRocznaStopaProcentowa(double nowaStopaProcentowa){
        rocznaStopaProcentowa = nowaStopaProcentowa;
    }

    public double obliczMiesieczneOdsetki(){
        double odsetki = (this.saldo * rocznaStopaProcentowa) / 12.;
        this.saldo += odsetki;
        return odsetki;
    }

    public static void main(String[] Args){
        RachunekBankowy x = new RachunekBankowy();
        RachunekBankowy y = new RachunekBankowy(21.37);
        x.print();
        y.print();
        odsetki();
        setRocznaStopaProcentowa(0.05);

        odsetki();
    }
}
