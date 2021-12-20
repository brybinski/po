package pl.uwm.rybinski;

import com.sun.istack.internal.NotNull;

public class Global {
    public static String delimiter = " ";

    public static void setDelimiter(@NotNull String delimit){
        Global.delimiter = delimit;
    }
}
