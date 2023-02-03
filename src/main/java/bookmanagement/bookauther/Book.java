package bookmanagement.bookauther;

public class Book {
    private String name;
    private String author_name;
    private int pages;

    public Book(String name, String author_name, int pages) {
        this.name = name;
        this.author_name = author_name;
        this.pages = pages;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
