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

    // TODO: Fix that error
    public static  < T extends Comparable<T> > ArrayList mergeSorted(ArrayList<T> a, ArrayList<T> b){
        ArrayList<T> result = new ArrayList<>();
        int l = 0;
        int p = 0;
        boolean max_l = false;
        boolean max_p = false;
        for(int i = 0; i < a.size()+b.size(); i++){
            
            if(((a.get(l).compareTo(b.get(p))) < 0 || max_p) && !max_l){
                result.add(a.get(l));
                l++;
                if(l == b.size()){
                    l--;
                    max_l = true;
                }
            }
            if((b.get(p).compareTo(a.get(l)) < 0 || max_l )&& !max_p) {
                result.add(b.get(p));
                p++;
                if(p == b.size()){
                    p--;
                    max_p = true;
                }
            }
        }
        return result;
    }
    
    // TODO: ZAD 3,4,5
    public static void main(String[] Args){
        Double[] tmp = {1.23, 2., 3., 4.};
        ArrayList<Double> list1 = new ArrayList<Double>(Arrays.asList(tmp));

        Double[] tmp2 = {1.34, 2.132};
        ArrayList<Double> list2 = new ArrayList<Double>(Arrays.asList(tmp2));
        System.out.println(list1);
        System.out.println(append(list1, list1));
        System.out.println(mergeSorted(list1, list2));
        
        
    }
}
