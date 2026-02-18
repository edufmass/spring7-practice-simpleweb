package ar.edufmass.springwebapp.services;

import ar.edufmass.springwebapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
