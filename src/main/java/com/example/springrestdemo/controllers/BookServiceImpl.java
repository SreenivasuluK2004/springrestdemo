package com.example.springrestdemo.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
  
    private Set<Book> bookList = new HashSet<Book>();
  
    @Override
    public HashSet<Book> findAllBook() {
        if (bookList.isEmpty()) {
        	
        	Book bk= new Book();
        	bk.setId(1000);
        	bk.setName("JAVA");
        	bk.setTitle("Head First JAVA");
        	
        	bookList.add(bk);
        	
        	
        	Book bk1= new Book();
        	bk1.setId(1001);
        	bk1.setName("JAVA-2");
        	bk1.setTitle("Head First JAVA-2");
        	
        	bookList.add(bk1);
        	
        	Book bk2= new Book();
        	bk2.setId(1012);
        	bk2.setName("JAVA-5");
        	bk2.setTitle("Head First JAVA-5");
        	
        	bookList.add(bk2);
        	
        	Book bk6= new Book();
        	bk6.setId(1024);
        	bk6.setName("AWS");
        	bk6.setTitle("AWS Cloud");
        	
        	bookList.add(bk6);

        	return (HashSet<Book>) bookList;
        }
            
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
