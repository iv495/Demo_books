package com.example.demo_books.controller;

import com.example.demo_books.service.BookService;
import com.example.demo_books.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/books")
public class BookController {


    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks(){
    return bookService.getBooks();
    }

    @PostMapping
    public void  addBook(@RequestBody Book book){
        bookService.addNewBook(book);
    }

    @DeleteMapping(path = "{bookId}")
    public void deleteBook(@PathVariable("bookId") Long bookId){
        bookService.deleteBook(bookId);

    }
}
