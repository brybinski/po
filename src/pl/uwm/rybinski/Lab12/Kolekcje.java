package pl.uwm.rybinski.Lab12;

import java.util.*;
import java.util.stream.Stream;

public class Kolekcje {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        if(n == 0)
            throw new ArithmeticException("division by zero");

        int kill = 1;
        ListIterator<T> i = pracownicy.listIterator(0);

        do{
            if(kill % n == 0){
                i.next();
                i.remove();
                kill = 1;
            }
            else{
                kill++;
                i.next();
            }
        }
        while(i.hasNext());
    }

    public static <T> void odwroc(LinkedList<T> lista){
        int a = lista.indexOf(lista.getFirst());
        int b = lista.indexOf(lista.getLast());

        while(a < b){
            T tmp  = lista.get(a);
            lista.set(a, lista.get(b));
            lista.set(b, tmp);
            a++;
            b--;
        }
    }


    public static String reverseText(String txt){
       ArrayList<Stack<String>> sentence_list = new ArrayList<Stack<String>>();

        {
            Stack<String> sentence = new Stack<String>();
            StringBuilder tmp = new StringBuilder();
            int i = 0;
            while (i != txt.length()) {
                if (txt.charAt(i) == ' ' && txt.charAt(i-1) != '.' && txt.charAt(i-1) != ' ') {
                    sentence.add(tmp.toString());
                    tmp = new StringBuilder();
                }
                else if (txt.charAt(i) == '.') {
                    sentence.add(tmp.toString());
                    tmp = new StringBuilder();
                    Stack<String> tmp_stack = sentence;
                    sentence_list.add(tmp_stack);
                    sentence = new Stack<String>();
                }
                else if (txt.charAt(i) != ' ') {
                    tmp.append(txt.charAt(i));
                }

                i++;
            }
        }

        ArrayList<ArrayList<String>> reversed = new ArrayList<>();

        for(Stack<String> i: sentence_list){
            ArrayList<String> tmp = new ArrayList<>();
            while(!i.empty()){
                tmp.add(i.pop());
            }
            reversed.add(tmp);
        }

        StringBuffer buf = new StringBuffer();
        for(ArrayList<String> i: reversed){
            buf.append(String.join(" ", i).substring(0, 1).toUpperCase());
            buf.append(String.join(" ", i).substring(1).toLowerCase());
            buf.append(". ");
        }

        return buf.toString();
    }

    public static void printInt(int number){
        Stack<Integer> stck = new Stack<Integer>();
        while(number >= 1){
            stck.add(number % 10);
            number /= 10;
        }
        while(!stck.empty()){
            System.out.println(stck.pop());
        }
    }

    public static ArrayList<Integer> sitoGreka(int n){
        ArrayList<Integer> table = new ArrayList<>();

        for(int i = 2; i < n; i++)
            table.add(i);

        int i = 0;
        int lastprime = 2;

        while(i < Math.sqrt(n)){
            int itr = i;
            if(itr != table.size())
                itr++;
            while(itr != table.size()){
                if(table.get(itr) % lastprime == 0){
                    table.remove(itr);
                    itr--;
                }
                itr++;
            }

            i++;
            lastprime = table.get(i);
        }
        return table;
    }


    public static void main(String[] Args){
        LinkedList<String> test1 = new LinkedList<>();
        test1.addAll(0, Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));

        odwroc(test1);
        redukuj(test1, 3);
        System.out.println(test1 +"\n");
        System.out.println(reverseText("Ala ma kota. Jej kot lubi myszy."));
        System.out.println(sitoGreka(17));

        Scanner sc = new Scanner(System.in);
        printInt(sc.nextInt());
    }
}
