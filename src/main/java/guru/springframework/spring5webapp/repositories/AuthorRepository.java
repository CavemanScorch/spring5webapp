package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by DW 06/15/20
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
