package com.porfanid.backend.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public ResponseEntity<?> saveBook(@RequestBody Book book) throws URISyntaxException {
        bookService.saveBook(book);
        return ResponseEntity.created(new URI("/book/" + book.getTitle())).build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteBook(@RequestBody Book book) {
        bookService.deleteBook(book);
        return ResponseEntity.noContent().build();
    }

    // Other REST endpoints for book management can be added here
}