package pl.uwm.rybinski;
import com.sun.istack.internal.NotNull;
import java.awt.*;

public class BetterRectangle extends Rectangle{

    //I couldn't find better way to pass superclass constructors to subclass
    //I know I did not have to write all constructors, but I did them just 4fun
    public BetterRectangle(){
        super();
    }
    public BetterRectangle(int width, int height ){
        super(width, height);
    }
    public BetterRectangle(int x, int y, int width, int height){
        super(x, y, width, height);
    }
    public BetterRectangle(@NotNull Point p){
        super(p);
    }
    public BetterRectangle(@NotNull Dimension d) {
        super(d);
    }
    public BetterRectangle(@NotNull Point p, @NotNull Dimension d){
        super(p, d);
    }
    public BetterRectangle(@NotNull Rectangle r){
        super(r);
    }

    public double getPerimeter(){
        return 2*this.getHeight()+2*this.getWidth();
    }

    public double getArea(){
        return this.getHeight()*this.getWidth();
    }
}
