package edu.cs.birzeit.bookstore2.model;

import java.util.List;

public interface IBookDa {
    List<Book> getBooks(String cat);
    String[] getCat();
}
