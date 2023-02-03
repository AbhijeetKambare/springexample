package bookmanagement.bookauther;

import java.util.Date;

public class Publish {
    private Book book;
    private Auther auther;
    private int yearOFPublishing;

    public Publish(Book book, Auther auther, int yearOFPublishing) {
        this.book = book;
        this.auther = auther;
        this.yearOFPublishing = yearOFPublishing;
    }

    public Publish() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Auther getAuther() {
        return auther;
    }

    public void setAuther(Auther auther) {
        this.auther = auther;
    }

    public int getYearOFPublishing() {
        return yearOFPublishing;
    }

    public void setYearOFPublishing(int yearOFPublishing) {
        this.yearOFPublishing = yearOFPublishing;
    }
}
