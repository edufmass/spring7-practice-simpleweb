package ar.edufmass.springwebapp.services;

import ar.edufmass.springwebapp.domain.Book;
import ar.edufmass.springwebapp.repositories.BookRepository;

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
