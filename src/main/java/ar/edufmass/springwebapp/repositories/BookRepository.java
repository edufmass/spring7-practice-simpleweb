package ar.edufmass.springwebapp.repositories;


import ar.edufmass.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
