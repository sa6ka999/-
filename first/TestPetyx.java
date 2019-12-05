package first;

public class TestPetyx {public static void main(String[] args) {
    Petyx d1 = new Petyx("Mike", 2);
    Petyx d2 = new Petyx("Helen", 7);
    Petyx d3 = new Petyx("Bob");
    d3.setAge(1);
    System.out.println(d1);
    d1.intoHumanAge();
    d2.intoHumanAge();
    d3.intoHumanAge();
}
}
