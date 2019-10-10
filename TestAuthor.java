package fifth;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Александр", "krasnenkov888@gmail.com",'M');
        System.out.println(a1);
        a1.setEmail("krasnenkov888@gmail.com");
        System.out.println(a1);
    }
}

