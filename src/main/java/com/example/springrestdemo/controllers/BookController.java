package com.example.springrestdemo.controllers;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	  
    @Autowired
    BookServiceImpl bookService;
  
    @PostMapping("/")
    public void addBook(@RequestBody Book book) {
    	bookService.addBook(book);
    }
  
    @GetMapping("/findall")
    public HashSet<Book> getAllBook() {
        return bookService.findAllBook();
    }
  
    @GetMapping("/findbyid/{id}")
    public Book geBookById(@PathVariable long id) {
        return bookService.findBookByID(id);
    }
  
    @DeleteMapping("/delete")
    public void deleteBook() {
    	bookService.deleteAllData();
    }
  
}
