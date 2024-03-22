package com.porfanid.backend.book;

import com.porfanid.backend.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> temp = bookRepository.findAll();
        System.out.println(temp);
        return temp;
    }

    public void saveBook(Book book) {
        bookRepository.save(book);
    }
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
    // Other methods for user management can be added here
}