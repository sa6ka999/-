package fourth;

public class Balls {
    private double diameter;
    private String color;
    private String type;
    private double price;

    public Balls(double d, String c, String t, double p) {
        this.diameter = d;
        this.color = c;
        this.type = t;
        this.price = p;
    }

    public Balls(double d, String c, String t) {
        this.diameter = d;
        this.color = c;
        this.type = t;
        this.price = 0.0D;
    }

    public Balls(double d, String c) {
        this.diameter = d;
        this.color = c;
        this.type = "football";
        this.price = 0.0D;
    }

    public Balls(double d) {
        this.diameter = d;
        this.color = "black";
        this.type = "football";
        this.price = 0.0D;
    }

    public Balls() {
        this.diameter = 0.0D;
        this.color = "black";
        this.type = "football";
        this.price = 0.0D;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Диаметр: " + this.diameter + "см., цвет: " + this.color + ", тип: " + this.type + ", цена: " + this.price + " руб.";
    }
}



