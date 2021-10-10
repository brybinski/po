package Lab00;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println(31 + 29 + 31);
    }
}

public class Zadanie2 {
    public static void main(String[] args){

        int x = 10;

        System.out.println(((x+1)*x)/2);
    }
}

public class Zadanie3 {
    public static void main(String[] args){
        int x = 10;
        int result = 1;
        while (x != 0){
            result *= x;
            x--;
        }
        System.out.println(result);
    }
}


public class Zadanie4 {
    public static double CountInterest(int a, double b, int c, int d){
        int initBal = a; //gr
        double interest = b;
        int time = c; //years
        int period = d; //count of capitalizations in single year

        double result = (initBal * Math.pow((1+ (interest / (100*period))), period*time));
        return result;
    }

    public static void main(String[] args){
        System.out.println(CountInterest(1000, 0.06, 1, 1));
        System.out.println(CountInterest(1000, 0.06, 2, 1));
        System.out.println(CountInterest(1000, 0.06, 3, 1));

    }
}



public class Zadanie5 {


    public static void wypisz(String text){
        int len = text.length();
        System.out.println();
        System.out.print("+");
        for (int i = 0; i < len; i++){
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
        System.out.println("|"  + text + "|");
        System.out.print("+");
        for (int i = 0; i < len; i++){
            System.out.print("-");
        }
        System.out.print("+");
    }

    public static void main(String[] args){
        wypisz("S Z C Z U R Y");
    }
}



public class Zadanie6 {
    public static void main(String[] args){
        System.out.println("  /////  ");
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("(| o o |)");
        System.out.println("  | ^ |  ");
        System.out.println(" | \'_\' |");
        System.out.println(" +_____+ ");
    }
}


public class Zadanie7 {
    public static void main(String[] args) {
        System.out.println("""
                 ____             _                   _____       _     _    _      _    _
                |  _ \\           | |                 |  __ \\     | |   (_)  //     | |  (_)
                | |_) | __ _ _ __| |_ ___  ___ ____  | |__) |   _| |__  _ _ __  ___| | ___
                |  _ < / _` | '__| __/ _ \\/ __|_  /  |  _  / | | | '_ \\| | '_ \\/ __| |/ / |
                | |_) | (_| | |  | || (_) \\__ \\/ /   | | \\ \\ |_| | |_) | | | | \\__ \\   <| |
                |____/ \\__,_|_|   \\__\\___/|___/___|  |_|  \\_\\__, |_.__/|_|_| |_|___/_|\\_\\_|
                                                            __/ |
                                                           |___/""");
    }
}


public class Zadanie8 {
    public static void main(String[] args) {
        System.out.println("   +   ");
        System.out.println("  + +  ");
        System.out.println(" +   + ");
        System.out.println("+_____+");
        System.out.println("| .—. |");
        System.out.println("| | | |");
        System.out.println("+_+_+_+");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}



public class Zadanie9 {
    public static void main(String[] args) {
        System.out.println("         _nnnn_                      ");
        System.out.println("        dGGGGMMb     ,\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\".");
        System.out.println("       @p~qp~~qMb    | sudo rm /* -r --no-preserve-root |");
        System.out.println("       M|@||@) M|   _;..................................'");
        System.out.println("       @,----.JM| -'");
        System.out.println("      JS^\\__/  qKL");
        System.out.println("     dZP        qKRb");
        System.out.println("    dZP          qKKb");
        System.out.println("   fZP            SMMb");
        System.out.println("   HZM            MMMM");
        System.out.println("   FqM            MMMM");
        System.out.println(" __| \".        |\\dS\"qML");
        System.out.println(" |    `.       | `' \\Zq");
        System.out.println("_)      \\.___.,|     .'");
        System.out.println("\\____   )MMMMMM|   .'");
        System.out.println("     `-'       `--'");
    }
}

public class Zadanie10 {
    public static void main(String[] args) {
        System.out.println("Karpienia");
        System.out.println("Szostak");
        System.out.println("Prostak");

    }
}



public class Zadanie11 {
    public static void main(String[] args) {
        System.out.println("* * * (Ita\u00ADliam! Ita\u00ADliam!) - Cyprian Kamil Norwid\n");
        System.out.print("Ita\u00ADliam! Ita\u00ADliam!\n" +
                "Pod la\u00ADtyń\u00ADskich ża\u00ADgli cie\u00ADniem,\n" +
                "My\u00ADśli moja, płyń z anio\u00ADłem.\n" +
                "Płyń, jak kie\u00ADdyś ja pły\u00ADną\u00ADłem:\n" +
                "Za wspo\u00ADmnie\u00ADniem — płyń wspo\u00ADmnie\u00ADniem...\n" +
                "\n" +
                "Do\u00ADoko\u00ADła mo\u00ADrze — mo\u00ADrze —\n" +
                "Jak błę\u00ADki\u00ADtu strop bez koń\u00ADca.\n" +
                "O prze\u00ADja\u00ADsne — peł\u00ADne słoń\u00ADca!\n" +
                "Łodzi! Wio\u00ADseł!... Szczęść ci Boże...\n" +
                "\n" +
                "Płyń — a nie wróć-że mi z ża\u00ADlem\n" +
                "Od tych lau\u00ADrów tam ró\u00ADżo\u00ADwych,\n" +
                "Gdzie Tass śpie\u00ADwał Je\u00ADru\u00ADza\u00ADlem,\n" +
                "I od mo\u00ADich dni — lau\u00ADro\u00ADwych...\n" +
                "\n" +
                "O, po skar\u00ADby cię wy\u00ADsła\u00ADłem:\n" +
                "Cóż, gdy wró\u00ADcisz mi z tę\u00ADsk\u00ADno\u00ADtą?\n" +
                "Wiem to, ale pro\u00ADszę o to —\n" +
                "Niech za\u00ADpła\u00ADczę, że pła\u00ADka\u00ADłem...\n" +
                "\n" +
                "Pod la\u00ADtyń\u00ADskich ża\u00ADgli cie\u00ADniem,\n" +
                "My\u00ADśli moja, płyń z anio\u00ADłem.\n" +
                "Płyń, jak kie\u00ADdyś ja pły\u00ADną\u00ADłem:\n" +
                "...Za wspo\u00ADmnie\u00ADniem — płyń wspo\u00ADmnie\u00ADniem...");
    }
}


public class Zadanie12 {
    public static void main(String[] args) {
        System.out.println("""
                * * * * * * * * ===============================
                * * * * * * * * ===============================
                * * * * * * * * ===============================
                * * * * * * * * ===============================
                * * * * * * * * ===============================
                * * * * * * * * ===============================
                ===============================================
                ===============================================
                ===============================================""");
    }
}
