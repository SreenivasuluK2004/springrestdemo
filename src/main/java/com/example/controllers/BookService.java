package com.example.controllers;

import java.util.HashSet;
import java.util.Set;

public interface BookService {
	
	HashSet<Book> findAllBook();
    Book findBookByID(long id);
    void addBook(Book b);
    void deleteAllData();

}
