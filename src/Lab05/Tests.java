package Lab05;

import java.util.ArrayList;
import java.util.Arrays;


public class Tests {
    public static Integer[] tmp = {1, 4, 6, 8};
    public static ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(tmp));
    public static Integer[] tmp2 = {2, 5, 6};
    public static ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(tmp2));

    private static boolean compare(ArrayList<Integer> arr1, Integer[] arr2){
        for (int i = 0; i < arr1.size(); i++) {
            if(arr1.get(i) != arr2[i])
                return false;
        }
        return true;
    }
    public static void integrityCheck(String fooname) {
        if(!compare(list1, tmp))
            throw new AssertionError(fooname +" is destructive to list1");

        if(!compare(list2, tmp2))
            throw new AssertionError(fooname +" is destructive to list2");
    }

    public static void appendTest(){
        ArrayList<Integer> test = Lab05.append(Tests.list1, Tests.list2);
        integrityCheck("append()");
        Integer[] ans = {1, 4, 6, 8, 2, 5, 6};
        if(!compare(test, ans))
            throw new AssertionError("append() return invalid values");
    }

    public static void mergeTest(){
        ArrayList<Integer> test = Lab05.merge(Tests.list1, Tests.list2);
        integrityCheck("merge()");
        Integer[] ans = {1, 2, 4, 5, 6, 6, 8};
        if(!compare(test, ans))
            throw new AssertionError("merge() return invalid values");
    }

    public static void mergeSortedTest(){
        ArrayList<Integer> test = Lab05.mergeSorted(Tests.list1, Tests.list2);
        integrityCheck("mergeSorted()");
        Integer[] ans = {1, 2, 4, 5, 6, 6, 8};
        if(!compare(test, ans))
            throw new AssertionError("mergeSorted() return invalid values");
    }

    public static void reversedTest(){
        ArrayList<Integer> test = Lab05.reversed(list1);
        integrityCheck("reversed()");
        Integer[] ans = {8, 6, 4, 1};
        if(!compare(test, ans))
            throw new AssertionError("reversed() return invalid values");
    }

    public static void reverseTest(){
        reversedTest();
        ArrayList<Integer> test = Lab05.reversed(list1);
        Lab05.reverse(test);
        if(!compare(test, Tests.tmp))
            throw new AssertionError("reversed() return invalid values");
    }

}
