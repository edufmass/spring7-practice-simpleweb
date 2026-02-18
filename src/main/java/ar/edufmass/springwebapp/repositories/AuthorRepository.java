package ar.edufmass.springwebapp.repositories;


import ar.edufmass.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}