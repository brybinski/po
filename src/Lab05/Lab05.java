package Lab05;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab05 {

    public static  < E > ArrayList append(ArrayList<E> a, ArrayList<E> b){
        ArrayList<E> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        return c;
    }

    public static  < E > ArrayList merge(ArrayList<E> a, ArrayList<E> b){
        ArrayList<E> result = new ArrayList<>();
        int l = 0;
        int p = 0;
        for(int i = 0; i < a.size()+b.size(); i++){
            if((i % 2 == 0 || p == b.size()) && l < a.size()){
                result.add(a.get(l));
                l++;
            }
            if((i % 2 != 0 || l == a.size()) && p < b.size()) {
                result.add(b.get(p));
                p++;
            }
        }
        return result;
    }

    public static < E > ArrayList addList(E[] tab){
        ArrayList<E> result = new ArrayList<E>();
        for (E i:
             tab) {
            result.add(i);
        }
        return result;
    }

    // TODO: ZAD 3,4,5
    public static void main(String[] Args){
        Integer[] tmp = {1, 2, 3, 4};
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(tmp));

        Integer[] tmp2 = {1, 2};
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(tmp2));
        System.out.println(list1);
        System.out.println(append(list1, list1));
        System.out.println(merge(list2, list1));
    }
}
