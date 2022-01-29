package WordsInHashSetDemo;// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII

// Program wykorzystujący zbiór typu HashSet
// w celu pokazania wszystkich słów odczytanych z System.in

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsInHashSetDemo
{
    public static void main(String[] args) {
        // Klasa HashSet implementuje interfejs Set
        Set<String> words = new HashSet<>();
        long totalTime = 0;


        try {
            File f = new File("C:\\Users\\barto\\OneDrive - University of Warmia and Mazuria in Olsztyn\\Pulpit 1\\PO repo\\po_gr4_rybinskibartosz\\WordsInHashSetDemo\\alice30.txt");
            Scanner in = new Scanner(f);

            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
    }
}

