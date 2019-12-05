package third;

public class TestBook {public static void main(String[] args) {
    Book b1 = new Book("Младший брат", "Кори Доктроу.", 190, "роман");
    Book b2 = new Book("Гарри Поттер и методы рационального мышления", "Элизер Юдковский", 580, "фанфик");
    b2.setPagesCount(1000);
    System.out.println(b1);
    System.out.println(b2); }
}
