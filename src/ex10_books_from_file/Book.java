package ex10_books_from_file;


public class Book {

    private String name;
    private int publishingYear;
    private int pageCount;
    private String author;

    public Book(String name, int ReleaseYear, int pages, String author) {
        this.name = name;
        this.publishingYear = ReleaseYear;
        this.pageCount = pages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagecount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return getName() + "\n\tPublication year: "
                + getPublishingYear() + "\n\tNumber of pages: "
                + getPagecount() + "\n\tAuthor: " + getAuthor();

    }

}