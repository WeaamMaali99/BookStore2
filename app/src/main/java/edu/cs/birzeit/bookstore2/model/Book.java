package edu.cs.birzeit.bookstore2.model;

public class Book {
    private int pages;
    private String title;
    private String categery;

    public Book(int pages ,String title,String categery) {
        this.pages = pages;
        this.categery=categery;
        this.title=title;

    }

    public Book() {

    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategery() {
        return categery;
    }

    public void setCategery(String categery) {
        this.categery = categery;
    }

}
