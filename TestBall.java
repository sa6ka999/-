package second;

public class TestBall {public static void main(String[] args) {
    Ball b1 = new Ball(100.0D, 100.0D);
    System.out.println(b1);
    b1.move(30.0D, 15.0D);
    System.out.println(b1);
}
}
