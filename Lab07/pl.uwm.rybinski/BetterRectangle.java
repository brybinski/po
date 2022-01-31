//package pl.uwm.rybinski;
//import com.sun.istack.internal.NotNull;
//import java.awt.*;
//
//public class BetterRectangle extends Rectangle{
//
//    //I couldn't find better way to pass all superclass constructors to subclass
//    public BetterRectangle(){
//        super();
//    }
//    public BetterRectangle(int width, int height ){
//        super(width, height);
//    }
//    public BetterRectangle(int x, int y, int width, int height){
//        super(x, y, width, height);
//    }
//    public BetterRectangle(@NotNull Point p){
//        super(p);
//    }
//    public BetterRectangle(@NotNull Dimension d) {
//        super(d);
//    }
//    public BetterRectangle(@NotNull Point p, @NotNull Dimension d){
//        super(p, d);
//    }
//    public BetterRectangle(@NotNull Rectangle r){
//        super(r);
//    }
//
//    public double getPerimeter(){
//        return 2*this.getHeight()+2*this.getWidth();
//    }
//
//    public double getArea(){
//        return this.getHeight()*this.getWidth();
//    }
//}
