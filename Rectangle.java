package sixth;
import java.math.*;

public class Rectangle extends Shape {
    protected double wight;
    protected double lenght;

    public Rectangle(){};
    public Rectangle(double lenght,double wight){
        this.lenght = lenght;
        this.wight = wight;
    };
    public Rectangle(double lenght,double wight,String color, boolean filled){
        this.lenght = lenght;
        this.wight = wight;
        this.color = color;
        this.filled = filled;
    };

    public double getWight() {
        return wight;
    }
    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    @Override
    public double getArea() {
        return lenght*wight;
    }
    @Override
    public double getPerimeter() {
        return 2*(lenght+wight);
    }
    @Override
    public String toString() {
        return "Shape: rectangle, lenght: "+this.lenght+", wight: "+this.wight;
    }
}
