package sixth;
import java.math.*;
public class Square extends Rectangle {
    private double side;

    public Square(){}
    public Square(double side){
        this.side = side;
    }
    public Square(double side,String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public void setWight(double side) {
        this.side = side;
    }
    public void setLenght(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Rectangle: Square , lenght: "+this.side+", wight: "+this.side;
    }
}
