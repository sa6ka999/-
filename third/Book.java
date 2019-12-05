package third;

public class Book {
    private String title;
    private String author;
    private int pagesCount;
    private String genre;

    public Book(String t, String a, int p, String g) {
        this.title = t;
        this.author = a;
        this.pagesCount = p;
        this.genre = g;
    }

    public Book(String t, String a, int p) {
        this.title = t;
        this.author = a;
        this.pagesCount = p;
        this.genre = "none";
    }

    public Book(String t, String a) {
        this.title = t;
        this.author = a;
        this.pagesCount = 0;
        this.genre = "none";
    }

    public Book(String t) {
        this.title = t;
        this.author = "none";
        this.pagesCount = 0;
        this.genre = "none";
    }

    public Book() {
        this.title = "none";
        this.author = "none";
        this.pagesCount = 0;
        this.genre = "none";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPagesCount() {
        return this.pagesCount;
    }

    public String getGenre() {
        return this.genre;
    }

    public String toString() {
        return "Название: " + this.title + ", автор: " + this.author + ", страниц: " + this.pagesCount + ", жанр: " + this.genre;
    }
}
