package Lab06;

import java.util.Arrays;
import java.util.Objects;

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

    public static void main(String[] args){
        IntegerSet x = new IntegerSet();
        x.insertElement(2);
        x.insertElement(45);
        IntegerSet y = new IntegerSet();
        if(x.equals(y))
            throw new AssertionError("equals() return invalid value");

        y.insertElement(45);
        y.insertElement(2);

        if(!x.equals(y))
            throw new AssertionError("equals() return invalid value");

        x.insertElement(1);
        if(x.equals(y))
            throw new AssertionError("insert() doesnt change right values");

        x.deleteElement(1);
        if(!x.equals(y))
            throw new AssertionError("delete() doesnt change right values");
        y.insertElement(3);
        x.insertElement(4);

        if(x.toString().hashCode() != ("2 4 45 ").hashCode())
            throw new AssertionError("toString() return invalid values");

        if(x.union(y).toString().hashCode() != ("2 3 4 45 ").hashCode())
            throw new AssertionError("union() return invalid values");

        if(x.intersection(y).toString().hashCode() != ("2 45 ").hashCode())
            throw new AssertionError("intersection() return invalid values");
    }
}
