package edu.cs.birzeit.bookstore2.model;

public class BookFactory {
    public IBookDa getModel(){
        return new BookDa();
    }
}
