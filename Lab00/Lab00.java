//package Lab00;
//
//public class Zadanie1 {
//    public static void main(String[] args) {
//        System.out.println(31 + 29 + 31);
//    }
//}
//
//public class Zadanie2 {
//    public static void main(String[] args){
//
//        int x = 10;
//
//        System.out.println(((x+1)*x)/2);
//    }
//}
//
//public class Zadanie3 {
//    public static void main(String[] args){
//        int x = 10;
//        int result = 1;
//        while (x != 0){
//            result *= x;
//            x--;
//        }
//        System.out.println(result);
//    }
//}
//
//
//public class Zadanie4 {
//    public static double CountInterest(int a, double b, int c, int d){
//        int initBal = a; //gr
//        double interest = b;
//        int time = c; //years
//        int period = d; //count of capitalizations in single year
//
//        double result = (initBal * Math.pow((1+ (interest / (100*period))), period*time));
//        return result;
//    }
//
//    public static void main(String[] args){
//        System.out.println(CountInterest(1000, 0.06, 1, 1));
//        System.out.println(CountInterest(1000, 0.06, 2, 1));
//        System.out.println(CountInterest(1000, 0.06, 3, 1));
//
//    }
//}
//
//
//
//public class Zadanie5 {
//
//
//    public static void wypisz(String text){
//        int len = text.length();
//        System.out.println();
//        System.out.print("+");
//        for (int i = 0; i < len; i++){
//            System.out.print("-");
//        }
//        System.out.print("+");
//        System.out.println();
//        System.out.println("|"  + text + "|");
//        System.out.print("+");
//        for (int i = 0; i < len; i++){
//            System.out.print("-");
//        }
//        System.out.print("+");
//    }
//
//    public static void main(String[] args){
//        wypisz("S Z C Z U R Y");
//    }
//}
//
//
//
//public class Zadanie6 {
//    public static void main(String[] args){
//        System.out.println("""
//                          /////
//                         +\"\"\"\"\"+
//                        (| o o |)
//                          | ^ |
//                         | '_' |
//                         +_____+""");
//    }
//}
//
//
//public class Zadanie7 {
//    public static void main(String[] args) {
//        System.out.println("""
//                 ____             _                   _____       _     _    _      _    _
//                |  _ \\           | |                 |  __ \\     | |   (_)  //     | |  (_)
//                | |_) | __ _ _ __| |_ ___  ___ ____  | |__) |   _| |__  _ _ __  ___| | ___
//                |  _ < / _` | '__| __/ _ \\/ __|_  /  |  _  / | | | '_ \\| | '_ \\/ __| |/ / |
//                | |_) | (_| | |  | || (_) \\__ \\/ /   | | \\ \\ |_| | |_) | | | | \\__ \\   <| |
//                |____/ \\__,_|_|   \\__\\___/|___/___|  |_|  \\_\\__, |_.__/|_|_| |_|___/_|\\_\\_|
//                                                            __/ |
//                                                           |___/""");
//    }
//}
//
//
//public class Zadanie8 {
//    public static void main(String[] args) {
//        System.out.println("""
//                                   +
//                                  + +
//                                 +   +
//                                +_____+
//                                | .—. |
//                                | | | |
//                                +_+_+_+""");
//    }
//}
//
//
//
//
//public class Zadanie9 {
//    public static void main(String[] args) {
//        System.out.println("""
//                 _nnnn_
//                dGGGGMMb     ,\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\".
//               @p~qp~~qMb    | sudo rm /* -r --no-preserve-root |
//               M|@||@) M|   _;..................................'
//               @,----.JM| -'
//              JS^\\__/  qKL
//             dZP        qKRb
//            dZP          qKKb
//           fZP            SMMb
//           HZM            MMMM
//           FqM            MMMM
//         __| \".        |\\dS\"qML
//         |    `.       | `' \\Zq
//        _)      \\.___.,|     .'
//        \\____   )MMMMMM|   .'
//             `-'       `--'""");
//    }
//}
//
//public class Zadanie10 {
//    public static void main(String[] args) {
//        System.out.println("Karpienia");
//        System.out.println("Szostak");
//        System.out.println("Prostak");
//
//    }
//}
//
//
//
//public class Zadanie11 {
//    public static void main(String[] args) {
//        System.out.println("* * * (Italiam! Italiam!) - Cyprian Kamil Norwid\n");
//        System.out.print("""
//                Italiam! Italiam!
//                Pod latyńskich żagli cieniem,
//                Myśli moja, płyń z aniołem.
//                Płyń, jak kiedyś ja płynąłem:
//                Za wspomnieniem — płyń wspomnieniem...
//
//                Dookoła morze — morze —
//                Jak błękitu strop bez końca.
//                O przejasne — pełne słońca!
//                Łodzi! Wioseł!... Szczęść ci Boże...
//
//                Płyń — a nie wróć-że mi z żalem
//                Od tych laurów tam różowych,
//                Gdzie Tass śpiewał Jeruzalem,
//                I od moich dni — laurowych...
//
//                O, po skarby cię wysłałem:
//                Cóż, gdy wrócisz mi z tęsknotą?
//                Wiem to, ale proszę o to —
//                Niech zapłaczę, że płakałem...
//
//                Pod latyńskich żagli cieniem,
//                Myśli moja, płyń z aniołem.
//                Płyń, jak kiedyś ja płynąłem:
//                ...Za wspomnieniem — płyń wspomnieniem...""");
//    }
//}
//
//
//
//public class Zadanie12 {
//    public static void main(String[] args) {
//        System.out.println("""
//                * * * * * * * * ===============================
//                * * * * * * * * ===============================
//                * * * * * * * * ===============================
//                * * * * * * * * ===============================
//                * * * * * * * * ===============================
//                * * * * * * * * ===============================
//                ===============================================
//                ===============================================
//                ===============================================""");
//    }
//}
