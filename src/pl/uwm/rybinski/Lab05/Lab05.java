package pl.uwm.rybinski.Lab05;

import java.util.ArrayList;

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
        for(int i = 0; i < a.size() + b.size(); i++){
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

    public static  < E extends Comparable<E> > ArrayList mergeSorted(ArrayList<E> a, ArrayList<E> b){
        ArrayList<E> result = new ArrayList<>();
        int l = 0;
        int p = 0;
        boolean max_l = false;
        boolean max_p = false;
        for(int i = 0; i < a.size()+b.size(); i++){
            
            if(((a.get(l).compareTo(b.get(p)) < 0) || max_p) && !max_l){
                result.add(a.get(l));
                l++;
                if(l == a.size()){
                    l--;
                    max_l = true;
                }
            }
            else if((b.get(p).compareTo(a.get(l)) < 0 || max_l ) && !max_p) {
                result.add(b.get(p));
                p++;
                if(p == b.size()){
                    p--;
                    max_p = true;
                }
            else if((b.get(p).compareTo(a.get(l)) == 0)){
                result.add(b.get(p));
                result.add(b.get(p));
                p++;
                l++;
                if(p == b.size()){
                    p--;
                    max_p = true;
                }
                if(l == a.size()){
                        l--;
                        max_l = true;
                    }
                }
            }
        }
        return result;
    }


    public static <E> ArrayList reversed(ArrayList<E> a){
            ArrayList<E> result = new ArrayList<E>();
            for(int i = a.size()-1; i >= 0; i--){
                result.add(a.get(i));
            }
            return result;
    }

    public static <E> void reverse(ArrayList<E> a){
        ArrayList<E> result = reversed(a);
        //TODO this can be implemented in more efficient manner
        a.clear();
        for (E e : result) {
            a.add(e);
        }
    }

    public static void main(String[] Args){
        Tests.appendTest();
        Tests.mergeTest();
        Tests.mergeSortedTest();
        Tests.reversedTest();
        Tests.reverseTest();
    }
}
