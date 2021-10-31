package Lab04;
import java.io.FileInputStream;
import java.lang.Character;
import java.util.Scanner;
import java.math.BigInteger;

public class Lab04 {

    public static String consoleStrInput(){
        String result = null;
        Scanner input = new Scanner(System.in);
        boolean isLoaded = false;
        while(!isLoaded) {
            try{
                result = input.nextLine();
                isLoaded = true;
            }
            catch(Exception E){
                System.out.println(E);
            }
        }

        return result;
    }

    public static char consoleCharInput(){
        char result = ' ';
        Scanner input = new Scanner(System.in);
        boolean isLoaded = false;
        while(!isLoaded) {
            try{
                result = input.nextLine().charAt(0);
                isLoaded = true;
            }
            catch(Exception E){
                System.out.println(E);
            }
        }

        return result;
    }

    public static int countChar(String str, char c){
        int result = 0;
        for(char i: str.toCharArray()){
            if(i == c)
                result++;
        }
        return result;
    }

    public static int countSubStr(String str, String subStr){
        int result = 0;
        char[] analyze = str.toCharArray();
        char[] sub = subStr.toCharArray();
        for(int i = 0; i < analyze.length; i++)
        {
            boolean isSub = false;
            if(analyze[i] == sub[0]){
                isSub = true;
                for(int j = 1; j < sub.length; j++){
                    if (analyze[i + j] != sub[j]) {
                        isSub = false;
                        break;
                    }
                }
            }
            if(isSub)
                result++;
        }
        return result;
    }

    public static String repeat(String str, int n){
        StringBuffer concat = new StringBuffer();
        for (int i = 0; i < n; i++) {
            concat.append(str);
        }
        return concat.toString();
    }

    public static int[] where(String str, String subStr){

        char[] analyze = str.toCharArray();
        char[] sub = subStr.toCharArray();
        int n = countSubStr(str, subStr);
        int[] result = new int[n];
        int next = 0;
        for(int i = 0; i < analyze.length; i++)
        {
            boolean isSub = false;
            if(analyze[i] == sub[0]){
                isSub = true;
                for(int j = 1; j < sub.length; j++){
                    if(analyze[i+j] != sub[j])
                        isSub = false;
                }
            }
            if(isSub){
                result[next]=i;
                next++;
            }
        }
        return result;
    }

    public static String change(String str){
        StringBuffer change = new StringBuffer();
        char[] tmp = str.toCharArray();
        for(char i: tmp){
            if(Character.isLowerCase(i))
                change.append(Character.toUpperCase(i));
            if(Character.isUpperCase(i))
                change.append(Character.toLowerCase(i));
        }
        return change.toString();
    }

    public static String nice(String str){
        StringBuffer nice = new StringBuffer();
        char[] tmp = str.toCharArray();
        int iter = 0;
        for(int i = tmp.length-1; i > 0; i--){
            iter++;
            nice.append(tmp[i]);
            if(iter % 3 == 0)
                nice.append("'");
        }
        nice.append(tmp[0]);
        nice.reverse();
        return nice.toString();
    }

    public static String betterNice(String str, char separator, int count){
        StringBuffer nice = new StringBuffer();
        char[] tmp = str.toCharArray();
        int iter = 0;
        for(int i = tmp.length-1; i > 0; i--){
            iter++;
            nice.append(tmp[i]);
            if(iter % count == 0)
                nice.append(separator);
        }
        nice.append(tmp[0]);
        nice.reverse();
        return nice.toString();
    }

    public static BigInteger chessBoard(int n){
        BigInteger result = new BigInteger("2");
        result = result.pow((n*n));
        result = result.subtract(BigInteger.valueOf(1));
        return result;
    }

    public static void main(String[] args){
//
//        System.out.println("Please provide absolute path to file");
//        String filePath = consoleStrInput();
//        System.out.println("Please provide char to count");
//        char chr = consoleCharInput();
//        System.out.println("Please provide substring to count");
//        String subStr = consoleStrInput();

//        String filePath = "D:\\test.txt";
//        char chr = 'N';
//        String subStr = "Nuggets";
//
//
//        try{
//            {
//                FileInputStream txt = new FileInputStream(filePath);
//                {
//                    int i = 0;
//                    int charCounter = 0;
//                    while ((i = txt.read()) != -1) {
//                        if ((char) i == chr)
//                            charCounter++;
//                    }
//                    System.out.println(charCounter);
//                }
//
//                txt.close();
//            }
//
//            {
//                FileInputStream txt = new FileInputStream(filePath);
//                {
//                    int result = 0;
//                    int i = 0;
//                    StringBuilder word = new StringBuilder();
//                    int wordCounter = 0;
//                    while((i = txt.read()) != -1){
//                        if((char)i == ' '){
//                            if(word.toString().equals(subStr))
//                                wordCounter++;
//                            word = new StringBuilder();
//                            continue;
//                        }
//                        word.append((char) i);
//                    }
//                    if(word.toString().equals(subStr))
//                        wordCounter++;
//
//                    System.out.println(wordCounter);
//                }
//                txt.close();
//            }
//
//        }catch(Exception e){System.out.println(e);}

        System.out.println(chessBoard(3).intValue());
        Tests.tests();
    }
}
