package edu.cs.birzeit.bookstore2.model;

import java.util.ArrayList;
import java.util.List;

 class BookDa implements IBookDa{
    private ArrayList<Book> books = new ArrayList<>();

    public BookDa(){
        books.add(new Book(300, "Thinking in Java", "java"));
        books.add(new Book(450, "Professional Java", "java"));
        books.add(new Book(500, "Beginning C# Development", "C#"));

    }
public List<Book> getBooks(String cat){
        ArrayList<Book> data = new ArrayList<>();
        for (Book b: books){
            if (b.getCategery().equals(cat)){
                data.add(b);
            }
        }
        return data;
}

     @Override
     public String[] getCat() {
         String[] cats =new String[] {"java","C#","Paython"};
         return cats;
     }

 }
