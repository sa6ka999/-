package fourth;

public class TestBalls  {
    public TestBalls() {
    }
    public static void main(String[] args) {
        Balls b1 = new Balls(20.5D, "green", "basketball", 750.0D);
        Balls b2 = new Balls(25.5D, "yellow", "basketball", 300.0D);
        Balls b3 = new Balls(21.5D, "black", "basketball", 600.0D);
        b3.setColor("white");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}


