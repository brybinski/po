package Lab06;

import java.util.Arrays;

public class IntegerSet {
    public boolean[] storage;

    public static void verifyArgument(int k){
        if(k < 1)
            throw new IllegalArgumentException("Value is less than 1");
        if(k > 100)
            throw new IllegalArgumentException("Value is more than 100");
    }

    public IntegerSet(){
        this.storage = new boolean[100];
    }

    public void insertElement(int k){
        verifyArgument(k);
        this.storage[k-1] = true;
    }

    public void deleteElement(int k){
        verifyArgument(k);
        this.storage[k-1] = false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        boolean empty = true;
        for (int i = 0; i < this.storage.length; i++) {
            if(this.storage[i]) {
                sb.append(i + 1);
                sb.append(" ");
                empty = false;
            }
        }
        if(empty)
            sb.append("Empty");
        return sb.toString();
    }

    public boolean equals(IntegerSet check) {
        for (int i = 0; i < this.storage.length; i++) {
            if(this.storage[i] != check.storage[i])
                return false;
        }
        return true;
    }

    public IntegerSet union(IntegerSet set){
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < this.storage.length; i++) {
            if(this.storage[i] || set.storage[i])
                result.storage[i] = true;
        }
        return result;
    }

    public IntegerSet intersection(IntegerSet set){
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < this.storage.length; i++) {
            if(this.storage[i] && set.storage[i])
                result.storage[i] = true;
        }
        return result;
    }

    //TODO: Better tests
    public static void main(String[] args){
        IntegerSet x = new IntegerSet();
        x.insertElement(1);
        System.out.println(x);
        x.deleteElement(1);
        System.out.println(x);
        x.insertElement(2);
        x.insertElement(45);
        IntegerSet y = new IntegerSet();
        System.out.println(x);
        y.insertElement(45);
        y.insertElement(2);
        System.out.println(x.equals(y));
        y.insertElement(3);
        x.insertElement(4);
        System.out.println(x + "\n" + y);
        System.out.println(x.union(y));
        System.out.println(x.intersection(y));
    }
}
