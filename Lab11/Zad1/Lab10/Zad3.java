//package pl.uwm.rybinski.Lab11.Zad1.Lab10;
//
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.text.Collator;
//import java.util.ArrayList;
//import java.util.Locale;
//import java.util.stream.Stream;
//
//public class Zad3 {
//    public static void main(String[] args)  {
//
//        ArrayList<String> result = new ArrayList();
//        try (Stream<String> stream = Files.lines(Paths.get(args[0]))) {
//            stream.forEach(result::add);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        result.sort(Collator.getInstance(new Locale("pl", "PL")));
//        result.forEach(System.out::println);
//    }
//}
