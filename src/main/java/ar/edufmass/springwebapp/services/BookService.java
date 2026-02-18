package ar.edufmass.springwebapp.services;

import ar.edufmass.springwebapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
