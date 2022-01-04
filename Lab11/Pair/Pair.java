package pl.uwm.rybinski.Lab11.Pair;

public class Pair<T>
{
    public Pair()
    {
        first = null;
        second = null;
    }

    public Pair(T first, T second)
    {
        this.first = first;
        this.second = second;
    }

    public void swap(){
        T tmp = this.first;
        this.first = this.second;
        this.second = tmp;
    }

    public T getFirst()
    {
        return first;
    }

    public T getSecond()
    {
        return second;
    }

    public void setFirst(T newValue)
    {
        first = newValue;
    }
    
    public void setSecond(T newValue)
    {
        second = newValue;
    }

    private T first;
    private T second;
}

