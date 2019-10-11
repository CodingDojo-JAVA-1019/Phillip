package com.phillip.mvc.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.phillip.mvc.models.Book;
import com.phillip.mvc.repositories.BookRepository;

@Service
public class BookService {

private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public void deleteBook(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
        	Book thisBook=optionalBook.get();
            bookRepository.delete(thisBook);
        } 
    }
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
        	Book thisBook = optionalBook.get();
        	thisBook.setTitle(title);
        	thisBook.setDescription(desc);
        	thisBook.setLanguage(lang);
        	thisBook.setNumberOfPages(numOfPages);
        	
        	return bookRepository.save(thisBook);
        	
        } else {
            return null;
        }
    }
    public Book updateBook(Book book) {
    	Optional<Book> optionalBook = bookRepository.findById(book.getId());
        if(optionalBook.isPresent()) {
        	Book thisBook = optionalBook.get();
        	thisBook.setTitle(book.getTitle());
        	thisBook.setDescription(book.getDescription());
        	thisBook.setLanguage(book.getLanguage());
        	thisBook.setNumberOfPages(book.getNumberOfPages());
        	
        	return bookRepository.save(thisBook);
        	
        } else {
            return null;
        }
    }
}
