package software.robsoncassiano.learn.thompsonexample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import software.robsoncassiano.learn.thompsonexample.entities.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
