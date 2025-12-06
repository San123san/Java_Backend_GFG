package com.gfg_pratica.demo.controller;

import com.gfg_pratica.demo.models.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;

@RequestMapping("api/book")
@RestController
public class BookController {

    // addBook - PostMapping - @RequestBody
    // updateBook - PutMapping - @RequestBody, @PathVariable
    // getBookById - GetMapping - @PathVariable
    // deleteBook - DeleteMapping - @PathVariable
    // getAllBooks - GetMapping

    private static Logger logger = LoggerFactory.getLogger(BookController.class);
    private HashMap<Integer, Book> bookHashMap = new HashMap<>();

    @PostMapping
    public String addBook(@RequestBody Book book) {
        logger.info("In BookController.addBook with book details: {}", book);

        if (bookHashMap.containsKey(book.getId())) {
            logger.info("Book is already exists with id: {}", book.getId());
            return "Failed to add new book. Book already exists.";
        }
        bookHashMap.put(book.getId(), book);
        return "Book added successfully.";
    }

    @PutMapping("{id}")
    public String updateBook(@RequestBody Book book, @PathVariable("id") int bookId) {
        logger.info("In BookController.updateBook with book details: {} and bookId: {}", book, bookId);

        if (bookHashMap.containsKey(book.getId())) {
            bookHashMap.put(bookId, book);
            return "Book details updated successfully.";
        } else {
            logger.error("Book not found with id: {}", bookId);
            return "Failed to update book. Book not found.";
        }
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") int bookId) {
        if (bookHashMap.containsKey(bookId)) {
            return bookHashMap.get(bookId);
        } else {
            logger.error("Book not found with id: {}", bookId);
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable("id") int bookId) {
        if (bookHashMap.containsKey(bookId)) {
            bookHashMap.remove(bookId);
            return "Book deleted successfully.";
        } else {
            logger.error("Book not found with id: {}", bookId);
            return "Failed to delete book. Book not found.";
        }
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookHashMap.values().stream().toList();
    }
}
