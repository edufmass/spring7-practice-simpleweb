package ar.edufmass.springwebapp.repositories;

import ar.edufmass.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
