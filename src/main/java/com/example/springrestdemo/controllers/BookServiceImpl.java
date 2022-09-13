package com.example.springrestdemo.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
  
    private Set<Book> bookList = new HashSet<Book>();
  
    @Override
    public HashSet<Book> findAllBook() {
        if (bookList.isEmpty())
            return null;
        else
            return (HashSet<Book>) bookList;
    }
    
    @Override
    public Book findBookByID(long id) {
        Book book = bookList.stream().filter(b -> b.getId() == id).findAny().orElse(null);
        
        return book;
    }
    
    @Override
    public void addBook(Book b) {
        bookList.add(b);
    }
    
    @Override
    public void deleteAllData() {
        bookList.clear();
    }

}
