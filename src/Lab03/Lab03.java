package Lab03;
import java.lang.Character;


public class Lab03 {
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
                    if(analyze[i+j] != sub[j])
                        isSub = false;
                }
            }
            if(isSub)
                result++;
        }
        return result;
    }

    public static String repeat(String str, int n){
        StringBuilder concat = new StringBuilder();
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

    public static void main(String[] args){
        Tests.tests();

    }
}
