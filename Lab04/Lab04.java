//package pl.uwm.Lab04;
//import java.io.FileInputStream;
//import java.lang.Character;
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.util.Scanner;
//import java.math.BigInteger;
//
//@SuppressWarnings({"ThrowablePrintedToSystemOut"})
//public class Lab04 {
//
//    public static String consoleStrInput(){
//        String result = null;
//        Scanner input = new Scanner(System.in);
//        boolean isLoaded = false;
//        while(!isLoaded) {
//            try{
//                result = input.nextLine();
//                isLoaded = true;
//            }
//            catch(Exception E){
//                System.out.println(E);
//            }
//        }
//
//        return result;
//    }
//
//    public static char consoleCharInput(){
//        char result = ' ';
//        Scanner input = new Scanner(System.in);
//        boolean isLoaded = false;
//        while(!isLoaded) {
//            try{
//                result = input.nextLine().charAt(0);
//                isLoaded = true;
//            }
//            catch(Exception E){
//                System.out.println(E);
//            }
//        }
//
//        return result;
//    }
//
//    public static int countChar(String str, char c){
//        int result = 0;
//        for(char i: str.toCharArray()){
//            if(i == c)
//                result++;
//        }
//        return result;
//    }
//
//    public static int countSubStr(String str, String subStr){
//        int result = 0;
//        char[] analyze = str.toCharArray();
//        char[] sub = subStr.toCharArray();
//        for(int i = 0; i < analyze.length; i++)
//        {
//            boolean isSub = false;
//            if(analyze[i] == sub[0]){
//
//                isSub = true;
//                for(int j = 1; j < sub.length; j++){
//                    if (analyze[i + j] != sub[j]) {
//                        isSub = false;
//                        break;
//                    }
//                }
//            }
//            if(isSub)
//                result++;
//        }
//        return result;
//    }
//
//    public static String repeat(String str, int n){
//        StringBuffer concat = new StringBuffer();
//        for (int i = 0; i < n; i++) {
//            concat.append(str);
//        }
//        return concat.toString();
//    }
//
//    public static int[] where(String str, String subStr){
//
//        char[] analyze = str.toCharArray();
//        char[] sub = subStr.toCharArray();
//        int n = countSubStr(str, subStr);
//        int[] result = new int[n];
//        int next = 0;
//        for(int i = 0; i < analyze.length; i++)
//        {
//            boolean isSub = false;
//            if(analyze[i] == sub[0]){
//                isSub = true;
//                for(int j = 1; j < sub.length; j++){
//                    if (analyze[i + j] != sub[j]) {
//                        isSub = false;
//                        break;
//                    }
//                }
//            }
//            if(isSub){
//                result[next]=i;
//                next++;
//            }
//        }
//        return result;
//    }
//
//    public static String change(String str){
//        StringBuffer change = new StringBuffer();
//        char[] tmp = str.toCharArray();
//        for(char i: tmp){
//            if(Character.isLowerCase(i))
//                change.append(Character.toUpperCase(i));
//            if(Character.isUpperCase(i))
//                change.append(Character.toLowerCase(i));
//        }
//        return change.toString();
//    }
//
//    public static String nice(String str){
//        StringBuffer nice = new StringBuffer();
//        char[] tmp = str.toCharArray();
//        int iter = 0;
//        for(int i = tmp.length-1; i > 0; i--){
//            iter++;
//            nice.append(tmp[i]);
//            if(iter % 3 == 0)
//                nice.append("'");
//        }
//        nice.append(tmp[0]);
//        nice.reverse();
//        return nice.toString();
//    }
//
//    public static String betterNice(String str, char separator, int count){
//        char[] tmp = str.toCharArray();
//        int iter = 0;
//        StringBuffer nice = new StringBuffer();
//        for(int i = tmp.length-1; i > 0; i--){
//            iter++;
//            nice.append(tmp[i]);
//            if(iter % count == 0)
//                nice.append(separator);
//        }
//        nice.append(tmp[0]);
//        nice.reverse();
//        return nice.toString();
//    }
//
//    public static int charCount(String filePath, char chr){
//        try{
//            FileInputStream txt = new FileInputStream(filePath);
//            int i;
//            int charCounter = 0;
//            while ((i = txt.read()) != -1) {
//                if ((char) i == chr)
//                    charCounter++;
//            }
//            txt.close();
//            return charCounter;
//
//        }catch(Exception e){System.out.println(e);}
//        return 0;
//    }
//
//    public static int wordCount(String filePath, String subStr){
//
//        try{
//            FileInputStream txt = new FileInputStream(filePath);
//            int i;
//            StringBuilder word = new StringBuilder();
//            int wordCounter = 0;
//            while((i = txt.read()) != -1){
//                if((char)i == ' '){
//                    if(word.toString().equals(subStr))
//                        wordCounter++;
//                    word = new StringBuilder();
//                    continue;
//                }
//                word.append((char) i);
//            }
//            if(word.toString().equals(subStr))
//                wordCounter++;
//
//            txt.close();
//            return wordCounter;
//
//        }catch(Exception e){System.out.println(e);}
//        return -1;
//    }
//
//    public static BigInteger chessBoard(int n){
//        BigInteger result = new BigInteger("2");
//        result = result.pow((n*n));
//        result = result.subtract(BigInteger.valueOf(1));
//        return result;
//    }
//
//
//
//    public static BigDecimal countInterest(BigDecimal initBal, BigDecimal interest, BigDecimal time){
//        int period = 1; //count of capitalizations in single year
//        BigDecimal one = new BigDecimal(1);
//        BigDecimal denominator = (BigDecimal.valueOf(100*period));
//        BigDecimal toMultiply = (one.add(interest.divide(denominator))).pow((time.intValue())*period);
//        return initBal.multiply(toMultiply).setScale(2, RoundingMode.HALF_EVEN);
//    }
//
//
//    public static void main(String[] args){
//
//        System.out.println("Please provide absolute path to file");
//        String filePath = consoleStrInput();
//        System.out.println("Please provide char to count");
//        char chr = consoleCharInput();
//        System.out.println("Please provide word to count");
//        String subStr = consoleStrInput();
//
//        System.out.println("Char Count in file");
//        System.out.println(charCount(filePath, chr));
//        System.out.println("Word Count in file");
//
//        Tests.tests();
//    }
//}
